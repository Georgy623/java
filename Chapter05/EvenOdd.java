import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number >> ");
        num=input.nextInt();
        isEven(num);
        // Write your code here
    }
    public static boolean isEven(int number) {
        number=number;
        if (number % 2==0){
            System.out.println(number +" is even");
            

        }
        else{
            System.out.println(number+" number is odd");
        }
        return false;
       

    }
}
