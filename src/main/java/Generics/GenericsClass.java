package Generics;

import Collections.Task9.Animal;

public class GenericsClass<T extends String, V extends Animal, K extends Number> {
    private final T obj1;
    private final V obj2;
    private final K obj3;

    public GenericsClass(T obj1, V obj2, K obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public T getObj1() {
        return obj1;
    }

    public V getObj2() {
        return obj2;
    }

    public K getObj3() {
        return obj3;
    }

    public void getTypes() {
        System.out.println("obj1: " + obj1.getClass().getName());
        System.out.println("obj2: " + obj2.getClass().getName());
        System.out.println("obj3: " + obj3.getClass().getName());
    }
}
