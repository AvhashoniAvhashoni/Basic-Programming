package iterationexercises;

public class IterationExercisesMethods {
    //1.Find largest number from an array of numbers

    int findLargest(int arr[]){
        int largest = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest) {
                largest = arr[i];
            }
		}
        return largest;
    }

    //2.Find second largest number from an array of numbers

    int findSecLarge(int arr[]){
        int large = 0, secLarge = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > large){
                secLarge = large;
                large = arr[i];
            } else {
                if (arr[i] > secLarge){
                    secLarge = arr[i];
                }
            }
        }
        return secLarge;
    }

    //3.Find if a number is present in an array of numbers

    String itsPresent(int num, int arr[]){
        String itsPres = "";
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                itsPres = "present";
                break;
            } else {
                itsPres = "not present";
            }
        }
        return itsPres;
    }

    //4.Find number of occurrences of a number in an array of numbers

    int occurrence(int num, int arr[]){
        int count = 0;
		for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                count++;
            }
		}
        return count;
    }

    //5.Find the number in an array of numbers with maximum occurrences

    int maxOccur(int arr[]){
        int num = 0, max = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count > max){
                max = count;
                num = arr[i];
            }
        }
        
        return num;
    }

    //6.Find number of spaces in a sentence

    int numSpaces(String sentence){
        int numSpace = 0;
		for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == ' '){
                numSpace++;
            }
		}
        return numSpace;
    }

    //7.Find number of words in a sentence

    int numWords(String sentence){
        int numWords = 1;
        if (sentence == null || sentence == " " || sentence == ""){
            numWords = 0;
        } else {
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' '){
                    numWords++;
                }            
            }
        }
        return numWords;
    }

    //8.Replace all spaces in a sentence with underscore

    String replaceStr(String sentence){
        char str[] = new char[sentence.length()];
        
        for (int i = 0; i < sentence.length(); i++) {
            str[i] = sentence.charAt(i);
        }
        sentence = "";
        
        for (int i = 0; i < str.length; i++){
            if (str[i] == ' '){
                str[i] = '_';
            }
            sentence = sentence + str[i];
        }
        return sentence;
    }

    //9.Sort an array of numbers in ascending order
	
    int[] sortArr(int arr[]){
        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //10.Find all even numbers from an array of numbers

    void evenNum(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }

    //11.Generate fibonacci series from 1 to N

    void fibonacci(int num){
        int num1 = 1, num2 = 0, num3;
        while (num1 <= num) {
            System.out.print(num1 + " ");
            num3 = num1 + num2;
            num2 = num1;
            num1 = num3;
        }
    }

    //12.Reverse a string

    String reverseStr(String str){
        String revStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        return revStr;
    }

    //13.Convert numeric string value to number like "1234" -> 1234

    int convertStr(String numStr){
        int num = 0;
        
        for (int i = 0; i < numStr.length(); i++){
            switch (numStr.charAt(i)){
                case '1':
                    num = (num + 1) * 10;
                    break;
                case '2':
                    num = (num + 2) * 10;
                    break;
                case '3':
                    num = (num + 3) * 10;
                    break;
                case '4':
                    num = (num + 4) * 10;
                    break;
                case '5':
                    num = (num + 5) * 10;
                    break;
                case '6':
                    num = (num + 6) * 10;
                    break;
                case '7':
                    num = (num + 7) * 10;
                    break;
                case '8':
                    num = (num + 8) * 10;
                    break;
                case '9':
                    num = (num + 9) * 10;
                    break;
                case '0':
                    num = num * 10;
                    break;
            }
        }
        
        return num / 10;
    }
	
    //14.Find the maximum difference between two consecutive items in an array of numbers

    int maxDiff(int arr[]){
        int max = 0;
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i]-arr[i+1] > max){
                max = arr[i]-arr[i+1];
            }
        } 
        return max;
    }

    //15.Count number of digits in a number
	
    int countDigits(int num){
        int count = 0;
        while (num > 0){
            num = num / 10;
            count = count + 1;
        } 
        return count;
    }

    //16.Calculate sum of digits in a number

    int sumDigits(int num){
        int sum = 0;    
        while(num > 0){
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    //17.Find sum of all odd numbers between 1 to N

    int sumOdd(int num){
        int sum = 0;
        for (int i = 2; i < num; i++){
            if (i % 2 != 0){
                sum = sum + i;
            }
        }
        return sum;
    }

    //18.Swap first & last digit of a number

    int swapNum(int num){
        if (num/10 > 0){
            int count = 0, num2 = num;
            while (num2 > 0) {
                num2/=10;
                count++;
            }
            int arr[] = new int[count];
            for (int i = 0; i < count; i++) {
                arr[i] = num%10;
                num = (num - num%10) / 10;
            }
            num = arr[0];
            for (int j = arr.length-2; j > 0; j--) {
                num = num*10 + arr[j];
            }   
            num = num*10 + arr[arr.length-1];
        }
        return num;
    }

    //19.Check if an alphabet is vowel or consonant
	
    String checkLetter(char letter){
        switch (letter){
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return "vowel";
		default:
			return "consonant";
	}
    }

    //20.Reverse a number
	
    int reverseNum(int num){
        int revNum = 0;
        if (num/10 > 0){
            while (num > 0){
                revNum = revNum * 10 + num % 10;
                num = (num-(num % 10))/10;
            }
        }else{
            revNum = num;
        }
        return revNum;
    }
}
