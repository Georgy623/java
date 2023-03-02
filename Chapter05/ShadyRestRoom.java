import java.util.Scanner;
public class ShadyRestRoom {
    public static void main (String args[]) {
        // Write your code here
        int queen=125;
        int king=139;
        int suite=165;
        int userChoice;
        int invalid=0;

        System.out.println("(1) queen bed\n(2) king\n(3) Suite with a king bed adn and pull-out couch" );
        Scanner input=new Scanner (System.in);
        System.out.println("Enter Selection (1,2, or 3)");
        userChoice=input.nextInt();

        if (userChoice==1){
            System.out.println("you selected Queen bed $"+queen);
        }
        else
        if(userChoice==2){
            System.out.println("you selected King bed $"+king);

        }
        else
        if(userChoice==3){
            System.out.println("You selected Suite $"+suite);
        }
        else{
            System.out.println("you have selected an invalid option $"+invalid);
        }

    }
}
