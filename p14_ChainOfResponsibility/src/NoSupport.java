/**
 * 具体的处理者
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/6 8:36 下午
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
