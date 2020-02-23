package com.example.pursue.performance.lanchPerformance;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


/**
 * AOp计算时间
 */
@Aspect
public class LanchTimerAop {


    @Around("call(* com.example.pursue.androidperformance.PerformanceApplication.**(..))")
    public void getTime(ProceedingJoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        String name = signature.toShortString();
        long time = System.currentTimeMillis();
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        Log.e(name + " getTime cost ",(System.currentTimeMillis() - time)+"");
    }
}
