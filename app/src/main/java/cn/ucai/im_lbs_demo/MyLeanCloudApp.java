package cn.ucai.im_lbs_demo;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by Administrator on 2017/7/31.
 */

public class MyLeanCloudApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化参数依次为 this, AppId, AppKey
        AVOSCloud.initialize(this, "UIKOFr6GAMmB6RePdi88tsRe-gzGzoHsz", "fHgXGefTt8tLg39SaIyBzd0P");
        //调试使用，开发时注掉
        AVOSCloud.setDebugLogEnabled(true);
    }
}

