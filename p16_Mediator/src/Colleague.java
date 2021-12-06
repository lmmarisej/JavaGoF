/**
 * 负责定义与Mediator角色进行通信和做出决定的接口
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/6 9:51 下午
 */
public interface Colleague {
    void setMediator(Mediator mediator);

    void setColleagueEnabled(boolean enabled);
}
