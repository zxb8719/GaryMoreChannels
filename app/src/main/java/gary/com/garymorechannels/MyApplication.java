package gary.com.garymorechannels;

import android.app.Application;

import gary.com.mlog.MLog;

/**
 * Created by Administrator on 2016/8/4.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MLog.init(true);
    }
}
