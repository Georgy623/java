import java.util.Scanner;
public class Inbetween {
    public static void main (String args[]) {
        // Write your code here

        int x;
        int y;
        int dif;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer >> ");
        x=input.nextInt();
        System.out.println("Enter another integer >> ");
        y=input.nextInt();
        dif=y-x;

        if (dif<=1)
        {
            System.out.println("There are no integers between "+x+" and "+y);
        }
        else
        {
            System.out.println("the numbers between "+x+" and  "+y+" include");
             for (int i=y;i>x;--i)
        {
            System.out.println(" "+i);

        }
            
        }
        
          


      



       
    }
}


