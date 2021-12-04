/**
 * 实现接口方法，在接口方法中去调用实例的方法，达成适配的目的
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/3 11:43 下午
 */
public class PrintBanner extends Banner implements Print {

    // 委托，无需继承Banner
    // private Banner banner;
    // public PrintBanner(String string) {
    //     this.banner = new Banner(string);
    // }

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        // banner.showWithParen();      // 委托调用
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
