package zen.BuilderPattern.Car;

import java.util.ArrayList;

public class BenzBuilder extends CarBulider{
    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
