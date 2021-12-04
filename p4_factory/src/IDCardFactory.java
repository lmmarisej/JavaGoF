import java.util.ArrayList;
import java.util.List;

/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 1:40 上午
 */
public class IDCardFactory extends Factory {

    private final List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
