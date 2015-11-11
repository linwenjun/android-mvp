package thoughtworks.academy.mvp_demo.view;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import thoughtworks.academy.mvp_demo.R;
import thoughtworks.academy.mvp_demo.presenter.UserPresenter;


public class MainActivity extends Activity implements OnClickListener, IUserView {

    private TextView nameText;
    private UserPresenter userPresenter;
    private Button saveButton, loadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = (TextView)findViewById(R.id.name);
        userPresenter = new UserPresenter(this);

        saveButton = (Button)findViewById(R.id.button_save);
        loadButton = (Button)findViewById(R.id.button_load);

        saveButton.setOnClickListener(this);
        loadButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.e("111", "111");
        switch (view.getId()) {
            case R.id.button_save:
                userPresenter.saveUser(getId(), getName());
                break;
            case R.id.button_load:
                userPresenter.loadUser(getId());
                break;
            default:
                break;
        }
    }

    @Override
    public int getId() {
        TextView nameText = (TextView)findViewById(R.id.id);
        return  Integer.parseInt(nameText.getText().toString());
    }

    @Override
    public String getName() {
        return  nameText.getText().toString();
    }

    @Override
    public void setName(String name) {
        nameText.setText(name);
    }


}
