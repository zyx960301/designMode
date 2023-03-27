package zen.BuilderPattern.Car;

import java.util.ArrayList;

public class BMWBuilder extends CarBulider{
    private BMWModel benz = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
