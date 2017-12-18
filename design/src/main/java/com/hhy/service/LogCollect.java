package com.hhy.service;

import com.hhy.designmode.LogProcesser;

/**
 * @author hehy
 * @create 2017-12-18
 **/
public class LogCollect {
    private LogProcesser logProcesser;
    public LogCollect(){

    }

    public LogCollect(LogProcesser logProcesser){
        this.logProcesser = logProcesser;
    }

    public void logProcess(){
        System.out.println(logProcesser.getMethodName());
    }
}
