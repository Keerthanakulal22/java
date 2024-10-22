class MultiThread1 extends Thread{
    public void run(){
        System.out.println("Thread" +Thread.currentThread().getName()+" is running");
    }
}
public class Multithread {
    public static void main(String[] args){
        for(int i=1;i<16;i++){
            MultiThread1 Mt1=new MultiThread1(); 
             Mt1.start();
        }
      
    }
}