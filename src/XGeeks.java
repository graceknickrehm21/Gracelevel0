
// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String grace = "Invisibility";
		String jack = " the ability to fly";
		String will = " teleportation ";

		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("Enter your name");

		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (name.equals("grace")) {
			JOptionPane.showMessageDialog(null, "Your superpower is " + grace);
			
		} else if (name.equals("jack")) {
			JOptionPane.showMessageDialog(null, "Your superpower is" + jack);
			
		}
		else if (name.equals("will")){
		JOptionPane.showMessageDialog(null, "Your superpower is" + will);}
	
		else {
			JOptionPane.showMessageDialog(null, "The name you put in was not recognized. You do not have a superpower");

		}
	}}
