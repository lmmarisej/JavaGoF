import java.util.ArrayList;

/**
 * 定义了观察者和删除观察者的方法
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/6 10:30 下午
 */
public abstract class NumberGenerator {
    private final ArrayList<Observer> observers = new ArrayList<>();        // 保存Observer们

    public void addObserver(Observer observer) {    // 注册Observer
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) { // 删除Observer
        observers.remove(observer);
    }

    public void notifyObservers() {               // 向Observer发送通知
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public abstract int getNumber();                // 获取数值

    public abstract void execute();                 // 生成数值
}
