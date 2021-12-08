/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/8 8:46 下午
 */
public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("正在生成Printer的实例");
    }

    public Printer(String name) {                   // 构造函数
        this.name = name;
        heavyJob("正在生成Printer的实例(" + name + ")");
    }

    public void setPrinterName(String name) {       // 设置名字
        this.name = name;
    }

    public String getPrinterName() {                // 获取名字
        return name;
    }

    public void print(String string) {              // 显示带打印机名字的文字
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    private void heavyJob(String msg) {             // 重活
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print("\b\b");
            } catch (InterruptedException ignored) {
            }
        }
        System.out.println("结束。");
    }
}
