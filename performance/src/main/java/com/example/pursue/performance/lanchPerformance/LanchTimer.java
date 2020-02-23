package com.example.pursue.performance.lanchPerformance;

import android.content.Context;
import android.util.Log;

/**
 * 计算时间
 */
public class LanchTimer {


    private static long startT;

    /**
     * 起始时间
     */
    public static void startTime(){
       startT =  System.currentTimeMillis();
    }

    /**
     * 计算耗时
     */
    public static void endTime(){
       long costT =  System.currentTimeMillis()-startT;
        Log.i("LanchTimer cost",costT+"");
    }
}
