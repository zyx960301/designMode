package zen.prototypePattern.deepClone;

public class Client {
    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("张三");
        Thing clone = thing.clone();
        clone.setValue("李四");
        System.out.println(thing.getValue());
    }
}
