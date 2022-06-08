package com.askat.hw1_m5;

import com.askat.hw1_m5.model.CounterModel;
import com.askat.hw1_m5.presenter.Presenter;

public class Injector {

    public static Presenter getPresenter(){
        return new Presenter();
    }
    public static CounterModel getModel(){
        return new CounterModel();
    }
}
