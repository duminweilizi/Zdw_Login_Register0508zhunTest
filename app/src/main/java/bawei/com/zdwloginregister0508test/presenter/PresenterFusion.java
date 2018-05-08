package bawei.com.zdwloginregister0508test.presenter;


import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

import bawei.com.zdwloginregister0508test.model.IModel;
import bawei.com.zdwloginregister0508test.model.LoginBean;
import bawei.com.zdwloginregister0508test.model.LoginListener;
import bawei.com.zdwloginregister0508test.model.RegisterBean;
import bawei.com.zdwloginregister0508test.model.RegisterListener;
import bawei.com.zdwloginregister0508test.util.ApiUtil;
import bawei.com.zdwloginregister0508test.view.IMainView;
import bawei.com.zdwloginregister0508test.view.IRegister;

public class PresenterFusion implements IPresenter {
    @Override
    public void ShowLogintoView(IModel iModel, final IMainView iMainView) {

        Map<String, String> lmap = new HashMap<>();
        lmap.put("mobile",iMainView.mobile());
        lmap.put("password",iMainView.pass());

        iModel.getLogin(ApiUtil.login_url, lmap, new LoginListener() {
            @Override
            public void LoginSuccess(String json) {

                LoginBean loginBean = new Gson().fromJson(json, LoginBean.class);
                iMainView.ShowLogin(loginBean);
            }

            @Override
            public void LoginError(String error) {
                LoginBean loginBean = new Gson().fromJson(error, LoginBean.class);
                iMainView.ShowlError(loginBean);
            }
        });
    }

    @Override
    public void ShowRegistertoView(IModel iModel, final IRegister iRegister) {

        Map<String, String> rmap = new HashMap<>();
        rmap.put("mobile",iRegister.mobile());
        rmap.put("password",iRegister.pass());

        iModel.getRegister(ApiUtil.register_url, rmap, new RegisterListener() {
            @Override
            public void RegisterSuccess(String json) {

                RegisterBean registerBean = new Gson().fromJson(json, RegisterBean.class);
                iRegister.ShowqRegister(registerBean);
            }

            @Override
            public void RegisterError(String error) {

                RegisterBean registerBean = new Gson().fromJson(error, RegisterBean.class);
                iRegister.ShowrError(registerBean);
            }
        });
    }


}
