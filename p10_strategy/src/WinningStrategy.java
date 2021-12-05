import java.util.Random;

/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/5 9:03 下午
 */
public class WinningStrategy implements Strategy {

    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    /*如果赢了，下局手势相同，如果输了，下局手势随机*/
    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
