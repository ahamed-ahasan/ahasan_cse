package day15;
class A extends  Thread{
   public void run(){ // compulsory ahh void run method implement pananum , when we use thread method
       for (int i=0;i<100;i++){
           System.out.println(i);
       }
        // thread is used to run the class simultaneouslyyyyy    !!!!
    }
}

class B extends Thread{// compulsory ahh void run method implement pananum , when we use thread method
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
public class etry3_threads {
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        a.setPriority(10);
        a.start();// when we use thread , start method shoud be initialize to run the thread
        b.start();
    }
}
