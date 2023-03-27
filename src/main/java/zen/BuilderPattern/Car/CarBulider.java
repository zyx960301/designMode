package zen.BuilderPattern.Car;

import java.util.ArrayList;
//抽象汽车组装者
public abstract class CarBulider {
    //组装顺序
    public abstract void setSequence(ArrayList<String> sequence);
    //获取车辆模型
    public abstract CarModel getCarModel();
}
