import java.util.HashMap;

/**
 * FlyweightFactory用来生成可被共享的实例，并缓存起来
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/8 6:37 下午
 */
public class BigCharFactory {
    // 管理已经生成的BigChar的实例
    private HashMap pool = new HashMap();
    // Singleton模式
    private static final BigCharFactory singleton = new BigCharFactory();

    // 构造函数
    private BigCharFactory() {
    }

    // 获取唯一的实例
    public static BigCharFactory getInstance() {
        return singleton;
    }

    // 生成（共享）BigChar类的实例
    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = (BigChar) pool.get("" + charname);
        if (bc == null) {
            bc = new BigChar(charname); // 生成BigChar的实例
            pool.put("" + charname, bc);
        }
        return bc;
    }
}
