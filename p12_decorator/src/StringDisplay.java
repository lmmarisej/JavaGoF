/**
 * 需要被装饰的对象
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/5 10:34 下午
 */
public class StringDisplay extends Display {

    private String string;                          // 要显示的字符串

    public StringDisplay(String string) {           // 通过参数传入要显示的字符串
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
