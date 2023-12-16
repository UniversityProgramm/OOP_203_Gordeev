import java.io.Serializable;
class Animal{}
class Cat extends Animal implements Serializable{}

public class GenericClass <T extends String,V extends Animal,K extends Number> {
    private T obT;
    private V obV;
    private K obK;

    public GenericClass(T obT, V obV, K obK) {
        this.obT = obT;
        this.obV = obV;
        this.obK = obK;
    }

    public T getObT() {
        return obT;
    }

    public V getObV() {
        return obV;
    }

    public K getObK() {
        return obK;
    }
    public void showTypes(){
        System.out.println("Type of T: "+ obT.getClass().getName());
        System.out.println("Type of V: "+ obV.getClass().getName());
        System.out.println("Type of K: "+ obK.getClass().getName());
    }

    public static void main (String[] args){
        GenericClass<String, Cat, Integer> generic = new GenericClass<>("qwe", new Cat(), 111);
        generic.showTypes();
    }
}
