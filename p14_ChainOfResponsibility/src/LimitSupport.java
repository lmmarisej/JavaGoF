/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/6 8:36 下午
 */
public class LimitSupport extends Support {
    private int limit;                              // 可以解决编号小于limit的问题

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}
