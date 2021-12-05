/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/5 10:36 下午
 */
public class SideBorder extends Border {

    private Character borderChar;

    public SideBorder(Display display, char ch) {   // 通过构造函数指定Display和装饰边框字符
        super(display);
        this.borderChar = ch;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
