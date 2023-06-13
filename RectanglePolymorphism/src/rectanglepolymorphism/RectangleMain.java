/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rectanglepolymorphism;

/**
 *
 * @author Rishan Aziz
 */

import java.util.Scanner;

public class RectangleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        RectangleFigure rectangle, shapeRef;

        BoxFigure box;

        rectangle = new RectangleFigure(8,5);
        box = new BoxFigure(10,7,3);

        shapeRef = rectangle;

        System.out.println("Line 10: Rectangle: \n" + shapeRef);
        System.out.println();

        shapeRef = box;

        System.out.println("Line 13: Box: \n" + shapeRef);
        System.out.println();
    }

}
