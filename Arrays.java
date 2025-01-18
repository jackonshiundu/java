import java.lang.reflect.Array;
class Student{
    int rollNo;
    String name;
    int marks;

}
public class Arrays {
    public static void main(String[] args) {
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
        //Jagged Array

        int numArrays[][]=new int[3][];
        numArrays[0]=new int [3];
        numArrays[1]=new int [6];
        numArrays[2]=new int [4];
        for(int i=0;i<numArrays.length;i++){
            for(int j=0;j < numArrays[i].length;j++){
                numArrays[i][j]=(int)(Math.random()*100);
            }
        }

        for(int n[]:numArrays){
            for(int m:n){
                System.out.print( m+" ");
            }
            System.out.println();
        }

        //enhanced For loop

        Student s1=new Student();
        s1.rollNo=1;
        s1.name="Jackon";
        s1.marks=70;
        Student s2=new Student();
        s2.rollNo=2;
        s2.name="Mark";
        s2.marks=50;
        Student s3=new Student();
        s3.rollNo=3;
        s3.name="Martin";
        s3.marks=20;

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s2;
        for (Student stud:students){
            System.out.println(stud.name + " " + stud.marks);
        }
    }
}
