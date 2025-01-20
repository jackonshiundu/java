class Human{
    private String name;
    private int age;

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
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
