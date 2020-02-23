package com.example.pursue.tasks;

import android.content.Context;
import android.telephony.TelephonyManager;



public class GetDeviceIdTask  {
    private Context mContext;
    public GetDeviceIdTask(Context context){
        mContext = context;
    }

    private String mDeviceId;



//    @Override
//    public void run() {
//        // 真正自己的代码
//        TelephonyManager tManager = (TelephonyManager) mContext.getSystemService(
//                Context.TELEPHONY_SERVICE);
//        mDeviceId = tManager.getDeviceId();
//        PerformanceApp app = (PerformanceApp) mContext;
//        app.setDeviceId(mDeviceId);
//    }
}
