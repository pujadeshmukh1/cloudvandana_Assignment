package Java_Que;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Que_C {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();

	        boolean isPangram = checkPangram(sentence.toLowerCase());
	        System.out.println("Is it a pangram? " + isPangram);
	    }

	    private static boolean checkPangram(String sentence) {
	        Set<Character> alphabetSet = new HashSet<>();

	        for (char ch : sentence.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                alphabetSet.add(ch);
	            }
	        }

	        return alphabetSet.size() == 26; // 26 letters in the English alphabet
	    }
	}
