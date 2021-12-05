/**
 * 需要装饰增加的功能接口
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/5 10:33 下午
 */
public abstract class Display {
    public abstract int getColumns();

    public abstract int getRows();

    public abstract String getRowText(int row);

    public void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
