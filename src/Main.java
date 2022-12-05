import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\jvill\\IdeaProjects\\aoc-day-3\\resources\\puzzle-input");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                char[] firstHalf = data.substring(0, data.length() / 2).toCharArray();
                char[] secondHalf = data.substring(data.length() / 2).toCharArray();
                char[] test = {'a', 'A'};

                System.out.println(Character.getNumericValue('a') + "-" + Character.getNumericValue('z'));
                System.out.println((int) 'A' + "-" + (int) 'Z');

                characterArrayToIntArray(test);

                int[] firstHalfInt = characterArrayToIntArray(firstHalf);
                int[] secondHalfInt = characterArrayToIntArray(secondHalf);



            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static int[] characterArrayToIntArray(char[] charArr) {
        int[] intArr = new int[charArr.length];
        for (int i = 0; i < intArr.length; i++) {
            int charValue = (int) charArr[i];
            if (charValue > 90) {
                intArr[i] = charValue - 96;
            }
            else {
                intArr[i] = charValue - 38;
            }
        }
        return intArr;
    }
}