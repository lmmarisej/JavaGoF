/**
 * 具体装饰物
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/5 10:36 下午
 */
public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == display.getRows() + 1) {                // 上下边框
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {                                                        // 其他边框
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    public String makeLine(char ch, int count) {
        return String.valueOf(ch).repeat(Math.max(0, count));
    }
}
