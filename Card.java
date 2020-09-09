// Chapter 3 - Game Zone (Pages 166-167)

public class Card
{
	// Data field variables for this class
	private String suit;
	private int value;
	private String rank;

	// Mutator (setter) methods for this class
	public void setSuit(String s)
	{
		suit = s;
	}

	public void setValue(int v)
	{
		value = v;


		// Set the rank data field based off value


		switch(value)
		{
			case 1:
			{
				rank = "Ace";
				break;
			}

			case 11:
			{
				rank = "Jack";
				break;
			}

			case 12:
			{
				rank = "Queen";
				break;
			}

			case 13:
			{
				rank = "Ace";
				break;
			}

			default:
			{
				rank = Integer.toString(value);
				break;
			}
		}
	}

	// Accessor (getter) methods for this class
	public String getSuit()
	{
		return suit;
	}

	public int getValue()
	{
		return value;
	}

	public String getRank()
	{
		return rank;
	}
}
