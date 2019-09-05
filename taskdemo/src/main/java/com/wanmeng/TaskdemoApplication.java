package com.wanmeng;
import com.wanmeng.TimingTask.Controller.DynamicScheduleTask;
import com.wanmeng.TimingTask.SaticScheduleTask;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(value="com.wanmeng.TimingTask.Dao")
@SpringBootApplication
@EnableAutoConfiguration
public class TaskdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamicScheduleTask.class, args);
//		Timer timer = new Timer();
//		//创建需要执行的任务
//		TimerTask timerTask = new TimerTask() {
//			@Override
//			public void run() {
//				System.out.println("是否不能执行");
//			}
//		};
//
//		timerTask.cancel();
//		Field field = null;
//		try {
//			field = timerTask.getClass().getDeclaredField("state");
//			field.setAccessible(true);
//			field.set(timerTask, 0);
//		} catch (NoSuchFieldException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		}

//		timer.schedule(timerTask,3);
//
//		long  time =timerTask.scheduledExecutionTime();
//
//		System.out.println("执行的时间："+time);

	}

}
