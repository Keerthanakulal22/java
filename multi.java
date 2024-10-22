
class Multithread1 extends Thread{
    public void run(){
        try{
           System.out.println("Thread"+Thread.currentThread().getName()+"is running");
        }
        catch(Exception e){
            System.out.println("Exception is caught");
            
        }
    }
}
public class multi{
    public static void main(String[] args){
        for(int i=0;i<8;i++){
            Multithread1 m1=new Multithread1();
            m1.start();
        }
    }
}
