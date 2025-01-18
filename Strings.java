public class Strings {
    public static void main(String a[] ) {
        String name = "Jackon";

        System.out.println(name);
        //by default string s are immutable and  if  you reassign a value to them the string new string creates a new heap memory with the new value the the assign value will point to.

        //mutable Strings'

        StringBuffer namer= new StringBuffer("Hello Namer");
        //once you create a string Buffer ou have some methods you can use on the string to murtate it the way you want i.e
        namer.insert(7,"Java");
        System.out.println(namer.append("Jackon"));
        //to convert an buffer back to a string
        String btos=namer.toString();
    }
}
