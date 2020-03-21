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
	    //确定可以提交相关的代码吗？   encoding 编码
		SpringApplication.run(DynamicScheduleTask.class, args);
//		Timer timer = new Timer();
//		//鍒涘缓闇�瑕佹墽琛岀殑浠诲姟
//		TimerTask timerTask = new TimerTask() {
//			@Override
//			public void run() {
//				System.out.println("鏄惁涓嶈兘鎵ц");
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
//		System.out.println("鎵ц鐨勬椂闂达細"+time);

	}

}
