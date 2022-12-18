package org.thread;

public class ThreadB implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i <= 500 ; i++){
            System.out.println(i);

            try{
                Thread.sleep(i);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
