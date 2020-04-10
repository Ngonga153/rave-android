package com.flutterwave.raveandroid.rave_presentation.sabankaccount;

import android.support.annotation.Nullable;

public class NullSaBankCallback implements SaBankAccountCallback {

    @Override
    public void showProgressIndicator(boolean active) {

    }

    @Override
    public void onError(String errorMessage, @Nullable String flwRef) {

    }

    @Override
    public void onSuccessful(String flwRef) {

    }

    @Override
    public void showAuthenticationWebPage(String authUrl) {

    }

}
