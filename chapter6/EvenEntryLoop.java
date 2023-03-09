import java.util.*;
public class EvenEntryLoop {
    public static void main (String args[]) {

        int num;
        int test;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an even number: ");
        num=input.nextInt();

        while (num!=999)
        {
            if (num%2==0)
            {
                 System.out.println("Good Job!");
            System.out.println("Enter an even number: ");
            num=input.nextInt();

            }
           
            else
            if(num%2!=0) {
                 
            System.out.println(num+" is not an even number");
           
            System.out.println("Enter an even number: ");
            num=input.nextInt();
            }
               
           

            
                
            
        }

       
        
        
           
        
    }
}

