public class CalculatorTest {
    public static void main(String[] args) {

        // Kwadrat

        Square firstSquare = new Square(2);
        ShapeCalculator sapeCalculator = new ShapeCalculator();

        // Obwód kwadratu

        double firstSquarePerimeter = sapeCalculator.squarePerimeter(firstSquare);
        System.out.println("Obwód kwadratu to: " + firstSquarePerimeter);

        //Pole kwadratu

        double firstSquareArea = sapeCalculator.squareArea(firstSquare);
        System.out.println("Pole kwadratu to: " + firstSquareArea);

        //Prostokąt

        Rectangle firstRectangle = new Rectangle(2,3);

        // Obwód prostokąta

        double firstRecPerimeter = sapeCalculator.rectPerimeter(firstRectangle);
        System.out.println("Obwód prostokąta to: " + firstRecPerimeter);

        // Pole prostokąta

        double firsRecArea = sapeCalculator.rectArea(firstRectangle);
        System.out.println("Pole prostokąta to: " + firsRecArea);

        // Pole okręgu

        Circle firstCircle = new Circle(2);

        double firstCircleArea = sapeCalculator.circleArea(firstCircle);
        System.out.printf("Pole okręgu to: %.2f%n", firstCircleArea);

        // Obwod trójkąta

        Triangle firstTriangle = new Triangle(2,2,2);
        double firstTrianglePerimeter = sapeCalculator.trianglePerimeter(firstTriangle);
        System.out.println("Obwód trójkąta to: " + firstRecPerimeter);

        // Druga czesc zadania


        double secondSquareArea = firstSquare.calcArea(3);
        System.out.println("Pole kwadratu to: " + secondSquareArea);

        double secondRectangleArea = firstRectangle.calcArea(3, 5);
        System.out.println("Pole prostokata to: " + secondRectangleArea);

        double secondCircleArea = firstCircle.calcArea(1.5);
        System.out.printf("Pole okręgu to: %.2f%n", secondCircleArea);

        Triangle secondTringle = new Triangle(2.5, 4);

        double secondTringleArea = secondTringle.calcArea();
        System.out.printf("Pole trójkąta to: " + secondTringleArea);




    }

}
