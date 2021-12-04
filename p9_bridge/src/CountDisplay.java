/**
 * 用来继承以增加新功能，类的功能层次结构
 *
 * 可以随意扩展，所有扩展的实现都通用DisplayImpl
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 5:15 下午
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
