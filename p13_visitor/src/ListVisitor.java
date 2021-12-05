import java.util.Iterator;

/**
 * 访问者，实现所有的访问逻辑，针对不同的访问类型编写不同的业务处理逻辑
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/5 11:05 下午
 */
public class ListVisitor extends Visitor {
    private String currentdir = "";                         // 当前访问的文件夹的名字

    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
