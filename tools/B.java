package tools;
public class B extends A{
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
