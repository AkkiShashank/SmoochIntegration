package gohelper.in.koneshank.smoochintegration.application;

import android.app.Application;

import io.smooch.core.Smooch;

/**
 * Created by shashankgupta on 14/06/16.
 */
public class SmoochApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Smooch.init(this, "Your KEY");
    }
}
