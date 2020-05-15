package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
 String Score = JOptionPane.showInputDialog(null,"What was the score you got on your last test?");
	double Score1 = Double.parseDouble(Score);
	if (Score1 >=75) {
	JOptionPane.showMessageDialog(null,"Hey that's a pretty good score!");
	}
	if (Score1 <75) {
		JOptionPane.showMessageDialog(null,"Hey that's pretty bad!");
	}
	System.out.println(Score1);
}
}
