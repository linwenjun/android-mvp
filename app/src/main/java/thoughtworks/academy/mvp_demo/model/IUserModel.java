package thoughtworks.academy.mvp_demo.model;

import thoughtworks.academy.mvp_demo.bean.UserBean;

public interface IUserModel {
    UserBean load(int id);
    void save(int id, String name);
}
