package com.wshy.exceptioncore.Scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTest {

    private static final Logger logger = LoggerFactory.getLogger(ScheduledTest.class);


//    @Scheduled(cron="4 0 8-20 * * ?")
//    public void executeFileDownLoadTask() {
//
//        // 间隔2分钟,执行工单上传任务
//        Thread current = Thread.currentThread();
//        System.out.println("定时任务1:"+current.getId());
//        logger.info("ScheduledTest.executeFileDownLoadTask 定时任务1:"+current.getId()+ ",name:"+current.getName());
//    }

    @Scheduled(cron="0/4 * * * * ?")
    public void executeUploadTask() {

        // 间隔1分钟,执行工单上传任务
        Thread current = Thread.currentThread();
        System.out.println("定时任务2:"+current.getId());
        int i = 0;


            logger.info("当前i = " + i);
            logger.info("ScheduledTest.executeUploadTask 定时任务2:"+current.getId() + ",name:"+current.getName());



    }
//
//    @Scheduled(cron="0 0/3 5-23 * * ?")
//    public void executeUploadBackTask() {
//
//        // 间隔3分钟,执行工单上传任务
//        Thread current = Thread.currentThread();
//        System.out.println("定时任务3:"+current.getId());
//        logger.info("ScheduledTest.executeUploadBackTask 定时任务3:"+current.getId()+ ",name:"+current.getName());
//    }

}
