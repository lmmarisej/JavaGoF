/**
 * FlyweightFactory的使用者
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/8 6:37 下午
 */
public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }
        BigString bs = new BigString(args[0]);
        bs.print();
    }
}
