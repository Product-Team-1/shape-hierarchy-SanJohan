package com.example.project;

import java.util.ArrayList;

public class ShapeHierarchy {
    public static void main(String[] args) {
        // TODO: create a list/array of shapes and print each area (polymorphism)

        ArrayList<Shape> listaObjetos = new ArrayList<>();

        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(2,3);
        Triangle triangle = new Triangle(3,4);

        listaObjetos.add(circle);
        listaObjetos.add(rectangle);
        listaObjetos.add(triangle);

        for(Shape objeto : listaObjetos){
            System.out.println(objeto.getArea());
        }
    }
}
