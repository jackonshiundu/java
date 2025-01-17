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
public class Classes{
    public static void main(String a[]) {
        Calculator calc=new Calculator();
        int results=calc.add(4,5,5);
        System.out.println(results);

        //arrays
        //Creatign an array syntax 1
        int nums[]={3,5,8,9};
        //re assigning
        nums[1]=10;
        //creatign An Array syntax 2
        int nums2[]=new int[5];
        //Before reassigning the values are 0
        nums2[0]=89;
        nums2[1]=2;
        nums2[2]=3;
        nums2[3]=9;
        nums2[4]=39;
        for(int i=0;i<=4;i++){

            System.out.println(nums2[i]);
        }
        //Multi Dimension Arrays
        int multiDimenArray [][]=new int [3][4];
        //Initializing the values dynamically
        for(int  i=0;i<3;i++){
            for(int j=0;j<4;j++){
                multiDimenArray[i][j]=(int)(Math.random()*100);

            }
        }
        //Printing the values
        for(int  i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(multiDimenArray[i][j]+" ");
            }
            System.out.println();
        }
        //Enhanced Loop
        for(int n[]:multiDimenArray){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.err.println();
        }
    }
}
