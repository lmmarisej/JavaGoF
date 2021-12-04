/**
 * 类的功能层次的最上层
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 5:12 下午
 */
public class Display {
    /*类的实现层次结构和类的功能层次结构的连接点，以委托方式来连接*/
    private final DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public void display() {
        open();
        print();
        close();
    }
}
