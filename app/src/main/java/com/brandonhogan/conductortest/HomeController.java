package com.brandonhogan.conductortest;

import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.RouterTransaction;
import com.bluelinelabs.conductor.changehandler.FadeChangeHandler;
import com.brandonhogan.conductortest.Controllers.BaseController;

import butterknife.OnClick;

/**
 * Created by Brandon on 2/6/2017.
 * Description :
 */

public class HomeController extends BaseController {

    @NonNull
    @Override
    protected View inflateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        return inflater.inflate(R.layout.controller_home, container, false);
    }

    @OnClick(R.id.mybutton) void clicked() {
        Log.d("TAG", "Thing was clicked");

        getRouter().pushController(RouterTransaction.with(new DetailController())
        .pushChangeHandler(new FadeChangeHandler())
        .popChangeHandler(new FadeChangeHandler()));
    }
}
