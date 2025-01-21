class A {
    public void show(){
        System.out.println("THis is A");
    }
}
class B extends A{
    public void show(){
        System.out.println("This is B");
    }
}
class C extends A{
    public void show(){
        System.out.println("This is C");
    }
}
public class Poly {
    public static void main(String[] args) {
        //this is s runtie polymorphism because the method to be called will only at runtime.
        A obj=new A();
        obj.show();
        obj=new B();
        obj.show();
        obj=new C();
        obj.show();
    }
}

//Polymorphism- copile time(early binding)besically the behaviour is defined at runtime.-runtime Polymorphism (late binding) the behaviour is defined at runtime.