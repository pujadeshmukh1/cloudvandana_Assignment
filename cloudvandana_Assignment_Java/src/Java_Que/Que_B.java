package Java_Que;
import java.util.HashMap;
import java.util.Scanner;

public class Que_B {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a Roman Number: ");
	        String romanNumeral = scanner.nextLine();

	        int result = romanToInteger(romanNumeral);
	        System.out.println("Integer equivalent: " + result);
	    }

	    private static int romanToInteger(String s) {
	        HashMap<Character, Integer> romanMap = new HashMap<>();
	        romanMap.put('I', 1);
	        romanMap.put('V', 5);
	        romanMap.put('X', 10);
	        romanMap.put('L', 50);
	        romanMap.put('C', 100);
	        romanMap.put('D', 500);
	        romanMap.put('M', 1000);

	        int result = 0;

	        for (int i = 0; i < s.length(); i++) {
	            int current = romanMap.get(s.charAt(i));
	            int next = (i + 1 < s.length()) ? romanMap.get(s.charAt(i + 1)) : 0;

	            if (current >= next) {
	                result += current;
	            } else {
	                result += (next - current);
	                i++; 
	            }
	        }

	        return result;
	    }
	}
