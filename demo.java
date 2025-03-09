//Datatype  
import java.util.Scanner;
class demo{
    public static void main (String args [])
    {
       /* byte a=127;
        System.out.println(a);
        char b='x';
        System.out.println(b);
        String c="hello";
        System.out.println(c.charAt(0));
        boolean d=true;
        boolean e=false;
        System.out.println(d);
        System.out.println(e);
        // if else in java
        boolean rain=true;
        if(false)
        {
            System.out.println("take an umberella");
        }
        else{
            System.out.println("enjoy the sunlight");
        }
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();*/
        //checking greater number
       /* if(num1>num2){
            System.out.println("num1 is greater than num2");
        }
        else{
            System.out.println("num 2 is greater than num1");
        }*/
        // checking equal
        /*if(num1==num2){
            System.out.println("both are equal");
        }
        else{
            System.out.println("not equal");
        }*/
       String a="orange";
       String b="orange";
       System.out.println(a==b);
       String c=new String("apple");
       String d=new String("apple");
       System.out.println(c==d);  
       System.out.println(c.equals(d));
       String f=b;
       System.out.println (a==f);
       String e=d;
       System.out.println(c==e);
       System.out.println(c.equals(e));

       }
}