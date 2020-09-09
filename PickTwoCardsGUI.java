// Chapter Three - Game Zone (Pages 166-167)

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PickTwoCardsGUI extends JFrame implements ActionListener
{

	// GUI components for this class
	Font theFont = new Font("Helvetica", Font.ITALIC, 24);
	Color theColor = new Color(50, 200, 250);
	JLabel theTitle = new JLabel("Pick Two Cards Game");
	JLabel comCard = new JLabel("The computer's card is: ");
	JLabel comResult = new JLabel("");
	JLabel playCard = new JLabel("Your card is ");
	JLabel playResult = new JLabel("");
	JLabel finalResult = new JLabel("");
	JButton button = new JButton("Draw!");

	// Constructor method for this class
	public PickTwoCardsGUI()
	{
		// Use the JFrame constructor to construct an item in this class
		super("Two Cards GUI");
		setBounds(600, 380, 300, 250);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setVisible(true);

		// Customize and then add the GUI
		getContentPane().setBackground(theColor);
		theTitle.setFont(theFont);

		add(theTitle);
		add(comCard);
		add(comResult);
		add(playCard);
		add(playResult);
		add(button);
		add(finalResult);

		// Add the event listener to the button
		button.addActionListener(this);

	}

	// Event handler method
	@Override
	public void actionPerformed(ActionEvent e)
	{
		playGame();
	}

	public void playGame()
	{
		// Variables and constants
		final int CARDS_IN_SUIT = 13;
		int comValue;
		int userValue;
		String msg;
		Card comCard = new Card();
		Card userCard = new Card();

		// Calculation phase
		
		comValue = ( (int)(Math.random() * CARDS_IN_SUIT + 1) );
		userValue = ( (int)(Math.random() * CARDS_IN_SUIT + 1) );

		comCard.setValue(comValue);
		userCard.setValue(userValue);

		// Update this with arrays later!
		String[] cardSuits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		comCard.setSuit(cardSuits[(int)(Math.random() * 4)]);
		userCard.setSuit(cardSuits[(int)(Math.random() * 4)]);

		// Determine the winner
		if(comCard.getValue() > userCard.getValue())
		{
			msg = "Sorry, the computer has won.";
		}
		else
		{
			if(comCard.getValue() < userCard.getValue())
			{
				msg = "Congratulations, you win!";
			}
			else
			{
				msg = "It's a tie!";
			}
		}

		// Output phase
		comResult.setText(comCard.getValue() + " of " + comCard.getSuit());

		playResult.setText( userCard.getValue() + " of " + userCard.getSuit());
		finalResult.setText(msg);

	}

	public static void main(String[] args) 
	{
		PickTwoCardsGUI frame1 = new PickTwoCardsGUI();
	}
}