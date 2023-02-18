package Thread.singleton.Sychronized;
class Sychronizeds {

}
class A{
    public  synchronized  void func(){
        //1、修饰实例方法
    }
}
class B{
    public void func(){
        synchronized (this){
        //2、修饰代码块
        }
    }
}
class C{
    public static synchronized void func(){
        //3、修饰静态方法
    }
}
//1、修饰实例方法
//2、修饰代码块
//3、修饰静态方法
//锁添加在哪里
//1、实例对象 2、类对象
