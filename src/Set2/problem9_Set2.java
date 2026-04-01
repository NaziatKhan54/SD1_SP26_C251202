package Set2;

import java.util.Scanner;

public class problem9_Set2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String output = input.nextLine();
        int i, countVowel = 0, countConst = 0;
        for (i = 0; i < output.length(); i++) {
            if (output.charAt(i) == 'A' || output.charAt(i) == 'E' || output.charAt(i) == 'I'
                    || output.charAt(i) == 'O' || output.charAt(i) == 'U' || output.charAt(i) == 'a'
                    || output.charAt(i) == 'e' || output.charAt(i) == 'i' || output.charAt(i) == 'o'
                    || output.charAt(i) == 'u') {
                countVowel++;
            } else {
                countConst++;
            }
        }
        System.out.println("The number of vowels = " + countVowel);
        System.out.println("The number of consonants  = " + countConst);
    }
}
