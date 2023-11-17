package Java_Que;
import java.util.Random;
public class Que_A {
	
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);

        // Print the shuffled array
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static void shuffleArray(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            // Swap the elements at index i and index
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

}
