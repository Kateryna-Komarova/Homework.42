package task_01;

public class Bee {
    private String name;
    private int age;
    private String role;

    public Bee(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void buzz() {
        System.out.println(name + " is buzzing!");
    }

    public void collectHoney() {
        System.out.println(name + " is collecting honey!");
    }

    @Override
    public String toString() {
        return "{Bee name = " + name + ", age= " + age + ", role= " + role + "}";
    }
}