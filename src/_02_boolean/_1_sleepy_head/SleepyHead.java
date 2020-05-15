package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         */
        int answer =  JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         if (answer == 0) {
        	 isWeekday = true;
         }
         else {
        	 isWeekday = false;
         }
         int answer1 =  JOptionPane.showConfirmDialog(null, "Is it a vacation", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         if (answer1 == 0) {
        	 isVacation = true;      	 
         }
         else {
        	 isVacation = false;
         }
         if (isWeekday == false || isVacation == true ) {
        	 System.out.println("Sleep in");
         }
         if(isWeekday == true) {
        	 System.out.println("Get up lazybones");
         }
         if(isWeekday == true && isVacation == true) {
        	 System.out.println("Sleep in");
         }
        /*
         * Print "sleep in"? if it is a vacation or a weekend. 
         * If it's a weekday, print "get up lazybones!"? 
         * If it's a weekday, but we are on vacation,  print "sleep in"?.
         */
    }
}
