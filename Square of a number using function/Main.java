import java.util.Scanner;
class Main
{
   public static int sum_of_digits(int num)
   {
     int s;
      s=num*num;
      return s;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int total;
     total=sum_of_digits(n);
     System.out.println(total); //result printed here
   }
}
