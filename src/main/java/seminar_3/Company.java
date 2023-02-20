package seminar_3;

import java.util.*;

public class Company implements Iterable<User>{
    private User user;
    public Company(User user) {
        this.user = user;
    }

    private List<User> getSubUsersDeep(User user){
        List<User> users = new ArrayList<>();
        users.add(user);
        if (!user.getPersonal().iterator().hasNext()){
            return users;
        }
        for (User subuser : user.getPersonal()){
            users.addAll(getSubUsersDeep(subuser));
        }

        return users;
    }

    private List<User> getSubUsersWide(User user){
        List<User> users = new ArrayList<>();
        Queue<User> userQueue = new ArrayDeque<>();
        userQueue.offer(user);
        while (userQueue.size() > 0){
            User userItem = userQueue.poll();
            users.add(userItem);
            for (User subUser : userItem.getPersonal()){
                userQueue.offer(subUser);
            }
        }

        return users;
    }

    @Override
    public Iterator iterator() {
        List<User> users = getSubUsersWide(user);
        users.add(user);
        return users.iterator();
    }
}
