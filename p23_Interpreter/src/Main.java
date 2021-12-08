import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/8 9:44 下午
 */
public class Main {
    public static void main(String[] args) {
        try {
            String path = Main.class.getClassLoader().getResource("program.txt").getPath();
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
