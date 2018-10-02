package conditionexercises;

public class ConditionExercises {

    public static void main(String[] args) {
        ConditionExercisesMethods cex = new ConditionExercisesMethods();
        
        int a = 5, b = 15, c = 45, d = 54, e = -57, f = 8, g = 9;
        int year = 2008;
        
//1.Find largest number among 3 numbers
        System.out.println("The largest number amoung the three numbers is: " + cex.largest(a, b, c));
        
//2.Find second largest number among 3 numbers
        System.out.println("\nThe second largest number amoung the three numbers is: " + cex.secondLarge(a, b, c));
        
//3.Print numbers from 1 to N, But if the number is multiple of 3 then print "FIZZ" and if the number is multiple of 5 then print "BUZZ". But if the number is multiple of both 3 and 5 then print only "FIZZBUZZ".
        System.out.println();
        cex.print(b);
        System.out.println();
        
//4.Check if a number is negative, positive or zero.
        System.out.println("Number " + a + " is a " + cex.checkNum(a));
        
//5.Check if a number is even or odd
        System.out.println("\nNumber " + a + " is a " + cex.checkNum2(a) + " number.");
        
//6.Check if a year is leap year or not
        System.out.println("\nThe year " + year + " is " + cex.checkYear(year) + "!");
        
//7.Find largest number among 7 numbers
        System.out.println("\nThe largest number amoung the seven numbers is: " + cex. largest2(a, b, c, d, e, f, g));
    }
    
}
