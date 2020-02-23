package com.example.pursue.androidperformance;

import android.app.Application;
import android.content.Context;

import com.example.pursue.performance.lanchPerformance.LanchTimer;
import com.example.pursue.tasks.GetDeviceIdTask;
import com.example.pursue.tasks.InitFrescoTask;

public class PerformanceApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        LanchTimer.startTime();
        new GetDeviceIdTask(this);
        LanchTimer.endTime();

        LanchTimer.startTime();
        new InitFrescoTask();
        LanchTimer.endTime();
    }
}
