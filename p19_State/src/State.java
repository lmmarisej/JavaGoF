/**
 * 不同状态进行不同的接口处理
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/8 6:12 下午
 */
public interface State {
    void doClock(Context context, int hour);    // 设置时间

    void doUse(Context context);                // 使用金库

    void doAlarm(Context context);              // 按下警铃

    void doPhone(Context context);              // 正常通话
}
