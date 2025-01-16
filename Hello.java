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

         /*
          * Arithemtic operations
          int num=4;
          num++ post Increment  fetches then Increments
          ++num pre increment increment then fetches
          */

          /* Relational Operators
           *
           * <>less and grater that
           * !=not equal to
           * == equal to
           */

           /*Logic Operators
            *And &
            Or |
            Not !s
            Short Cercuits && || !
            */

            int r=3;
            int t=4;
            int u=10;
            boolean outCome=r<t && r<u ;

            System.out.println(outCome);

            /* Ternary Operatorss
             */

             int n=4;
             int p =0;
             p= n%2==0?10:11;
             System.out.println(p);

             /* Switch Statement
              */
              int q=1;

              switch (q) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Thurday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                default:
                    System.out.println("No Day");
                    break;
              }

              /*
               *Loops
               */
              /*
               * While Loop
               */

               int f=2;
               while(f<=4){
                System.out.println("Hi " + f);
                f++;
               }
               /*
                * Do While Loop
                */
                int o=1;
                do{
                    System.out.println("Hello"+o);
                    o++;
                }while(o<1);

                /*
                 * For Loop
                 */

                 for(int m=1;m<=5;m++){
                    System.out.println("Day" + m);
                    int time=1;
                    for(;time<9;){
                        System.out.println("Time" + (time+8) +"-"+(time+9));
                        time++;

                    }
                 }

    }
}