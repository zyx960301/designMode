package zen.prototypePattern.ShallowClone;

import java.util.ArrayList;

//浅克隆
public class Thing implements Cloneable{
    private ArrayList<String> arrayList = new ArrayList<String>();
    public Thing clone(){
        Thing thing = null;
        try {
            thing = (Thing)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
    public void setValue(String value){
        this.arrayList.add(value);
    }
    public ArrayList<String> getValue(){
        return this.arrayList;
    }
}
