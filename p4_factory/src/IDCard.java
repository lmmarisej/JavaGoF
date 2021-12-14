
/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 1:48 上午
 */
public class IDCard extends Product {

    private String owner;

    IDCard(String owner) {
        System.out.println("制作" + owner + "的 ID 卡。");
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    void use() {
        System.out.println("使用" + owner + "的 ID 卡。");
    }
}
