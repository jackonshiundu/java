class Human{
    private String name;
    private int age;
    //Getter Method
    public String getName() {
        return name;
    }
    //setter method
    public void setName(String name) {
        this.name = name;
    }
    //getter Method
    public int getAge() {
        return age;
    }
    //setter method
    public void setAge(int age) {
        this.age = age;
    }






}

public class Encapsulation {
    public static void main(String[] args) {
        Human Person =new Human();
        Person.setAge(24);
        Person.setName("John Doe");
        System.out.println(Person.getAge());
        System.out.println(Person.getName());
    }
}
