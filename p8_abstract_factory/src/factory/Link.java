package factory;

/**
 * 抽象产品，负责定义抽象工厂所需要的零件和产品接口
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 4:04 下午
 */
public abstract class Link extends Item {
   protected String url;

   public Link(String caption, String url) {
      super(caption);
      this.url = url;
   }
}
