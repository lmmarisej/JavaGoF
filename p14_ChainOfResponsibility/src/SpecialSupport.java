/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/6 8:44 下午
 */
public class SpecialSupport extends Support {
    private int number;                                 // 只能解决指定编号的问题

    public SpecialSupport(String name, int number) {    // 构造函数
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == number;
    }
}
