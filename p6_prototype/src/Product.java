/**
 * 原型接口，负责定义用于复制现有实例来生成新实例的方法
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 2:15 下午
 */
public interface Product extends Cloneable {
    void use(String s);

    Product createClone();
}
