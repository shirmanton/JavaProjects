import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

        int selectedAction, selectedFigure, inputMethod, curFigure = 0;
        //the program stores 100 objects
        Figure[] figure = new Figure[100];
        Scanner scanner = new Scanner(System.in);

	    while (true){

            UserInteraction.printStartMenu();
            while (true){
                selectedAction = UserInteraction.exceptionHandingInt();
                if (selectedAction == 1 || selectedAction == 2)
                    break;
                else System.out.println("Incorrect input. Try again.");
            }

            if(selectedAction == 1) {
                UserInteraction.printFigureSelection();
                while (true) {
                    selectedFigure = UserInteraction.exceptionHandingInt();
                    if (selectedFigure == 1 || selectedFigure == 2 || selectedFigure ==3 || selectedFigure == 4)
                        break;
                    else System.out.println("Incorrect input. Try again.");
                }

                UserInteraction.printInputMethodSelection(selectedFigure);
                while (true) {
                    inputMethod = UserInteraction.exceptionHandingInt();
                    if (inputMethod == 1 || inputMethod == 2)
                        break;
                    else System.out.println("Incorrect input. Try again.");
                }
                switch (selectedFigure) {
                    case 1:
                        if (inputMethod == 1) {
                            figure[curFigure] = new Circle(UserInteraction.dataInputCircleLength());
                            if (UserInteraction.checkSameFigure(figure, curFigure)) curFigure--;
                            else System.out.println(figure[curFigure].toString());
                        }
                        if (inputMethod == 2) {
                            figure[curFigure] = new Circle(UserInteraction.dataInputCircleCoordinate());
                            if (UserInteraction.checkSameFigure(figure, curFigure)) curFigure--;
                            else System.out.println(figure[curFigure].toString());
                        }
                        break;
                    case 2:
                        if (inputMethod == 1) {
                            figure[curFigure] = new Triangle(UserInteraction.dataInputTriangleLength());
                            if (UserInteraction.checkSameFigure(figure, curFigure)) curFigure--;
                            else System.out.println(figure[curFigure].toString());
                        }
                        if (inputMethod == 2) {
                            figure[curFigure] = new Triangle(UserInteraction.dataInputTriangleCoordinate());
                            if (UserInteraction.checkSameFigure(figure, curFigure)) curFigure--;
                            else System.out.println(figure[curFigure].toString());
                        }
                        break;
                    case 3:
                        if (inputMethod == 1) {
                            figure[curFigure] = new Square(UserInteraction.dataInputSquareLength());
                            if (UserInteraction.checkSameFigure(figure, curFigure)) curFigure--;
                            else System.out.println(figure[curFigure].toString());
                        }
                        if (inputMethod == 2) {
                            figure[curFigure] = new Square(UserInteraction.dataInputSquareCoordinate());
                            if (UserInteraction.checkSameFigure(figure, curFigure)) curFigure--;
                            else System.out.println(figure[curFigure].toString());
                        }
                        break;
                    case 4:
                        if (inputMethod == 1) {
                            figure[curFigure] = new Rectangle(UserInteraction.dataInputRectangleLength());
                            if (UserInteraction.checkSameFigure(figure, curFigure)) curFigure--;
                            else System.out.println(figure[curFigure].toString());
                        }
                        if (inputMethod == 2) {
                            figure[curFigure] = new Rectangle(UserInteraction.dataInputRectangleCoordinate());
                            if (UserInteraction.checkSameFigure(figure, curFigure)) curFigure--;
                            else System.out.println(figure[curFigure].toString());
                        }
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                curFigure++;
                if (curFigure == 100) System.exit(1); //if all 100 objects are created then exit
            }
            else System.exit(1); //if inputAction is 2 (Exit)
        }
	}
}