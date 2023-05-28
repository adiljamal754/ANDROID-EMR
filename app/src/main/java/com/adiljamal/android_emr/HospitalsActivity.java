package com.adiljamal.android_emr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;

public class HospitalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);
    }

    @Override
    protected void onResume() {
        super.onResume();

        //variavel para saber se o google service está disponivel
        int errorCode = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this);

        switch (errorCode){
            case ConnectionResult.SERVICE_MISSING:
            case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED:
            case ConnectionResult.SERVICE_DISABLED:
                GoogleApiAvailability.getInstance().getErrorDialog(this, errorCode, 0, new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialog) {
                        finish();
                    }
                }).show();
                break;
            case ConnectionResult.SUCCESS:
                break;

        }
    }
}