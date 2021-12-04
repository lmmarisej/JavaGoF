package factory;

/**
 * 抽象工厂，负责定义用于生成抽象产品的接口
 *
 * 使得增加具体工厂非常容易，需要编写哪些类和需要实现哪些方法都非常清楚
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 4:08 下午
 */
public abstract class Factory {

    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("没有找到 " + classname + "类。");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
