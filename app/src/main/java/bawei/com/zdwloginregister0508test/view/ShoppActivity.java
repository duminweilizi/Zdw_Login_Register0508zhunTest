package bawei.com.zdwloginregister0508test.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.drawee.view.SimpleDraweeView;



import bawei.com.zdwloginregister0508test.R;


public class ShoppActivity extends AppCompatActivity {
    String url  = "https://ps.ssl.qhimg.com/dm/420_207_/t01232d36b7107a5367.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopp);
        SimpleDraweeView simpleDraweeView = findViewById(R.id.simple);
        simpleDraweeView.setImageURI(url);
    }
}
