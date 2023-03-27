package zen.BuilderPattern.Car;

import java.util.ArrayList;

public abstract class CarModel {
    //这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<String>();
    //模板是启动开始跑了
    protected abstract void start();
    //模板停止
    protected abstract void stop();
    //喇叭
    protected abstract void alarm();
    //引擎
    protected abstract void engineBoom();
    final public void run(){
        for (int i = 0; i < sequence.size(); i++) {
            String s = this.sequence.get(i);
            if(s.equalsIgnoreCase("start")){
                this.start();
            }else if(s.equalsIgnoreCase("stop")){
                this.stop();
            }else if(s.equalsIgnoreCase("alarm")){
                this.alarm();
            }else if(s.equalsIgnoreCase("engine boom")){
                this.engineBoom();
            }
        }
    }
    final public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }
}
