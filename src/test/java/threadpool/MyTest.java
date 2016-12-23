package threadpool;

import com.gx.thread.PrintTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by gx on 2016/12/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring/spring.xml"})
public class MyTest {
    @Resource(name="taskExecutor")
    private ThreadPoolTaskExecutor taskExecutor;


    @Test
    public  void test1(){
//
        taskExecutor.execute(new PrintTask("Test1"));
        taskExecutor.execute(new PrintTask("Test2"));

        for(;;){
            int count = taskExecutor.getActiveCount();
            System.out.println("Active Threads : " + count);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            if(count==0){
                taskExecutor.shutdown();
                break;
            }
        }
    }

}
