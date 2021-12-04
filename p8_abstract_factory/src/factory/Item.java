package factory;

/**
 * 抽象产品的抽象
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 4:02 下午
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
