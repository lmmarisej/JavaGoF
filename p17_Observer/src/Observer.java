/**
 * 负责接收来自NumberGenerator状态变化通知
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/6 10:31 下午
 */
public interface Observer {
    void update(NumberGenerator generator);
}
