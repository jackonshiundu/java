class Calculator{
    int a;
    public int add(int n1,int n2){
        int r=n1+n2;
        return r;
    }
}
public class Classes{
    public static void main(String a[]) {
        Calculator calc=new Calculator();
        int results=calc.add(4,5);
        System.out.println(results);
    }
}
