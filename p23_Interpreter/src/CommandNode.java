/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/8 9:43 下午
 */
// <command> ::= <repeat command> | <primitive command>
public class CommandNode extends Node {
    private Node node;

    public void parse(Context context) throws ParseException {
        if (context.currentToken().equals("repeat")) {
            node = new RepeatCommandNode();
        } else {
            node = new PrimitiveCommandNode();
        }
        node.parse(context);
    }

    public String toString() {
        return node.toString();
    }
}
