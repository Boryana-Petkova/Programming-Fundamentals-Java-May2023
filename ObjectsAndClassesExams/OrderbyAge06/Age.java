package OrderbyAge06;

public class Age {


    private String name;

    private String ID;
    private int age;

    public Age(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }
    public String getName() {

        return this.name;
    }
    public String getID() {

        return this.ID;
    }
    public int getAge() {

        return this.age;
    }
}
