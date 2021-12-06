/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/6 8:40 下午
 */
public class OddSupport extends Support {

    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 == 1;
    }
}
