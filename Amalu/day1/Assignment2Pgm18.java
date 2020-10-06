package Assignemnet1;

import java.util.Scanner;

public class Assignment2Pgm18 {
	private static final String[] units = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine"
       }; 
       private static final String[] twoDigits = {
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
       };
       private static final String[] tenMultiples = {
           "",
           "",
           " twenty",
           " thirty",
           " forty",
           " fifty",
           " sixty",
           " seventy",
           " eighty",
           " ninety"
       };
       private static final String[] placeValues = {
           " ",
           " thousand",
           " million",
           " billion",
           " trillion"
       };
        
    private static String convertNumber(long number) {    
        String word = "";    
        int index = 0;
        do {
            // take 3 digits in each iteration
            int num = (int)(number % 1000);
            if (num != 0){
                String str = ConversionForUptoThreeDigits(num);
                word = str + placeValues[index] + word;
            }
            index++;
            // next 3 digits
            number = number/1000;
        } while (number > 0);
        return word;
    }
    
    private static String ConversionForUptoThreeDigits(int number) {
        String word = "";    
        int num = number % 100;
        if(num < 10){
            word = word + units[num];
        }
        else if(num < 20){
            word = word + twoDigits[num%10];
        }else{
            word = tenMultiples[num/10] + units[num%10];
        }
        
        word = (number/100 > 0)? units[number/100] + " hundred" + word : word;
        return word;
    }
    
	public static void main(String[] args) {
		System.out.println("eneter the number");
		Scanner in = new Scanner(System.in);
		int number=in.nextInt();
		System.out.println(convertNumber(number));
		

	}

}