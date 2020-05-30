/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	
// What happens when more than one keyword appears in a string? Consider the string “My
//mother has a dog but no cat.” Explain how to prioritize responses in the reply method.
//The first keyword that appears in the statement will get priority. Keywords of high 
//priority should be put first in the if statement
	
//What happens when a keyword is included in another word? Consider statements like “I know
//all the state capitals” and “I like vegetables smothered in cheese.” Explain the problem with the
//responses to these statements.
//The problem with these statements is that they will generate a response for the nested keyword
//even though the word itself may be unrelated.
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >=0)
		{
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("Mr") >= 0
				|| statement.indexOf("Ms") >=0
				|| statement.indexOf("Mrs") >=0)
		{
			response = "He sounds like a good teacher.";
		}
		else if (statement.indexOf("work") >=0)
		{
			response = "How was work today?";
		}
		else if (statement.indexOf("food") >= 0) 
		{
			response = "Mmm that sounds yummy!";
		}
		else if (statement.indexOf("exercise")>=0) 
		{
			response = "Do you go to the gym?";
		}
		else if (statement.trim().equals(response))
		{
			response = "Say something, please.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "I can't belive it!";
		}
		else if (whichResponse == 5)
		{
			response = "That is so cool.";
		}

		return response;
	}
}
