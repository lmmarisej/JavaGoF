import java.util.ArrayList;

/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/8 9:42 下午
 */
// <command list> ::= <command>* end
public class CommandListNode extends Node {
    private ArrayList list = new ArrayList();

    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    public String toString() {
        return list.toString();
    }
}
