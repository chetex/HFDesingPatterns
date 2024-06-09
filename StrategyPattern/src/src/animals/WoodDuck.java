package animals;

import behaviours.fly.FlyWithWings;
import behaviours.quack.QuackWithNoVoice;

public class WoodDuck extends Duck {
    public WoodDuck(){
        quackBehavior = new QuackWithNoVoice();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real wood duck!");
    }
}
