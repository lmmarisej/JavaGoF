/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 1:38 上午
 */
public abstract class Factory {

    /**
     * 不用new生成实例，使用专用的方法来生成，可以防止父类与其它具体类耦合。
     * 例如，将产品创建和产品解耦。
     */
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
