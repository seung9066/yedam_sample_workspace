package homework;

public class Member_override_toString {
    private String id;
    private String name;

    public Member_override_toString(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " : " + name;
    }
}
