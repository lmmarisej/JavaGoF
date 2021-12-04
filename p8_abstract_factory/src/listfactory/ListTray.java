package listfactory;

import factory.Item;
import factory.Tray;

/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 4:27 下午
 */
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<li>\n");
        buffer.append(caption).append("\n");
        buffer.append("<ul>\n");
        for (Object o : tray) {
            Item item = (Item) o;
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
