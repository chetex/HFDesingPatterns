import animals.Duck;
import animals.LakeDuck;
import animals.WoodDuck;
import behaviours.fly.FlyWithWings;
import behaviours.fly.FlyWithWoodWings;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Duck mallard = new LakeDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new WoodDuck();
        model.performFly();  //begins as a nofly duck
        model.setFlyBehavior(new FlyWithWoodWings());
        model.performFly();

    }
}