/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/8 9:43 下午
 */
// <repeat command> ::= repeat <number> <command list>
public class RepeatCommandNode extends Node {
    private int number;
    private Node commandListNode;

    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    public String toString() {
        return "[repeat " + number + " " + commandListNode + "]";
    }
}
