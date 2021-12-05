/**
 * 被访问的对象的抽象
 *
 * 声明接收访问者类型的方法
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/5 11:06 下午
 */
public interface Element {
    void accept(Visitor v);
}
