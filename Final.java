
//final-you use it variables to make it costant you use it with method to avoid overriding and we use it with classes to avoid inheritance.
class A {
    public final void show(){
        System.out.println("This is showing Hello A");
    }
    public void hello1(){
        System.out.println("Prited Hello in A");
    }

}
class B extends A {
    //in this i will have an error because the show varuable cannont be overrriden
  /*   public  void show(){
        System.out.println("This is showing Hello A");
    } */
    public void hello2(){
        System.out.println("Prited Hello in B");
    }

}
public class Final {
    public static void main(String[] args) {
        final int num=9;
        //it will also give me an error because you cannot ovverride final variables.
        //num=8;
        //upcasting and downcasting
        //this is upcastign because we are converting object B into A whitch is aslo automatically done
        A  obj=(A) new B();
        obj.hello1();

        B obj1=(B) obj;
        //now after casting that when we can print the hello2() method in class B
        obj1.hello2();
        //Wrapper classes
        int num0=90;
        Integer num1=8;
        //Boxing Basically taking a primitive value and adding it in the Integer(Wrapper object) as a parameter.
        Integer num2=new Integer(num0);
        //unBosing the reverse process of boxing
        int num3=num2.intValue();
        //Auto-unboxing
        int num4=num2;
        System.out.println(num1);
        //some features provided by parse int
        String str="35";

        int num5=Integer.parseInt(str);

        System.out.println(num5*4);
    }
}
