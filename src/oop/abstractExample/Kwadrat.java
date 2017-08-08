package oop.abstractExample;

/**
 * Created by Johny on 08.08.2017.
 */
public class Kwadrat extends Figura {

    private double a;

    public Kwadrat() {

    }

    public Kwadrat(int a) {
        this.a = a;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double ObliczPole() {
        return a *a ;
    }

    @Override
    public double ObliczObwod() {
        return 4 * a;
    }

    @Override
    public void Opisz() {
        System.out.println("Jestem kwadratem");
    }
}
