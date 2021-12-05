/**
 * 策略接口
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/5 9:01 下午
 */
public interface Strategy {
    Hand nextHand();

    void study(boolean win);
}
