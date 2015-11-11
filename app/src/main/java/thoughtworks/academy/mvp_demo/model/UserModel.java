package thoughtworks.academy.mvp_demo.model;

import java.util.HashMap;
import java.util.Map;

import thoughtworks.academy.mvp_demo.bean.UserBean;

public class UserModel implements IUserModel{

    private static Map<Integer, UserBean> userBeanMap;

    public UserModel() {
        if(null == userBeanMap) {
            userBeanMap = new HashMap<>();
        }
    }

    @Override
    public UserBean load(int id) {
        return userBeanMap.get(id);
    }

    @Override
    public void save(int id, String name) {
        if(!userBeanMap.containsKey(id)) {
            UserBean userBean = new UserBean(id, name);
            userBeanMap.put(id, userBean);
        }
    }
}
