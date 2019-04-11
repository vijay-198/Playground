import java.util.Scanner;
class Main {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
		int n=s.nextInt();

        int arr[]=new int[n];
      int currentIndex=0;

        for(int i=0;i<n;i++)
        {//for reading array
            arr[i]=s.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
           //4
            if (arr[i] != 0) {
                arr[currentIndex] = arr[i];
                currentIndex++;
            }
        }
        //5
        while (currentIndex < arr.length) {
            arr[currentIndex] = 0;
            currentIndex++;
        }
        //6
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
