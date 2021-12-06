/**
 * 用来解决问题，是职责链上的抽象
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/6 8:33 下午
 */
public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {  // 设置要推卸给的对象
        this.next = next;
        return next;
    }

    public void support(Trouble trouble) {  // 解决问题的步骤
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    protected abstract boolean resolve(Trouble trouble); // 解决问题的方法

    protected void done(Trouble trouble) {  // 解决
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble) {  // 未解决
        System.out.println(trouble + " cannot be resolved.");
    }

    public String toString() {              // 显示字符串
        return "[" + name + "]";
    }
}
