import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the number");
         int M = scanner.nextInt();
         
         if((M % 3) == 0 && (M % 5) == 0){
             System.out.print("Good number");
         }
         else if(M % 3 == 0){
             System.out.print("Bad number");
         }
        else if(M % 5 == 0){
             System.out.print("Poor number");
         }
        else {
             System.out.print("this number is cant multiple of both 3 and 5 ");
        }
        scanner.close();
    }
}