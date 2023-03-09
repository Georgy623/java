import java.util.Scanner;
public class CountByAnything

{
   // Modify the code below
   public static void main (String args[])
   {
      int START;
      final int STOP=500;
      int NUMBER_PER_LINE = 0;

      Scanner input=new Scanner(System.in);
      System.out.println("Enter start number: ");
     START=input.nextInt();
     

      for(int i = START; i <= STOP; i += START)
      {
         System.out.print(i + "  ");
         NUMBER_PER_LINE++;


         if(NUMBER_PER_LINE % 10 == 0)
            System.out.println();
      }
   }
}

