package com.zipcodewilmington.assessment2.part2;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Router {

    LinkedHashMap<String, String> myPair = new LinkedHashMap<>();


    public Router(){

    }


    public void add(String path, String controller) {
        myPair.put(path, controller);
    }

    public Integer size() {
        return myPair.size();
    }

    public String getController(String path) {
        return myPair.get(path);
    }

    public void update(String path, String studentController) {
        myPair.put(path, studentController);
    }

    public void remove(String path) {
        myPair.remove(path);
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : myPair.entrySet()){
            builder.append(entry.getKey());
            builder.append(entry.getValue());
            builder.append("\n");
        }
        return builder.toString();
    }
}
