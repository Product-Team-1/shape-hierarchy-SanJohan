package com.example.project;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        if(width <= 0 || height <= 0){
            return 0;
        }
        return width * height;
    }
}
