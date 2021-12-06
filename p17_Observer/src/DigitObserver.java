/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/6 10:33 下午
 */
public class DigitObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
    }
}
