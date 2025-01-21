class A{
    public A(){
        System.out.println("in A ");
    }
    public A(int n){
        System.out.println("in A " + n);
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("in B ");
    }
    public B(int n){
        //we use super to cann a parennt parametarised constructor.
        //super(n);
        //this() executes constructor of the same class.
        this();
        System.out.println("in B " + n);
    }
}

class Demo {
    public static void main(String[] args) {
        B r1=new B(4);
    }
}

//so basically for child components it calls the super that why the parent value prints first then  that constructor value.