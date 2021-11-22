package com.example.demo.controller;

import org.springframework.stereotype.Component;

/**
 * 启动暂停工具类
 * @author 守候
 *
 */
@Component
public class QidongZanting extends Thread{
	

	    private final Object lock = new Object();

	    private boolean pause = false;

	    /**
	     * 调用该方法实现线程的暂停
	     */
	    void pauseThread(){
	        pause = true;
	        System.out.println("进入暂停："+pause);
	    }


	    /*
	    	调用该方法实现恢复线程的运行
	     */
	    void resumeThread(){
	        pause =false;
	        synchronized (lock){
	            lock.notify();
	        }
	    }

	    void stopTherad() {
	    	this.interrupt();
	    }
	    
	    /**
	     * 这个方法只能在run 方法中实现，不然会阻塞主线程，导致页面无响应
	     */
	    void onPause() {
	        synchronized (lock) {
	            try {
	                lock.wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    @Override
	    public void run() {
	        int index = 0;
	        while(true){
	        	   System.out.println("进入暂停2："+pause);
	            while (pause){
	                onPause();
	            }
	            try {
	            	if(this.isInterrupted()) {
	            		 System.out.println("进入结束：");
	            		break;
	            	}
	                System.out.println(index);
	                Thread.sleep(1000);
	                ++index;
	            }catch (Exception e){
	                e.printStackTrace();
	                break;
	            }
	        }
	    }


}
