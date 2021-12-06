/**
 * 负责定义与Colleague角色进行通信和做出决定的接口
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/6 9:50 下午
 */
public interface Mediator {
    void createColleagues();

    void colleagueChanged();
}
