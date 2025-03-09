import java.util.Scanner;
class q2{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
       /* // 1.get i/p from user, for the variable called RCB.if RCB == win print-Ee sala cup namadhey,if loose print cup illa.
        String RCB=scan.nextLine();
        if (RCB.equals("win"))
        {
        System.out.println("Ee sala cup namadhey");
        }
        else{
        System.out.println("cup illa");
        }*/
       //2.if meghana is "dead" print- surya meets ramya else print-surya weds meghana
      /* String meghana=scan.nextLine();
       if(meghana.equals("dead")){
        System.out.println("surya meets ramya");
       }
       else{
        System.out.println("surya weds meghana");
       }*/
      //3.if mark >35 print pass else print fail
      /*int mark=scan.nextInt();
      if(mark>34){
        System.out.println("pass");
      }
      else{
        System.out.println("fail");
      }*/
     //4.if income is lesser than 9000 schlorship is eligible else not eligible
    /* int income=scan.nextInt();
     if (income<9000){
        System.out.println("schlorship is eligible");
     }
     else{
        System.out.println("not eligible");
     }*/
    //5.check number is LCM/multiple/divisible by a 3 and 5.
    /*System.out.println("Enter number: ");
    int num=scan.nextInt();
    if (num%3==0 && num%5==0){
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }*/
   //6.check number is even or odd
   int num=scan.nextInt();
   if(num%2==0){
    System.out.println("even");
   }
   else{
    System.out.println("odd");
   }
   }
}