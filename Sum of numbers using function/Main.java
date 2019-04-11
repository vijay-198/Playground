import java.util.Scanner;
class Main
{
   public static int sum_of_digits(int num)
   {
     int s=0,i;
     for(i=1;i<=num;i++)
     {
       s=s+i;
     }
      
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