package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX = 100;
    private static final Random RANDOM = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier supplier = new ColorSupplier();

        ball.setColor(supplier.getRandomColor());
        ball.setNumber(RANDOM.nextInt(MAX) + 1);
        return ball;
    }

}
