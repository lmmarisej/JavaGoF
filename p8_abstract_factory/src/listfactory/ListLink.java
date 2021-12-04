package listfactory;

import factory.Link;

/**
 * 具体产品，负责实现抽象产品的接口
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 4:24 下午
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
