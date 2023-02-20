package seminar_3;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Anton", "Petrov", 33);
        User user2 = new User("Ivan", "Ivanov", 25);
        User user3 = new User("Anton", "Petrov", 74);
        User user4 = new User("Roman", "Nikolaev", 19);
        User user5 = new User("Dmitri", "Andreev", 39);
        User user6 = new User("Semen", "Romanov", 54);

        Personal personal = new Personal(List.of(user1, user2, user3, user4, user5, user6));

//        for (User user : personal){
//            System.out.println(user);
//        }

        System.out.println("----------------");

        List<User> users = personal.toList();

        Collections.sort(users);

//        for (User user : users){
//            System.out.println(user);
//        }

        System.out.println("-----------------------------------------------------------------");

        User boss = new User("Will", "Smith", 50);
        User cto = new User("Bill", "White", 36);
        User ceo = new User("Joe", "Black", 39);
        User manager1 = new User("Jane", "Air", 28);
        User manager2 = new User("Bella", "Green", 30);
        User manager3 = new User("Alex", "Bright", 20);

        Personal managers1 = new Personal(List.of(manager1, manager2));
        Personal managers2 = new Personal(List.of(manager3));
        Personal chiefs = new Personal(List.of(cto, ceo));
        boss.setPersonal(chiefs);
        cto.setPersonal(managers1);
        ceo.setPersonal(managers2);

        Company company = new Company(boss);
        for (Object user : company){
            System.out.println(user);
        }
    }
}
