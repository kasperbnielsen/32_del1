package DiceGame;

/**
 * 
 */

import java.util.Scanner;

/**
 * @author Stonecore
 *
 */
public class game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String Name1, Name2;
		Scanner indput = new Scanner(System.in);
		System.out.println("Enter name for player 1");
		Name1 = indput.next();
		System.out.println("Enter name for player 2");
		Name2 = indput.next();
		User p1 = new User(Name1);
		User p2 = new User(Name2);
		indput.close();

		Raffle cup = new Raffle();
		int i = 1;
		int[] eyes=new int[2];
		Rules rules_check = new Rules();
		do {
			cup.raffle();
			eyes = cup.raffle();
			Dice temp = new Dice();
			System.out.println(temp.Dice());
			rules_check.CheckRules(eyes);

			i++;
			if (i > 2)
				i = 1;
		} while (p1.getwinner() == false && p2.getwinner() == false);
	}

}