package com.wshy.exceptioncore.Scheduled;

import java.util.Calendar;

import java.util.Date;

import java.util.Timer;

import java.util.TimerTask;





public class Timmer {

    /**

     *  第一种方法：设定指定任务task在指定时间执行，只执行一次

     *  schedule(TimerTask task, Date time)

     */

    public static void timer1() {

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {

            public void run() {

                System.out.println(new Date() +"\t"+"---指定要执行任务---");

            }

        },  new Date(System.currentTimeMillis() + 2000));

    }



    /**

     *  第二种方法：设定指定任务task在延迟delay执行,只执行一次

     *  schedule(TimerTask task, long delay)

     *  delay单位毫秒

     */

    public static void timer2(){

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {

            public void run() {

                System.out.println(new Date() +"\t"+"---指定要执行任务---");

            }

        }, 2000);

    }



    /**

     *  第三种方法：设定指定任务task在指定延迟delay后进行周期性执行，周期时间为period

     *  schedule(TimerTask task, long delay, long period)

     *  scheduleAtFixedRate(TimerTask task, long delay, long period)

     *  delay,period 单位为毫秒

     */

    public static void timer3() {

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {

            public void run() {

                System.out.println(new Date() +"\t"+"---指定要执行任务---");

            }

        }, 1000, 1000);

    }

    /**

     *  第四种方法：设定指定的任务task在指定的时间firstTime开始进行重复的周期性执行，周期时间为period

     *  schedule(TimerTask task, Date firstTime, long period)

     *  scheduleAtFixedRate(TimerTask task,Date firstTime,long period)

     *  period 单位为毫秒

     */

    public static void timer4() {

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.HOUR_OF_DAY, 12); // 控制时

        calendar.set(Calendar.MINUTE, 0);       // 控制分

        calendar.set(Calendar.SECOND, 0);       // 控制秒



        Date time = calendar.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {

            public void run() {

                System.out.println(new Date() +"\t"+"---指定要执行任务---");

            }

        }, time, 1000);

    }



    /**

     * schedule和scheduleAtFixedRate方法的区别：

     * （1）schedule方法：如果第一次执行时间被delay了，随后的执行时间按照上一次实际执行完成的时间点进行计算,即：下一次的执行时间点=上一次程序执行完成的时间点+间隔时间

     * （2）scheduleAtFixedRate方法：如果第一次执行时间被delay了，随后的执行时间按照上一次开始的时间点进行计算，即：下一次的执行时间点=上一次程序开始执行的时间点+间隔时间，

     * 并且前一个任务的执行时间大于间隔时间，就会与当前任务重叠,TimerTask中的执行体需要考虑线程同步

     */

    public static void main(String[] args) {
        Timmer timmer = new Timmer();
//        timer1();
//        timer2();
//        timer3();
        timer4();
    }



}
