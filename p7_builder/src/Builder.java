/**
 * 负责定义用于生成实例的接口
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 3:19 下午
 */
public abstract class Builder {
    abstract void makeTitle(String title);

    abstract void makeString(String str);

    abstract void makeItems(String[] items);

    abstract void close();
}
