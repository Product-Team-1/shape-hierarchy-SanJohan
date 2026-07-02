package com.example.project;

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        if(base <= 0 || height <= 0){
            return 0;
        }
        return (base * height)/2;
    }
}
