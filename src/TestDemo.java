public class TestDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		MyThread mt1=new MyThread("Thread1");
//		MyThread mt2=new MyThread("Thread2");
//		MyThread mt3=new MyThread("Thread3");
////		mt1.start();
////		mt2.start();
////		mt3.start();
//
//			new Thread(mt1).start();
//			new Thread(mt2).start();
//			new Thread(mt3).start();


        final String name="Thread";
        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                for (int i = 0; i < 10; i++) {
                    System.out.println(name+",x= "+i);
                }
            }
        }).start();
    }

}
