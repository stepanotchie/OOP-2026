package practice.week2;
public class Circle {
    //fields
    double radius;
    static final double piValue = Math.PI;

    //default constructor
    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return (piValue * ((radius * radius)));
    }
}
