package bawei.com.zdwloginregister0508test.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

import bawei.com.zdwloginregister0508test.R;
import bawei.com.zdwloginregister0508test.model.ModelFusion;
import bawei.com.zdwloginregister0508test.model.RegisterBean;
import bawei.com.zdwloginregister0508test.presenter.PresenterFusion;


public class RegisterActivity extends AppCompatActivity implements IRegister {

    private EditText zedtel;
    private EditText zedpass;
    private PresenterFusion presenterFusion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initViews();
    }

    private void initViews() {
        zedtel = findViewById(R.id.zedtel);
        zedpass = findViewById(R.id.zedpass);
    }

    public void zRegister(View view) {
        presenterFusion = new PresenterFusion();
        presenterFusion.ShowRegistertoView(new ModelFusion(),this);
    }

    public void fan_hui(View view) {
        finish();
    }

    @Override
    public void ShowqRegister(RegisterBean registerBean) {
        Toast.makeText(RegisterActivity.this,registerBean.getMsg(),Toast.LENGTH_SHORT).show();
        startActivity(new Intent(RegisterActivity.this,MainActivity.class));
    }

    @Override
    public void ShowrError(RegisterBean registerBean) {
        Toast.makeText(RegisterActivity.this,registerBean.getMsg(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public String mobile() {
        return zedtel.getText().toString();
    }

    @Override
    public String pass() {
        return zedpass.getText().toString();
    }


}
