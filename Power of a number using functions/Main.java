import java.util.Scanner; 
class Main{ 
  public static int pow(int num1,int num2) 
  { 
    int sum=1,i; 
   for(i=1;i<=num2;i++) 
   { sum=sum*num1; 
   } return sum; 
  } 
  public static void main (String[] args){ 
    // Type your code here 
    Scanner in =new Scanner(System .in); 
    int n1=in.nextInt(); 
    int n2=in.nextInt(); 
    int total; total=pow(n1,n2); 
    System.out.println(total); 
  }
}
