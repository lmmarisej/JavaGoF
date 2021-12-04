/**
 * 类的实现层次的最上层
 *
 * 让子类来实现，以达成类的实现层次结构
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 5:13 下午
 */
public abstract class DisplayImpl {
    public abstract void rawOpen();

    public abstract void rawPrint();

    public abstract void rawClose();
}
