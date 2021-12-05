/**
 * 访问者的抽象
 *
 * 声明针对不同类型的所有API
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/5 11:03 下午
 */
public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
