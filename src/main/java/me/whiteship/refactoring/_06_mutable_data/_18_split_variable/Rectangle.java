package me.whiteship.refactoring._06_mutable_data._18_split_variable;

public class Rectangle {

    private double perimeter;
    private double area;

    public void updateGeometry(double height, double width) {
        perimeter = 2 * (height + width);
        System.out.println("perimeter: " + perimeter);

        area = height * width;
        System.out.println("Area: " + area);
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
}
