public class Circle {

    double r;

    Circle (double r){

        this.r = r;

    }

    double calcArea (double r) {

        this.r = r;
        double calcAreaEqual = 2 * Math.PI * r;
        return calcAreaEqual;

    }

}
