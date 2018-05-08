package bawei.com.zdwloginregister0508test.model;


import com.google.gson.Gson;

import java.util.Map;

import bawei.com.zdwloginregister0508test.util.HttpUtils;

public class ModelFusion implements IModel {

    @Override
    public void getLogin(String murl, Map<String, String> map, final LoginListener loginListener) {

        HttpUtils httpUtils = HttpUtils.getHttpUtils();
        httpUtils.okPost(murl,map);
        httpUtils.setOkLoadListener(new HttpUtils.OkLoadListener() {
            @Override
            public void okLoadSuccess(String json) {

                //将数据传入p层
                //解析json  如果code是0，成功，否则失败
                LoginBean loginBean = new Gson().fromJson(json, LoginBean.class);
                if (loginBean.getCode().equals("0")){
                    loginListener.LoginSuccess(json);
                }else {
                    loginListener.LoginError(json);
                }

            }

            @Override
            public void okLoadError(String error) {
                loginListener.LoginError(error);
            }
        });
    }

    @Override
    public void getRegister(String rurl, Map<String, String> map, final RegisterListener registerListener) {

        HttpUtils httpUtils = HttpUtils.getHttpUtils();
        httpUtils.okPost(rurl,map);
        httpUtils.setOkLoadListener(new HttpUtils.OkLoadListener() {
            @Override
            public void okLoadSuccess(String json) {

                RegisterBean registerBean = new Gson().fromJson(json, RegisterBean.class);
                if(registerBean.getCode().equals("0")){
                    registerListener.RegisterSuccess(json);
                }else {
                    registerListener.RegisterError(json);
                }

            }

            @Override
            public void okLoadError(String error) {
                registerListener.RegisterError(error);
            }
        });
    }
}
