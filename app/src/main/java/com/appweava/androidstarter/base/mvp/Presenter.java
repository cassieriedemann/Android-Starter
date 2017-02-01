package com.appweava.androidstarter.base.mvp;

/**
 * Presenter
 * <p>
 * Interface defining common methods for all presenters. Also defines that all presenters must
 * attach some sort of {@link BaseView}
 *
 * @see BaseView
 */
public interface Presenter<T extends BaseView> {

    void attachView(T view);

    void detachView();
}
