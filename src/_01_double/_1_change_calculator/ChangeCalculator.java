package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String ben = JOptionPane.showInputDialog(null, "how many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int benjamin = Integer.parseInt(ben);
		// Ask the user how many dimes they have, and convert their answer
		String dom = JOptionPane.showInputDialog(null, "how many dimes do you have?");
		int dominic = Integer.parseInt(ben);
		// Ask the user how many quarters they have, and convert their answer
		String sam = JOptionPane.showInputDialog(null, "how many quarters do you have?");
		int samuel = Integer.parseInt(ben);
		// Calculate how much money the user has.  Hint: Use a double variable 
       double money = (benjamin*0.05 + dominic*0.1 + samuel*0.25);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
       JOptionPane.showMessageDialog(null,"you have precisely $"+money+"");
	}
}

