package seminar_4;

public class Shield implements Protection{
    private String protectName;
    private int protectPoint;

    public Shield(String protectName, int protectPoint) {
        this.protectName = protectName;
        this.protectPoint = protectPoint;
    }

    @Override
    public int protect() {
        return protectPoint;
    }

    @Override
    public String toString() {
        return "Shield{" +
                "protectName='" + protectName + '\'' +
                ", protectPoint=" + protectPoint +
                '}';
    }
}
