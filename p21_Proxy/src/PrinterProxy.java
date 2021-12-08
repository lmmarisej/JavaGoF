/**
 * 代理对象尽量处理来自client的请求，只有当自己不能处理的时候才交给本人处理
 *
 * 和适配器模式相似，不同的是代理模式的接口实现对象功能是一样的
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/8 8:48 下午
 */
public class PrinterProxy implements Printable {
    private String name;            // 名字
    private Printer real;           // “本人”

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {      // 构造函数
        this.name = name;
    }

    public synchronized void setPrinterName(String name) {  // 设置名字
        if (real != null) {
            real.setPrinterName(name);  // 同时设置“本人”的名字
        }
        this.name = name;
    }

    public String getPrinterName() {    // 获取名字
        return name;
    }

    public void print(String string) {  // 显示
        realize();
        real.print(string);
    }

    private synchronized void realize() {   // 生成“本人”
        if (real == null) {
            real = new Printer(name);
        }
    }
}
