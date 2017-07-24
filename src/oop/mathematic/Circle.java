package oop.mathematic;

/*
Zdefiniuj klasę Circle do reprezentacji Koła. Klasa powinna posiadać pole pole radius
(promien) oraz metodę area obliczającą pole oraz metodę circumference
do obliczania obwodu

*/

import java.util.Scanner;

public class Circle {
    Scanner scanner = new Scanner(System.in);
    public double radius;
    public Circle(){radius=0;}

    public double getRadius(){ return this.radius;}

    public void seRadius (double r){
        if (r<0){
            System.out.println("Promien nie moze byc ujemny");
        }else{
            this.radius=r;
        }
    }
    public double Area (){ return Math.PI*Math.pow(radius,2);}

    public double Circumference(){ return 2*Math.PI*radius;}



}
