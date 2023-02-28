package org.example;


import java.util.ArrayList;
import java.util.List;

public class  SmartParrot<T>{

    private List<T> memory;

    public SmartParrot() {
        this.memory = new ArrayList<>();
    }

    public void learn(T trick){
        memory.add(trick);
    }

    public void forget(T trick){
        memory.remove(trick);
    }

    public List<T> getMemory(){
        return memory;
    }

    public void tellTrickFromMemory(int index) {
        System.out.println(memory.get(index).toString());
    }
}
