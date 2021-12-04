/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 2:42 上午
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成了一个实例。");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
