import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 将内部信息整合，生成存档保存
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/8 5:48 下午
 */
public class Gamer {
    private int money;                          // 所持金钱
    private List<String> fruits = new ArrayList<>();      // 获得的水果
    private final Random random = new Random();       // 随机数生成器
    private static final String[] fruitsname = {      // 表示水果种类的数组
            "苹果", "葡萄", "香蕉", "橘子",
    };

    public Gamer(int money) {                   // 构造函数
        this.money = money;
    }

    public int getMoney() {                     // 获取当前所持金钱
        return money;
    }

    public void bet() {                         // 投掷骰子进行游戏
        int dice = random.nextInt(6) + 1;           // 掷骰子
        if (dice == 1) {                            // 骰子结果为1…增加所持金钱
            money += 100;
            System.out.println("所持金钱增加了。");
        } else if (dice == 2) {                     // 骰子结果为2…所持金钱减半
            money /= 2;
            System.out.println("所持金钱减半了。");
        } else if (dice == 6) {                     // 骰子结果为6…获得水果
            String f = getFruit();
            System.out.println("获得了水果(" + f + ")。");
            fruits.add(f);
        } else {                                    // 骰子结果为3、4、5则什么都不会发生
            System.out.println("什么都没有发生。");
        }
    }

    /**
     * 对实例变量进行复制存储
     */
    public Memento createMemento() {                // 拍摄快照
        Memento m = new Memento(money);
        for (String fruit : fruits) {
            if (fruit.startsWith("好吃的")) {         // 只保存好吃的水果
                m.addFruit(fruit);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {   // 撤销
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    private String getFruit() {                     // 获得一个水果
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }

    public String toString() {                      // 用字符串表示主人公状态
        return "[money = " + money + ", fruits = " + fruits + "]";
    }
}
