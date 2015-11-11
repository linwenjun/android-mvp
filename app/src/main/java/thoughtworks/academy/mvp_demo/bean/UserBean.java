package thoughtworks.academy.mvp_demo.bean;

public class UserBean {

    private int id;
    private String name;

    public UserBean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
