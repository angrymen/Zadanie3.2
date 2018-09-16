public class ShapeCalculator {

    double squarePerimeter (Square square){

        double squareAreaEqual = square.a * 4;
        return squareAreaEqual;

    }

    double squareArea (Square square){

        double squareAreaEqual = Math.pow(square.a, 2);
        return  squareAreaEqual;

    }

    double rectPerimeter (Rectangle rectangle) {

        double rectPerimeterEqual = (rectangle.a * 2 + rectangle.b *2);
        return  rectPerimeterEqual;

    }

    double rectArea (Rectangle rectangle) {

        double rectAreaEqual = rectangle.a * rectangle.b;
        return  rectAreaEqual;

    }

    double circleArea (Circle circle) {

        double circleAreaEqual = Math.PI * Math.pow(circle.r, 2);
        return circleAreaEqual;

    }

    double trianglePerimeter (Triangle triangle) {

        double trianglePerimeterEqual = triangle.a + triangle.b + triangle.c;
        return trianglePerimeterEqual;

    }
}
