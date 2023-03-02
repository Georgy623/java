import java.util.*;
import java.time.*;
public class PastPresentFuture {
    public static void main (String args[]) {
        // Write your code here
        LocalDate today = LocalDate.now();
      int month;
      int day;
      int yr;
      int todayMonth;
      int todayDay;
      int todayYr;
      Scanner input = new Scanner(System.in);
      todayMonth = today.getMonthValue();
      todayDay = today.getDayOfMonth();
      todayYr = today.getYear();
      System.out.print("Enter a month >> ");
      month = input.nextInt();
      System.out.print("Enter a day >> ");
      day = input.nextInt();
      System.out.print("Enter a year (four digits) >> ");
      yr = input.nextInt();
      if(yr != todayYr)
         System.out.println(yr + " is not this year");
      else
         if(month < todayMonth)
            System.out.println(month + " was a month earlier this year");
         else
            if(month > todayMonth)
               System.out.println(month + " is a month later this year");
            else
               System.out.println(month + " is this month");
    }
}


