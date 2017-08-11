package oop.inheritance;

public class RobotPrzemyslowy extends Robot {
    @Override
    public void OpiszSie() {
        super.OpiszSie();
    }

    @Override
    public void Napraw() {
        System.out.println("Naprawianie");
    }

    @Override
    public void pracuj() {
        System.out.println("Pracuje");
    }


}
