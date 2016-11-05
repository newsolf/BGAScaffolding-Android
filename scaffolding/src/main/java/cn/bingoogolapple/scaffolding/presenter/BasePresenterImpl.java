package cn.bingoogolapple.scaffolding.presenter;

import cn.bingoogolapple.scaffolding.App;
import cn.bingoogolapple.scaffolding.view.BaseView;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:16/8/18 下午8:41
 * 描述:
 */
public class BasePresenterImpl<V extends BaseView> implements BasePresenter {
    protected V mView;
    protected App mApp;

    public BasePresenterImpl(V view) {
        mView = view;
        mApp = App.getInstance();
    }
}