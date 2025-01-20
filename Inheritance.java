class Calc {
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int subtract(int n1,int n2){
        return n1-n2;
    }
}
//single level Inheritance-just 2
class AdvancedCalc extends Calc {
    public int multiply(int n1, int n2){
        return n1*n2;
    }
    public int devide(int n1, int n2){
        return n1/n2;
    }

}
//multilevel Inheritance-more that 2
class AveryAdvancedCalc extends AdvancedCalc{
    public int power(int n1,int n2){
        return (int) Math.pow(n1, n2);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Calc op0=new Calc();
        AdvancedCalc op1=new AdvancedCalc();
        AveryAdvancedCalc op2=new AveryAdvancedCalc();
        int r0=op0.subtract(20, 5);
        int r1=op1.add(9, 6);
        int r2=op2.power(20, 4);
        System.out.println(r0+ " "+r1 + " "+ r2);
    }
}
//parent class -child class
//super class -sub class
//base class- derived class