package bawei.com.zdwloginregister0508test.view;


import bawei.com.zdwloginregister0508test.model.LoginBean;

public interface IMainView {

    void ShowLogin(LoginBean loginBean);

    void ShowlError(LoginBean loginBean);

    String mobile();

    String pass();
}
