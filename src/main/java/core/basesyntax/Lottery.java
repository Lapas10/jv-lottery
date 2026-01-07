package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier supplier = new ColorSupplier();
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(random.nextInt(101));
        return ball;
    }

}
