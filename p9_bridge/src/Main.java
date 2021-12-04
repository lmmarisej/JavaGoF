/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/4 5:27 下午
 */
public class Main {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("China"));
        Display d2 = new CountDisplay(new StringDisplayImpl("World"));
        // 方便分别扩展，扩展后的功能可以被所有实现使用
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Unoverse"));
        d1.display();
        d2.display();
        d3.multiDisplay(3);
    }
}
