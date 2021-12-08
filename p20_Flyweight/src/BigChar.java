import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Flyweight对象，用来表示会被共享的实例
 *
 * 适合Intrinsic信息，不依赖于位置与状态；比如，单例只持有Intrinsic信息
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/8 6:36 下午
 */
public class BigChar {
    // 字符名字
    private char charname;
    // 大型字符对应的字符串(由'#' '.' '\n'组成)
    private String fontdata;

    // 构造函数
    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("big" + charname + ".txt")
            );
            String line;
            StringBuilder buf = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    // 显示大型字符
    public void print() {
        System.out.print(fontdata);
    }
}
