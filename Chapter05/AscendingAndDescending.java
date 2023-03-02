import java.util.Scanner;
import java.util.Arrays; 
import java.util.Collections;   

public class AscendingAndDescending {
    public static void main(String[] args) {
        // Write your code here
        int int1;
        int int2;
        int int3;
        int low;
        int med;
        int high;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer... ");
        int1=input.nextInt();

        System.out.println("Enter another...  ");
        int2=input.nextInt();

        System.out.println("And just one more...  ");
        int3=input.nextInt();
        input.nextLine();

        if (int1<=int2 && int1<= int3)
        {
            low=int1;
            if(int1<=int3)
            {
                med=int2;
                high=int3;

            }
            else
            {
                med=int3;
                high=int2;
            }
        }
        else
        {
            if (int2<=int1 && int2<=int3)
            {
                low=int2;
                if(int1<=int3)
                {
                    med =int1;
                    high=int3;
                }
                else
                {
                    med=int3;
                    high=int1;
                }
            }
        else 
        {
            low =int3;
            if(int1<=int2)
            {
                med=int1;
                high=int2;

            }
            else
            {
                med=int2;
                high=int1;

            }
        }
     }

        System.out.println("Asending: "+low+" "+med+" "+high);
        System.out.println("Asending: "+high+" "+med+" "+low);



}
}
