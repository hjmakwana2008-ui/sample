import java.util.Scanner;

class bhavy {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first num:");
        int a= sc.nextInt();

         System.out.println("enter second num:");
        int b= sc.nextInt();

         System.out.println("enter third num:");
        int c= sc.nextInt();

        int max = a;

        if(b > max){
            max = b;

        }
        if(c > max){
            max = c;
        }

        System.out.print("max value is :"+max);
    }
}