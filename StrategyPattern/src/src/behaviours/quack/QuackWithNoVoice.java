package behaviours.quack;

public class QuackWithNoVoice implements QuackBehaviour {

    /**
     * Perform quack with no voice
     */
    @Override
    public void quack() {
        System.out.println("Quack with no voice!!");
    }
}
