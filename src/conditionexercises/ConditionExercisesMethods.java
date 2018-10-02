/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionexercises;

public class ConditionExercisesMethods {
//1.Find largest number among 3 numbers
    int largest(int num1, int num2, int num3){
        int large = 0;
        
        if (num1 > num2 && num1 > num3)
            large = num1;
        else 
            if (num2 > num1 && num2 > num3)
                large = num2;
            else
                large = num3;
        
        return large;
    }
	
//2.Find second largest number among 3 numbers
    int secondLarge(int num1, int num2, int num3){
        int large = 0;
        int secLarge = 0;
        
        if (num1 > num2 && num1 > num3){
            large = num1;
        } else {
            if (num2 > num1 && num2 > num3){
                large = num2;
            } else {
                large = num3;
            }
        }
        
        if (num1 == large){
            if (num2 > num3){
                secLarge = num2;
            } else {
                secLarge = num3;
            }
        } else {
            if (num2 == large){
                if (num1 > num3){
                    secLarge = num1;
                } else {
                    secLarge = num3;
                }
            } else {
                if (num1 > num2){
                    secLarge = num1;
                } else {
                    secLarge = num2;
                }
            }
        }
        return secLarge;    
    }
	
//3.Print numbers from 1 to N, But if the number is multiple of 3 then print "FIZZ" and if the number is multiple of 5 then print "BUZZ". But if the number is multiple of both 3 and 5 then print only "FIZZBUZZ".
    void print(int num){
        int i = 1;
        while (i <= num){
            if (i%3 == 0 && i%5 == 0){
                System.out.println("FIZZBUZZ");
            } else {
                if (i%3 == 0){
                    System.out.println("FIZZ");
                } else  {
                    if (i%5 == 0){
                        System.out.println("BUZZ");
                    } else {
                        System.out.println(i);
                    }
                }
            }
            i++;
        }
    }
    
//4.Check if a number is negative, positive or zero.
    String checkNum(int num){ 
        if (num < 0){
            return "Negative number";
		} else {
            if (num > 0){
                return "Positive number";
            } else {
                return "Zero";
            }
        }
    }

//5.Check if a number is even or odd
    String checkNum2(int num){
        if (num % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }
        
//6.Check if a year is leap year or not
    String checkYear(int year){
        if (year % 4 == 0 || year % 100 == 0){
            return "leap year";
	} else {
            return "not a leap year";
        }
    }
        
//7.Find largest number among 7 numbers
    int largest2(int n1, int n2, int n3, int n4, int n5, int n6, int n7){
        int arr[] = new int[7];
        arr[0] = n1;
        arr[1] = n2;
        arr[2] = n3;
        arr[3] = n4;
        arr[4] = n5;
        arr[5] = n6;
        arr[6] = n7;
        int large = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > large){
                large = arr[i];
            }
        }
        return large; 
    }
}