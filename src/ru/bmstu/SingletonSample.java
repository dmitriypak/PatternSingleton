package ru.bmstu;

/**
 * Created by DP on 05.02.2018.
 */
public class SingletonSample {

    private static SingletonSample instance;

    public static SingletonSample getInstance(){
        if(instance==null){
            instance = new SingletonSample();
        }
        return  instance;
    }
    private SingletonSample() {
    }

    public void print(){
        System.out.println("instance = " + this);
    }
}
