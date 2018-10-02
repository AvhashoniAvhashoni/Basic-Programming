package iterationexercises;

import java.util.Arrays;

public class IterationExercises {

    public static void main(String[] args) {
        int num = 5, num2 = 1234;
        int arr[] = {1, 2, 2, 7, 48, 9, 100, 8, 2, 4, 8 , 6};
        IterationExercisesMethods ie = new IterationExercisesMethods();
        String sentence = "Objective of this level to ensure that you are familliar with basic programming skills in a programming language.";
        String str = "TOP";
        String numStr = "1234";
        char letter = 'A';
        
        System.out.println("\nThe maximum difference between two consecutive numbers is " + ie.maxDiff(arr));
        
    //1.Find largest number from an array of numbers
        System.out.println("The largest number in the array is: " + ie.findLargest(arr));

    //2.Find second largest number from an array of numbers
        System.out.println("\nThe second largest number in the array is: " + ie.findSecLarge(arr));
        
    //3.Find if a number is present in an array of numbers
        System.out.println("\nNumber " + num + " is " + ie.itsPresent(num, arr) + " in the array");

    //4.Find number of occurrences of a number in an array of numbers
        System.out.println("\nNumber " + num + " occurrs " + ie.occurrence(num, arr) + " time(s) in an array");
    
    //5.Find the number in an array of numbers with maximum occurrences
        System.out.println("\nNumber " + ie.maxOccur(arr) + " has the maximum occurrences");
        
    //6.Find number of spaces in a sentence
        System.out.println("\nThe sentence has " + ie.numSpaces(sentence) + " number of spaces");
        
    //7.Find number of words in a sentence
        System.out.println("\nThe sentence has " + ie.numWords(sentence) + " nuber of words");

    //8.Replace all spaces in a sentence with underscore
        System.out.println("\n" + ie.replaceStr(sentence));

    //9.Sort an array of numbers in ascending order
        System.out.println("\n" + Arrays.toString(ie.sortArr(arr)));
        
    //10.Find all even numbers from an array of numbers
        System.out.println();
        ie.evenNum(arr);

    //11.Generate fibonacci series from 1 to N
        System.out.print("\n\nFibonacci series from 1 to " + num + " -> ");
        ie.fibonacci(num);

    //12.Reverse a string
        System.out.println("\n\n" + str + " -> " + ie.reverseStr(str));
        
    //13.Convert numeric string value to number like "1234" -> 1234
        System.out.println("\n" + ie.convertStr(numStr));
	
    //14.Find the maximum difference between two consecutive items in an array of numbers
        System.out.println("\nThe maximum difference between two consecutive numbers is " + ie.maxDiff(arr));

    //15.Count number of digits in a number
        System.out.println("\nThe number of digits in " + num2 + " is " + ie.countDigits(num2));

    //16.Calculate sum of digits in a number
        System.out.println("\nThe sum of digits in the number " + num2 + " is " + ie.sumDigits(num2));

    //17.Find sum of all odd numbers between 1 to N
        System.out.println("\nThe sum of odd numbers between 1 and " + num + " is " + ie.sumOdd(num));
        
    //18.Swap first & last digit of a number
        System.out.println("\n" + num2 + " -> " + ie.swapNum(num2));
        
    //19.Check if an alphabet is vowel or consonant
	System.out.println("\nThe letter " + letter + " is a " + ie.checkLetter(letter));
        
    //20.Reverse a number
        System.out.println("\n" + num2 + " -> " + ie.reverseNum(num2));      
    }
    
}
