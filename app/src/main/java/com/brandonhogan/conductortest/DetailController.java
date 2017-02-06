package com.brandonhogan.conductortest;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;
import com.brandonhogan.conductortest.Controllers.BaseController;

/**
 * Created by Brandon on 2/6/2017.
 * Description :
 */

public class DetailController extends BaseController {

    @NonNull
    @Override
    protected View inflateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        return inflater.inflate(R.layout.controller_detail, container, false);
    }
}
