package com.wanmeng.TimingTask;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created by PNC on 2019/9/1.
 */
/*
*   @ClassName  SaticScheduleTask
*   @Desrciption TODO
*  @Author  PNC
*  @Date  2019/9/1 21:36
*  @Vesion v0.1
*/

@Service
@EnableScheduling
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.wanmeng.TimingTask.*" )
public class SaticScheduleTask {
    //1.需要知道执行的任务
    //2.任务执行的时间

    @Scheduled(cron="0 24 16 * * ?")
    public  void work (){
        System.out.println("实践出真知" + LocalDateTime.now());
    }


}
