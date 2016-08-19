/**
 * Created by Administrator on 8/17/2016.
 */
public class MyThread {
    private String name;
    public MyThread(String name){

        this.name=name;

    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.name+",x= "+i);
        }

    }
}
