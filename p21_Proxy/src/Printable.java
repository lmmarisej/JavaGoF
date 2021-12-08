/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/8 8:45 下午
 */
public interface Printable {
    void setPrinterName(String name);   // 设置名字

    String getPrinterName();            // 获取名字

    void print(String string);          // 显示文字（打印输出）
}
