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
    //1.闇�瑕佺煡閬撴墽琛岀殑浠诲姟
    //2.浠诲姟鎵ц鐨勬椂闂�

      //测试成功          ceshi   branch1
 
    @Scheduled(cron="0 24 16 * * ?")
    public  void work (){
        System.out.println("瀹炶返鍑虹湡鐭�" + LocalDateTime.now());
    }


}
