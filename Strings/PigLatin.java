
public class PigLatin {
	private String vowels = "aeiouAEIOU";

	public PigLatin() {

	}

	public int locate(String word) {
		int loc = 0;
		for (int i = 0; i < word.length(); i++) {
			loc = vowels.indexOf(word.substring(i, i + 1));
			if (loc >= 0) {
				return word.indexOf(vowels.charAt(loc));
			}
		}
		return -1;

	}

	public String translate(String word) {
		int index = locate(word);
		
		String newWord;
		if (index < 0) {
			newWord = word + "ay";
		} else if (index == 0) {
			newWord = word + "way";
		} else {
			newWord = word.substring(index) + word.substring(0, index) + "ay";
		}
		return newWord;
	}

	public String makePhrase(String phrase) {

		String s = "";
		String newPhrase = "";
		String englishPhrase = new String(phrase);

		while (englishPhrase.length() > 0) {
			if (englishPhrase.indexOf(" ") >= 0) {
				s = englishPhrase.substring(0, englishPhrase.indexOf(" "));
				
				newPhrase += translate(s) + " ";
				
				englishPhrase = englishPhrase.substring(englishPhrase.indexOf(" ") + 1);
			} else {
				newPhrase += translate(englishPhrase);
				englishPhrase = "";
			}
		}

		return newPhrase;

	}

	public static void main(String[] args) {
		PigLatin first = new PigLatin();
		System.out.println(first.makePhrase("amy is always mad"));

	}

}
