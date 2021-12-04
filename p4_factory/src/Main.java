/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 1:39 上午
 */
public class Main {

    public static void main(String[] args) {
        IDCardFactory factory = new IDCardFactory();
        Product product = factory.create("蔡徐坤");
        product.use();
    }
}
