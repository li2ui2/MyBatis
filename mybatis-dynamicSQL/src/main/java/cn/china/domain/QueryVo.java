package cn.china.domain;

import java.util.List;

/**
 * @author LiWei
 * @date 2021/01/18 19:52
 * @description
 */
public class QueryVo {
    private User user;
    private List<Integer> ids;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
