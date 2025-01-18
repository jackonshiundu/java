class Calculator{
    int a;
    public int add(int n1,int n2){
        int r=n1+n2;
        return r;
    }
    //Method Overloading
    public int add(int n1,int n2,int n3){
        int r=n1+n2 +n3;
        return r;
    }

    public double add(double n1,int n2,int n3){
        double r=n1+n2 +n3;
        return r;
    }
}
class Person{
    int age;
    String name;
    static String Address;
    static{
        Address="Nairobi 00100";
    }
    //Static Variables are shared by all the objects. and those static Variavles should be classed by their class name not objects instance name.
    public  void show() {
        System.out.println(name + " " + age +" " +Address);
    }
    //static Methods-you can call static methods directly with the Class name unline non-static Methods . You cannot use a non-static variable in a static method only ststic variables. if you are using that make sure you refee to it.
    public static void show1(Person Obj){
       System.out.println(Obj.name + " " + Obj.age+" "+Address);
    }
}
public class Classes{
    public static void main(String a[]) {
        Calculator calc=new Calculator();
        int results=calc.add(4,5,5);
        System.out.println(results);

        Person p = new Person();
        p.name="Jerry";
        p.age=24;

        Person.show1(p);
    }
}



