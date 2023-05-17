import java.util.Scanner;

class myworld {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word :");
        int num = sc.nextInt();
        int sum = 0,rev;
        int temp = num;
        while(num>0){
            rev= num % 10;
            sum = (sum*10)+rev;
            num = num/10;
        }
        if(temp == sum){
            System.out.print("The Number is Palindrome");
        }
        else{
            System.out.print("The Number is Not Palindrome");
        }
        sc.close();
    }
    
}
