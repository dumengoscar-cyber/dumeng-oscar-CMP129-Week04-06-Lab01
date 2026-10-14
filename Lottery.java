// name: oscar dumeng 
// date: 10/13/2026
// course: cmp129
// lab: 1
// week: 4-6
import java.util.Scanner;
import java.util.Random;
public class Lottery {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        //makes lottery 
        int[] lottery = new int[5];
        int[] user = new int[5];

        //makes random numbers
        for( int i = 0; i < 5; i++) {
            lottery[i] = random.nextInt(10);
        }

        //asks for 5 digits
        for(int i = 0; i < 5; i++){

            while (true){
                System.out.println("enter lottery numbers" + (i + 1) + "0-9: ");
           
           if (keyboard.hasNextInt()) {
            int digit = keyboard.nextInt();

            if (digit >= 0 && digit <= 9) {
                user[i] = digit;
                break;
            } else { 
                System.out.println("invalid digit,enter number from 0-9");
            }
           } else { 
            System.out.println("invalid, enter digit from 0-9");
            keyboard.next();
           }
            }
        }
        //count digits 
        int matches = 0;

        for (int i = 0;i < 5; i++){
            if (lottery[i] == user[i]) {
                matches++;
            }
        }
        //display numbers
        System.out.println("lottery numbers: ");
        for (int i = 0; i < 5; i++){
            System.out.println(lottery[i] + " ");
        }
        //display user numbers 
        System.out.println("\n matching digits: " + matches);

        //checks
        if (matches == 5) {
            System.out.println("you are the winner");
        }
        keyboard.close();
    }
}