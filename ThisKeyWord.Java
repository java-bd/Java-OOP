package com.netcse.java;

public class Main {

    int id;
    String name;

    Main(int i, String n){
        id = i;
        name = n;
    }

    void setData(int id, String name){
        this.id = id;
        this.name = name;
    }

    void getData(){
        System.out.println(id + " -> " + name);
    }


    public static void main(String[] args) {
        Main mn = new Main(10, "ten");
        mn.setData(20, "twenty");
        mn.getData();
    }
}
