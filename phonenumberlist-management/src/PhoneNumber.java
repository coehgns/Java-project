public class PhoneNumber {
    private String name;
    private int phoneNum;
    private String email;
    private int id;

    public PhoneNumber(String name, int phoneNum, String email, int id) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.id = id;
    }

    public int getId() { return id;}


    @Override
    public String toString() {
        return "PhoneNumber{" +
                "name='" + name + '\'' +
                ", phoneNum=" + phoneNum +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
