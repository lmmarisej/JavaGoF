/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/6 10:34 下午
 */
public class GraphObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver:");
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
    }
}
