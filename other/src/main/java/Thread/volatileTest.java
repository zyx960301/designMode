package Thread;

public class volatileTest {
    static Integer a;
    static Boolean flag;
    public static void writer(){
        flag = true;
        a = 1;

    }
    public static void reader(){
        if(flag!=null && flag){
            System.out.println(a);
            a = 0;
            flag = false;
        }
    }
    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                writer();
            }
        }).start();
        new Thread(() -> {
            while (true){
                reader();
            }
        }).start();
        }
}