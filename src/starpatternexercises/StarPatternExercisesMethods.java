package starpatternexercises;

public class StarPatternExercisesMethods {
    //1.Square Star Pattern
	
    String square(int num){
        String stars = "";
        for (int i = 0; i < num; i ++){
            for (int j = 0; j < 5; j++) {
                stars = stars + "*";
            }
            stars = stars + "\n";
        }
        return stars;
    }

    //2.Hollow Square Star Pattern

    String hollowSquare(int num){
        String stars = "";
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num){
                    stars = stars + "*";
                } else {
                    stars = stars + " ";
                }
            }
            stars = stars + "\n";
        }
        return stars;
    }

    //3.Hollow Square Star Pattern with Diagonal
    
    String diagonalSquare(int num){
        String stars = "";
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num; j++) {
                if (i == j || i == 1 || i == num || j == 1 || j == num || i*2 == j || i/2 == j){
                    stars = stars + "*";
                } else {
                    stars = stars + " ";
                }
            }
            stars = stars + "\n";
        }
        return stars;
    }

    //4.Rhombus Star Pattern
	
    String rhombus(int num){
        String stars = "";
        int num2 = num;
        for (int i = 1; i <= num; i++){
            for (int k = 1; k < num2; k++){
                stars = stars + " ";
            }
            num2--;
                    
            for (int j = 1; j <= num; j++){
                stars += "*";
            }
            stars += "\n";
        }
        return stars;
    }

    //5.Hollow Rhombus Star Pattern
	
    String hollowRhombus(int num){
        String stars = "";
        int num2 = num;
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num2; j++){
                stars += " ";
                
            }
            num2--;
            
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num){
                    stars += "*";
                } else {
                    stars += " ";
                }
            }
            stars += "\n";
        }
        
        return stars;
    }

    //6.Mirrored Rhombus Star Pattern
	
    String mirroredRhombus(int num){
        String stars = "";
        int num2 = 0;
        for (int i = 1; i <= num; i++){
            for (int k = 1; k <= num2; k++){
                stars += " ";
            }
            num2++;
                    
            for (int j = 1; j <= num; j++){
                stars += "*";
            }
            stars += "\n";
        }
        return stars;
    }

    //7.Hollow Mirrored Rhombus Star Pattern
	
    String hollowMirroredRhombus(int num) {
        String stars = "";
        int num2 = 0;
        for (int i = 1; i <= num; i++){
            for (int k = 1; k <= num2; k++){
                stars += " ";
            }
            num2++;
            for (int j = 1; j <= num; j++){
                if (i == num || i == 1 || j == 1 || j == num)
                    stars += "*";
                else
                    stars += " ";
            }
            stars += "\n";
        }
        return stars;
    }

    //8.Right Triangle Star Pattern
	
    String rightAngle(int num) {
        String stars = "";
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++){
                stars += "*";
            }
            stars += "\n";
        }
        return stars;
    }

    //9.Hollow Right Triangle Star Pattern
	
    String hollowRightAngle(int num) {
        String stars = "";
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++){
                if (j == 1 || j == num || i == num || j == i)
                    stars += "*";
                else
                    stars += " ";
            }
            stars += "\n";
        }
        return stars;
    }

    //10.Mirrored Right Triangle Star Pattern
	
    String mirroredRightAngle(int num) {
        String stars = "";
        int num2 = num;
        for (int i = 1; i <= num; i++){
            for (int j = 1; j < num2; j++) {
                stars += " ";
            }
            num2--;
            
            for (int j = 1; j <= i; j++) {
                stars += "*";
            }
            
            stars += "\n";
        }
        return stars;
    }

    //11.Hollow Mirrored Right Triangle Star Pattern
	
    String hollowMirroredRightAngle(int num) {
        String stars = "";
        int num2 = num;
        for (int i = 1; i <= num; i++){
            for (int j = 1; j < num2; j++) {
                stars += " ";
            }
            num2--;
            for (int j = 1; j <= i; j++) {
                if (j == i || j == 1 || j == num || i == num)
                    stars += "*";
                else
                    stars += " ";
            }
            stars += "\n";
        }
        return stars;
    }

    //12.Inverted Right Triangle Star Pattern
	
    String invertedRightAngle(int num) {
        String stars = "";
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                stars += "*";
            }
            stars += "\n";
        }
        return stars;
    }

    //13.Hollow Inverted Right Triangle Star Pattern
	
    String hollowInvertedRightAngle(int num) {
        String stars = "";
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i==j || j == num || j == 1 || i == num )
                    stars += "*";
                 else 
                    stars += " ";
            }
            stars += "\n";
        }
        return stars;
    }

    //14.Inverted Mirrored Right Triangle Star Pattern
	
    String invertedMirrored(int num) {
        String stars = "";
        int num2 = 0;
        for (int i = 0; i < num; i++){
            for (int j = 0; j  < num2; j++){
                stars +=  " ";
            }
            for (int j = num; j > i; j--){
                stars += "*";
            }
            num2++;
            stars += "\n";
        }
        return stars;
    }

    //15.Hollow Inverted Mirrored Right Triangle Star Pattern
	
    String hollowInvertedMirrored(int num) {
        String stars = "";
        int num2 = 0;
        for (int i = 0; i < num; i++){
            for (int j = 0; j  < num2; j++){
                stars +=  " ";
            }
            for (int j = num; j > i; j--){
                if ( i == 0 || i == 4 || j == num || j == i || j == i+1)
                    stars += "*";
                else
                    stars += " ";
            }
            num2++;
            stars += "\n";
        }
        return stars;
    }

    //16.Pyramid Star Pattern
	
    String pyramid(int num) {
        String stars = "";
        for (int i = 1; i <= num; i++) {
            for (int j = i; j < num; j++) {
                stars += " ";
            }
            for (int j = 1; j < i*2; j++) {
                stars += "*";
            }
            stars += "\n";
        }
        return stars;
    }

    //17.Hollow Pyramid Star Pattern
	
    String hollowPyramid(int num) {
        String stars = "";
        for (int i = 1; i <= num; i++){
            for (int j = i; j < num; j++) {
                stars += " ";                
            }
            for (int j = 1; j < i*2; j ++){
                if (i == 1|| i == num || j == 1 || j == i*2-1)
                    stars += "*";
                else
                    stars += " ";  
            }
            stars += "\n";
        }
        return stars;
    }

    //18.Inverted Pyramid Star Pattern
	
    String invertedPyramid(int num) {
        String stars = "";
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                stars += " ";
            }
            int num2 = i*2-1;
            for (int j = num2; j < num*2; j++) {
                stars += "*";
            }
            
            stars += "\n";
        }
        return stars;
    }

    //19.Hollow Inverted Pyramid Star Pattern
	
    String hollowInvertedPyramid(int num) {
        String stars = "";
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                stars += " ";
            }
            for (int j = i*2; j <= num*2; j++) {
                if (i == 1 || i == num || j == i*2 || j == num*2){ 
                    stars += "*";
                }else{
                    stars += " ";
                }
            }
            stars += "\n";
        }
        return stars;
    }

    //20.Half Diamond Star Pattern
	
    String halfDiamond(int num) {
        String stars = "";
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                stars += "*";
            }
            stars += "\n";
        }
        for (int i = num-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                stars += "*";
            }
            stars += "\n";
        }
        return stars;
    }

    //21.Mirrored Half Diamond Star Pattern
	
    String mirroredHalfDiamond(int num) {
        String stars = "";
        for (int i = 1; i <= num; i++) {
            for (int j = i; j < num; j++) {
                stars += " ";
            }
            for (int j = 1; j <= i; j++) {
                stars += "*";
            }
            stars += "\n";
        }
        for (int i = num-1; i >= 1; i--) {
            for (int j = i; j < num; j++) {
                stars += " ";
            }
            for (int j = 1; j <= i; j++) {
                stars += "*";
            }
            stars += "\n";
        }
        return stars;
    }
}
