import java.util.*;
public class CellPhoneService {
    public static void main (String args[]) {
        // Write your code here
        int minutes;
        int messages;
        int gigs;
        int planA=49;
        int planB=55;
        int planC=61;
        int planD=70;
        int planE=79;
        int planF=87;
        

        Scanner in=new Scanner(System.in);
        System.out.println("Enter talk minutes needed ");
        minutes=in.nextInt();
        System.out.println("Enter text messages needed ");
        messages=in.nextInt();
        System.out.println("Enter gigabytes of data needed ");
        gigs=in.nextInt();

        if (minutes<500 && messages==0 && gigs==0)
        {
            System.out.println("plan A is $"+planA+" per month");

        }
        else 
        if (minutes<500 && messages>0 && gigs==0)
        {
            System.out.println("plan B is $"+planB+" per month");
        }
         else 
        if (minutes>=500 && messages<100 && gigs==0)
        {
            System.out.println("plan C is $"+planC+" per month");
        }
         else 
        if (minutes>=500 && messages>=100 && gigs==0)
        {
            System.out.println("plan D is $"+planD+" per month");
        }
         else
        if (minutes>=0 && messages>=0 && gigs<3)
        {
            System.out.println("plan E is $"+planE+" per month");
        }
        else
        if (minutes>=0 && messages>=0 && gigs>=3)
        {
            System.out.println("plan F is $"+planF+" per month");
        }







    }
}
