/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/8 6:37 下午
 */
public class BigString {
    // “大型字符”的数组
    private BigChar[] bigchars;

    // 构造函数
    public BigString(String string) {
        bigchars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    // 显示
    public void print() {
        for (BigChar bigchar : bigchars) {
            bigchar.print();
        }
    }
}
