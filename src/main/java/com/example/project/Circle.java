package com.example.project;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        if(radius <= 0){
            return 0;
        }
        return Math.PI * (radius * radius);
    }
}
