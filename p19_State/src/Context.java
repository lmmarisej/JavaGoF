/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/8 6:11 下午
 */
public interface Context {
    void setClock(int hour);                // 设置时间

    void changeState(State state);          // 改变状态

    void callSecurityCenter(String msg);    // 联系警报中心

    void recordLog(String msg);             // 在警报中心留下记录
}
