package factory;

import java.util.ArrayList;

/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 4:04 下午
 */
public abstract class Tray extends Item {

    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
