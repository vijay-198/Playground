import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
       Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int temp;
      int c=1;
      for(temp=1;temp<=n;temp++)
      {
        if(c%2==1)
        {
          System.out.println(c);
          temp--;
        }
        c++;
      }
	}
}