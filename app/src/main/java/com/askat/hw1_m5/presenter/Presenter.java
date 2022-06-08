package com.askat.hw1_m5.presenter;

import com.askat.hw1_m5.Injector;
import com.askat.hw1_m5.model.CounterModel;
import com.askat.hw1_m5.view.Contracts;

public class Presenter {
    CounterModel model = Injector.getModel();
    Contracts.CounterView  view;

    public void increment(){
        model.increment();
        view.updateText(model.getCount());
    }
    public void decrement(){
        model.decrement();
        view.updateText(model.getCount());
    }
    public void attachView(Contracts.CounterView view){
        this.view = view;
    }
    public void toast() {
        if (model.getCount() == 10) {
            view.toast();
        }
    }
    public void colorChange() {
        if (model.getCount() == 15) {
            view.color();
        }
    }
}
