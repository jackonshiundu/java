class Human{
    private String name;
    private int age;
     String Address;
     String Job;
    //Constructor method-has to look like your name. it desnt return anything
    //defauult COnstructor
    public Human(){
        Address="Kakamega 00100";
    }
    //Parameterised COnstructor
    public Human(String Address){
        this.Address=Address;
    }
    //Constructor Overloading
    public Human(String Address, String job){
        this.Address=Address;
        this.Job=job;

    }
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
        Human Person1 =new Human("Nairobi 00100");
        Human Person2 =new Human("Mombasa 00100","Software Developer");
        Person.setAge(24);
        Person.setName("John Doe");
        System.out.println(Person.getAge());
        System.out.println(Person.getName());
        //gettign the Address
        System.out.println(Person.Address);
        System.out.println(Person1.Address);
        System.out.println(Person2.Address);
        System.out.println(Person2.Job);
    }
}
