import java.util.Arrays;

public class BirdWatcher {

    public static void main(String[] args) {
        // Declare an array with explicit size
        int[] twoInts = new int[2];
        
        // Assign values to the array
        twoInts[0] = 5;
        twoInts[1] = 8;
        
        // Retrieve and print the second element
        int secondElement = twoInts[1];
        System.out.println("Second element in twoInts array: " + secondElement);
        
        // Declare and initialize arrays using two different methods
        int[] threeIntsV1 = new int[] { 4, 9, 7 };
        int[] threeIntsV2 = { 4, 9, 7 };
        
        // Print the length of an array
        System.out.println("Length of threeIntsV1 array: " + threeIntsV1.length);
        
        // Print elements of threeIntsV1 array
        System.out.println("Elements of threeIntsV1 array: " + Arrays.toString(threeIntsV1));
        
        // Use a for-each loop to iterate over the vowels array
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        System.out.print("Vowels: ");
        for(char vowel: vowels) {
            System.out.print(vowel);
        }
        System.out.println();
        
        // Use a for loop to print the first three vowels
        System.out.print("First three vowels: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(vowels[i]);
        }
        System.out.println();
        
        // Create a 2D array (multi-dimensional array)
        int[][] multiDimArray = new int[3][4];
        
        // Assign values to the 2D array
        for (int i = 0; i < multiDimArray.length; i++) {
            for (int j = 0; j < multiDimArray[i].length; j++) {
                multiDimArray[i][j] = i + j;
            }
        }
        
        // Print the 2D array
        System.out.println("Multi-dimensional array:");
        for (int i = 0; i < multiDimArray.length; i++) {
            for (int j = 0; j < multiDimArray[i].length; j++) {
                System.out.print(multiDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
