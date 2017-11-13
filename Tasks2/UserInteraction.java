import java.util.InputMismatchException;
import java.util.Scanner;

class UserInteraction {

    static void printStartMenu() {
        System.out.println("1. Create a new figure\n" +
                           "2. Exit");
    }

    static void printFigureSelection() {
	    System.out.println( "Select a figure:\n" +
                            "1. Circle\n" +
                            "2. Triangle\n" +
                            "3. Square\n" +
                            "4. Rectangle");
    }

    static void printInputMethodSelection(int selectedFigure) {
        switch(selectedFigure){
            case 1:
                System.out.println( "Select input:\n" +
                                    "1. Enter the radius\n" +
                                    "2. Enter the initial and final coordinates of the radius");
                break;
            case 2:
                System.out.println( "Select input:\n" +
                                    "1. Enter 3 side lengths\n" +
                                    "2. Enter 3 coordinates of vertices");
                break;
            case 3:
                System.out.println( "Select input:\n" +
                                    "1. Enter 1 side length\n" +
                                    "2. Enter the coordinates of any one side");
                break;
            case 4:
                System.out.println( "Select input:\n" +
                                    "1. Enter 2 side lengths\n" +
                                    "2. Enter the coordinates of any one length and one width");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    static int exceptionHandingInt(){
        int input;
        Scanner scanner = new Scanner(System.in);
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
        return input;
    }

     static double exceptionHandingDouble(){
        double input;
        Scanner scanner = new Scanner(System.in);
        try {
            input = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input. Try again.");
            return  exceptionHandingDouble();
        }
        return input;
    }

    static double dataInputCircleLength() {
        double radius;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius:");
        radius = exceptionHandingDouble();
        return radius;
    }

    static double[][] dataInputCircleCoordinate() {
        double[][] point = new double[2][2];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 2 ; i++) {
            if (i == 0) System.out.println("Coordinates of the starting point of the radius:");
            else System.out.println("Coordinates of the end point of the radius:");
            for(int j = 0; j < 2; j++) {
                if (j == 0) System.out.println("Along the X axis: ");
                else System.out.println("Along the Y axis: ");
                point[i][j] = exceptionHandingDouble();
            }
        }
        return point;
    }

    static double[] dataInputTriangleLength() {
        double[] size = new double[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 side lengths of the triangle:");
        for(int i = 0; i < 3; i++){
            size[i] = exceptionHandingDouble();
        }
        return size;
    }

    static double[][] dataInputTriangleCoordinate() {
        double[][] point = new double[3][2];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3 ; i++) {
            if (i == 0) System.out.println("Coordinates of the first vertex of the triangle:");
            else if (i == 1) System.out.println("Coordinates of the second vertex of the triangle:");
            else System.out.println("Coordinates of the third vertex of the triangle:");
            for(int j = 0; j < 2; j++) {
                if (j == 0) System.out.println("Along the X axis: ");
                else System.out.println("Along the Y axis: ");
                point[i][j] = exceptionHandingDouble();
            }
        }
        return point;
    }

    static double dataInputSquareLength() {
        double size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length:");
        size = exceptionHandingDouble();
        return size;
    }

    static double[][] dataInputSquareCoordinate() {
        double[][] point = new double[2][2];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 2 ; i++) {
            if (i == 0) System.out.println("Coordinates of the first point:");
            else System.out.println("Coordinates of the second point:");
            for(int j = 0; j < 2; j++) {
                if (j == 0) System.out.println("Along the X axis: ");
                else System.out.println("Along the Y axis: ");
                point[i][j] = exceptionHandingDouble();
            }
        }
        return point;
    }

    static double[] dataInputRectangleLength() {
        double[] size = new double[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 side lengths of the rectangle:");
        for(int i = 0; i < 2; i++){
            size[i] = exceptionHandingDouble();
        }
        return size;
    }

    static double[][] dataInputRectangleCoordinate() {
        double[][] point = new double[4][2];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 4 ; i++) {
            if (i == 0) System.out.println("Coordinates of the first point of the side number 1:");
            else if (i == 1) System.out.println("Coordinates of the second point of the side number 1:");
            else if (i == 2) System.out.println("Coordinates of the first point of the side number 2:");
            else System.out.println("Coordinates of the second point of the side number 2:");
            for(int j = 0; j < 2; j++) {
                if (j == 0) System.out.println("Along the X axis: ");
                else System.out.println("Along the Y axis: ");
                point[i][j] = exceptionHandingDouble();
            }
        }
        return point;
    }

    static boolean checkSameFigure(Figure[] figure, int curFigure) {
        boolean sameFigure = false;
        for(int i = 0 ; i < curFigure; i++){
            if(figure[curFigure].equals(figure[i])) {
                System.out.println("This figure with such parameters has already been counted");
                System.out.println(figure[curFigure].toString());
                sameFigure = true;
                break;
            }
        }
        return sameFigure;
    }
}