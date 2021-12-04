import java.util.HashMap;

/**
 * 使用者，负责使用复制实例的方法生成新的实例
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 2:10 下午
 */
public class Manager {
    private HashMap showcase = new HashMap();

    /*存储实例*/
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    /*根据实例克隆一份实例*/
    public Product create(String protoname) {
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}
