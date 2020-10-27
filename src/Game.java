import java.util.Scanner;

public class Game {

    public static void main(String[] args) throws Exception {


        // velkommen til spillet
        // print regler
        // indtast navne på spillere



// skal være i en while lykke for ikke at chrashe når man skrivere mere end 12
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
