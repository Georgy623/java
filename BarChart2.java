import java.util.Scanner;
public class BarChart2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int artPoints;
        int bobPoints;
        int calPoints;
        int danPoints;
        int eliPoints;
        final int AMT_EACH_ASTERISK = 10;
        System.out.println("Enter points earned for the season");
        System.out.print("    by Art >> ");
        artPoints = input.nextInt();
        System.out.print("    by Bob >> ");
        bobPoints = input.nextInt();
        System.out.print("    by Cal >> ");
        calPoints = input.nextInt();
        System.out.print("    by Dan >> ");
        danPoints = input.nextInt();
        System.out.print("    by Eli >> ");
        eliPoints = input.nextInt();
        System.out.println("\nPoints for Season (each asterisk represents " +
                           AMT_EACH_ASTERISK + " points)\n");
        drawChart("Art",artPoints,10);
        drawChart("Bob",bobPoints,10);
        drawChart("Cal",calPoints,10);
        drawChart("Dan",danPoints,10);
        drawChart("Eli",eliPoints,10);
    }
    public static void drawChart(String name, int points, int amt_each) 
    {
        System.out.print(name + "\t");
        for(int i = 1; i <= points/amt_each; ++i)
            {
                System.out.print("*");
            }
        System.out.println();
    }
}
