package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String N = JOptionPane.showInputDialog("How many nickels do you have?");
double N1 = Double.parseDouble(N);
double N2 = N1 * 5;
		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer
String D = JOptionPane.showInputDialog("How many Dimes do you have?");
double D1 = Double.parseDouble(D);
double D2 = D1 * 10;
String Q = JOptionPane.showInputDialog("How many quarters do you have?");
double Q1 = Double.parseDouble(Q);
double Q2 = Q1 * 25;
double Money = (D2 + Q2 + N2);
double Money1 = Money/100;
JOptionPane.showMessageDialog(null, "Here is how much money you have! " + Money1);
		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

