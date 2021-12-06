import java.util.Random;

/**
 * 具体的被观察对象
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/6 10:37 下午
 */
public class RandomNumberGenerator extends NumberGenerator {
    private final Random random = new Random();     // 随机数生成器
    private int number;                             // 当前数值

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
