package animals;

import behaviours.fly.FlyBehaviour;
import behaviours.quack.QuackBehaviour;

/**
 * Strategy pattens made reading HF Design patterns
 */
public abstract class Duck {
    FlyBehaviour flyBehavior;
    QuackBehaviour quackBehavior;

    public void setFlyBehavior(FlyBehaviour flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehaviour quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();
}