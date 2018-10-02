package starpatternexercises;

public class StarPatternExercises {

    public static void main(String[] args) {
        
        StarPatternExercisesMethods spe = new StarPatternExercisesMethods();
        
        int num = 5;
        System.out.println("1.Square Star Pattern\n" + spe.square(num));
        
        System.out.println("2.Hollow Square Star Pattern\n" + spe.hollowSquare(num));
        
        System.out.println("3.Hollow Square Star Pattern with Diagonal\n" + spe.diagonalSquare(num));
        
        System.out.println("4.Rhombus Star Pattern\n" + spe.rhombus(num));
        
        System.out.println("5.Hollow Rhombus Star Pattern\n" + spe.hollowRhombus(num));
        
        System.out.println("6.Mirrored Rhombus Star Pattern\n" + spe.mirroredRhombus(num));
        
        System.out.println("7.Hollow Mirrored Rhombus Star Pattern\n" + spe.hollowMirroredRhombus(num));
        
        System.out.println("8.Right Triangle Star Pattern\n" + spe.rightAngle(num));
        
        System.out.println("9.Hollow Right Triangle Star Pattern\n" + spe.hollowRightAngle(num));
        
        System.out.println("10.Mirrored Right Triangle Star Pattern\n" + spe.mirroredRightAngle(num));
        
        System.out.println("11.Hollow Mirrored Right Triangle Star Pattern\n" + spe.hollowMirroredRightAngle(num));
        
        System.out.println("12.Inverted Right Triangle Star Pattern\n" + spe.invertedRightAngle(num));

        System.out.println("13.Hollow Inverted Right Triangle Star Pattern\n" + spe.hollowInvertedRightAngle(num));

        System.out.println("14.Inverted Mirrored Right Triangle Star Pattern\n" + spe.invertedMirrored(num));

        System.out.println("15.Hollow Inverted Mirrored Right Triangle Star Pattern\n" + spe.hollowInvertedMirrored(num));

        System.out.println("16.Pyramid Star Pattern\n" + spe.pyramid(num));

        System.out.println("17.Hollow Pyramid Star Pattern\n" + spe.hollowPyramid(num));

        System.out.println("18.Inverted Pyramid Star Pattern\n" + spe.invertedPyramid(num));

        System.out.println("19.Hollow Inverted Pyramid Star Pattern\n" + spe.hollowInvertedPyramid(num));

        System.out.println("20.Half Diamond Star Pattern\n" + spe.halfDiamond(num));

        System.out.println("21.Mirrored Half Diamond Star Pattern\n" + spe.mirroredHalfDiamond(num));
    }
    
}
