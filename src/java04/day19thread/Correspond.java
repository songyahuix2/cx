package java04.day19thread;
class Resource{
    String name;
    String sex;
    boolean flag;
}
class Input implements Runnable{
    Resource r;
    Input(Resource r){
        this.r = r;
    }

    @Override
    public void run() {
        int x = 0;
        while (true){
            synchronized (r){
                if(x==0){
                    r.name = "丽丽";
                    r.sex = "女";
                }
                else {
                    r.name = "mike";
                    r.sex = "male";
                }
            }
            x=(++x)%2;
        }
    }
}
class Output implements Runnable{
    Resource r;
    Output(Resource r){
        this.r = r;
    }
    @Override
    public void run() {
        while (true){
            synchronized (r){
                System.out.println("r.name:"+r.name+";"+"r.sex:"+r.sex);
            }
        }
    }
}
public class Correspond {
    public static void main(String[] args) {
        Resource r = new Resource();
        Input i = new Input(r);
        Output o = new Output(r);
        Thread t1 = new Thread(i);
        Thread t2 = new Thread(o);
        t1.start();
        t2.start();

    }
}
