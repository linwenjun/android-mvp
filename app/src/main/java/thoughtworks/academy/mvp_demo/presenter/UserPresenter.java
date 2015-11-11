package thoughtworks.academy.mvp_demo.presenter;

import thoughtworks.academy.mvp_demo.bean.UserBean;
import thoughtworks.academy.mvp_demo.model.IUserModel;
import thoughtworks.academy.mvp_demo.model.UserModel;
import thoughtworks.academy.mvp_demo.view.IUserView;

public class UserPresenter {
    private IUserView mUserView;
    private IUserModel mUserModel;

    public UserPresenter(IUserView mUserView) {
        this.mUserView = mUserView;
        this.mUserModel = new UserModel();
    }

    public void saveUser(int id, String name) {
        mUserModel.save(id, name);
    }

    public void loadUser(int id) {
        UserBean user = mUserModel.load(id);
        mUserView.setName(user.getName());
    }

}
