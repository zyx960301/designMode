package Thread.singleton;
//单例双检索
public class Demo02 {
    //防止指令重排
    private volatile static Demo02 instance;

    private Demo02() {
    }
    private static Demo02 getInstance(){
        if(instance == null){
            synchronized (Demo02.class){
                if (instance == null){
                    instance = new Demo02();
                }
            }
        }
        return instance;
    }
//new 创建过程  ----使用volatile 
    //在栈空间创建引用地址
    //以类文件为模板在堆空间对象分配内存
    //成员变量初始化
    //使用构造函数初始化
    //将用引用值赋给左侧存储变量
    //引用值已经赋给左侧变量，但没有初始化-判断时有值，调用instance会发生错误。
}
