package zen.BuilderPattern.Car;

public class Client {
    public static void main(String[] args) {
//        BenzModel benzModel = new BenzModel();
//        ArrayList<String> sequence = new ArrayList<>();
//        sequence.add("engine boom");
//        sequence.add("start");
//        sequence.add("stop");
//        BenzBuilder benzBuilder = new BenzBuilder();
//        benzBuilder.setSequence(sequence);
//        CarModel carModel = benzBuilder.getCarModel();
//        carModel.run();
//        BMWBuilder bmwBuilder = new BMWBuilder();
//        bmwBuilder.setSequence(sequence);
//        CarModel carModel1 = bmwBuilder.getCarModel();
//        carModel1.run();
        Director director = new Director();
        for (int i = 0; i < 10000; i++) {
            director.getABenzModel().run();
        }
        for (int i = 0; i < 1000; i++) {
            director.getCBMWModel().run();
        }
    }
}
