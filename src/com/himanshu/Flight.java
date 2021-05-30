package com.himanshu;

public class Flight {
    int passengers;
    int seats;
    String name;
    private static int allPass = 100;
    Flight() {};
    Flight(int seats, int pass){
        this.seats = seats;
        this.passengers = pass;
        allPass+=10;
    }

    public void addPass(){
        if(passengers<seats)
            System.out.println("Everything is fine");
        else
            handletoomany();
    }





    private void handletoomany() {
        if(passengers>seats)
            System.out.println("Overloaded");
    }

    public int getAllPass(){
        return allPass;
    }
}
