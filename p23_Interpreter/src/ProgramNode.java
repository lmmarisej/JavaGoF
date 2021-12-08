/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/8 9:42 下午
 */
// <program> ::= program <command list>
public class ProgramNode extends Node {
    private Node commandListNode;

    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    public String toString() {
        return "[program " + commandListNode + "]";
    }
}
