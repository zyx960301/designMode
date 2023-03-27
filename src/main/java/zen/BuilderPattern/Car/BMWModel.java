package zen.BuilderPattern.Car;

public class BMWModel extends CarModel{
    @Override
    protected void start() {
        System.out.println("宝马车跑起来");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停止");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声是这样的");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎声是这样的");
    }
}
