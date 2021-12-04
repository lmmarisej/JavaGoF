/**
 * 模板方法，负责实现模板方法、负责定义模板方法中需要使用到的抽象方法
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 12:56 上午
 */
public abstract class AbstractDisplay {
    public abstract void open();        // 交给子类去实现的抽象方法(1) open

    public abstract void print();       // 交给子类去实现的抽象方法(2) print

    public abstract void close();       // 交给子类去实现的抽象方法(3) close

    // 禁止子类重写模板流程
    public final void display() {       // 本抽象类中实现的display方法
        open();                         // 首先打开…
        for (int i = 0; i < 5; i++) {   // 循环调用5次print
            print();
        }
        close();                        // …最后关闭。这就是display方法所实现的功能
    }
}
