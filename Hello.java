class Hello {
    public static void main(String a[]){
        int num1 = 10;
        int num2 = 3;
        int results =num1 + num2;
        System.out.println(results);
        /*
        diffrent types of datatypes
        primitives
        int-byte(-2^7-2^7-1),short,int,long
        float-float,double
        boolean
        char
         *
         * Type Conversion
         *
         */
        int x = 257;
        byte y=124;
        y=(byte) x;
        //casting
        x=y;
        float z = 3.4f;
        //explicit Conversion
        x=(int)z;
        System.out.println(x);

        //type promotion -basically teh result of multiplying  byte with a byte teh result is promoted to int
         byte j=10;
         byte k=30;

         int resultss=j*k;

         System.out.print(resultss);
    }
}