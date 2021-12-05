/**
 * 与装饰增强接口有相同的接口，适配器模式+委托，实现了在不改变原有对象的情况下对其进行装饰
 *
 * 内部持有需要被装饰的对象：StringDisplay，交由子类去进行装饰
 *
 * 对要展示的对象Display，进行Border一方面的装饰
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/5 10:35 下午
 */
public abstract class Border extends Display {
    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
