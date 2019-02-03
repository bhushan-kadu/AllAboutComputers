package com.wordpress.bhooshankadu.allaboutcomputers;
//activity to select the language of app
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

import java.util.Locale;

public class LanguageActivity extends Activity {
    Locale myLocale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
    }

    public void setLocale(String lang) {

        myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, MainActivity.class);
        startActivity(refresh);
    }

    public void changeLanguage(View view) {
        setLocale("mr");
    }
      /*  switch(view.getTag().toString()){

            case "Hindi":
                setLocale("hi");
                break;

            case "English":
                setLocale("en");
                break;

            case "Marathi":
                setLocale("mr");
                break;
        }
    }*/

}
