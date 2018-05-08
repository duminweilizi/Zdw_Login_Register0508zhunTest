package bawei.com.zdwloginregister0508test.view;


import bawei.com.zdwloginregister0508test.model.RegisterBean;

public interface IRegister {

    void ShowqRegister(RegisterBean registerBean);

    void ShowrError(RegisterBean registerBean);

    String mobile();

    String pass();
}
