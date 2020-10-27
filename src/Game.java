import java.util.Scanner;

public class Game {

    public static void main(String[] args) throws Exception {


            Scanner sc = new Scanner(System.in);
            System.out.println("Write number of dice sides");

            int diceSides = sc.nextInt();
            Dice dice1 = new Dice(diceSides);
            Dice dice2 = new Dice(diceSides);


        dice1.roll();
        dice2.roll();

        System.out.println(dice1.getFaceValue());
        System.out.println(dice2.getFaceValue());



    }

}
