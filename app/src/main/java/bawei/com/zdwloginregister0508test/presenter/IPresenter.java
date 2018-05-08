package bawei.com.zdwloginregister0508test.presenter;


import bawei.com.zdwloginregister0508test.model.IModel;
import bawei.com.zdwloginregister0508test.view.IMainView;
import bawei.com.zdwloginregister0508test.view.IRegister;

public interface IPresenter {

    void ShowLogintoView(IModel iModel, IMainView iMainView);

    void ShowRegistertoView(IModel iModel, IRegister iRegister);
}
