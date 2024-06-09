package animals;

import behaviours.fly.FlyWithWings;
import behaviours.quack.QuackWithNoVoice;

public class LakeDuck extends Duck {

    public LakeDuck(){
        quackBehavior = new QuackWithNoVoice();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real mallard duck!");
    }
}