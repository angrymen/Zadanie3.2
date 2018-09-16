public class Triangle {

    double a;
    double b;
    double c;
    double h;

    Triangle (double a, double b, double c){

        this.a = a;
        this.b = b;
        this.c = c;

    }
    Triangle (double a, double h){

        this.a = a;
        this.h = h;
    }

    double calcArea () {

        this.a = a;
        this.h = h;
        double calcAreaEqual = 0.5 * a * h;
        return calcAreaEqual;

    }

}
