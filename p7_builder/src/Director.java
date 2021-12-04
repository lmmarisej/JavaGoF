/**
 * 负责使用Builder角色的接口来生成实例
 *
 * 不关心Builder具体实例，只调用只在Builder角色中定义的方法
 *
 * 只有不知道子类才能替换，因为可替换，组件才具有高价值
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 3:18 下午
 */
public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {                       // 编写文档
        builder.makeTitle("Greeting");              // 标题
        builder.makeString("从早上至下午");         // 字符串
        builder.makeItems(new String[]{             // 条目
                "早上好。",
                "下午好。",
        });
        builder.makeString("晚上");                 // 其他字符串
        builder.makeItems(new String[]{             // 其他条目
                "晚上好。",
                "晚安。",
                "再见。",
        });
        builder.close();                            // 完成文档
    }
}
