package com.himanshu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
       /* String[] names = {"vns", "del", "pun", "kol", "blr"};

        Flight[] flights = new Flight[5];
        for (int i =0;i<5;i++){
            flights[i] = new Flight((int) (Math.random() * (100000 - 50 + 1) + 50), (int) (Math.random() * (90000 - 50 + 1) + 50));
            flights[i].name = names[(int) (Math.random() * (4 - 0 + 1) + 0)];
        }

        for (int i=0;i<5;i++){
            System.out.printf(" For the flight %7s  Seats = %,6d  Pass = %,6d     ", flights[i].name, flights[i].seats, flights[i].passengers);
            //String status = (flights[i].passengers>flights[i].seats)?"overload":"fine";
            //System.out.println(status);
            flights[i].addPass();
//            System.out.println(flights[i].getAllPass());

        }*/
        System.out.println();
        System.out.println();
        System.out.println();
        Flight vnsToDel = new Flight(100, 150);
        Flight delToPun = new Flight(200, 250);

        System.out.println(vnsToDel);
        System.out.println(delToPun);

        Flight flight = new Flight();
        flight = vnsToDel;
        vnsToDel = delToPun;
        delToPun = flight;

//        System.out.println("Following first swap");
//        swap1(vnsToDel, delToPun);
        System.out.printf("For vnsToDel Seats =  %d  Pass = %d\n", vnsToDel.seats, vnsToDel.passengers);
        System.out.printf("For delToPun Seats =  %d  Pass = %d\n", delToPun.seats, delToPun.passengers);

//        System.out.println("Now following second method");
//        swap2(vnsToDel, delToPun);
//        System.out.printf("For vnsToDel Seats =  %d  Pass = %d", vnsToDel.seats, vnsToDel.passengers);
//        System.out.printf("For delToPun Seats =  %d  Pass = %d\n\n\n\n\n", delToPun.seats, delToPun.passengers);





        /*Flight vnsToDel = new Flight(12542, 96357);
        Flight delToPun = new Flight(897894, 54564798);

        vnsToDel.addPass(7);
        vnsToDel.addPass(7);
        delToPun.addPass(10);

        System.out.printf("Seats = %,d  Pass = %,d\n", vnsToDel.seats, vnsToDel.passengers);
        System.out.printf("Seats = %,d  Pass = %,d\n", delToPun.seats, delToPun.passengers);

        System.out.println("Doing some assignments");

        vnsToDel = delToPun;
        System.out.printf("Seats = %,d  Pass = %,d\n", vnsToDel.seats, vnsToDel.passengers);
        System.out.printf("Seats = %,d  Pass = %,d\n", delToPun.seats, delToPun.passengers);*/
    }

    private static void swapint(int a1, int a2) {
        int a3 = a1;
        a1 = a2;
        a2 = a3;
    }

    private static void swap2(Flight fl1, Flight fl2) {
        int seat1, pass1;
        seat1 = fl1.seats;
        pass1 = fl1.passengers;

        fl1.seats = fl2.seats;
        fl1.passengers = fl2.passengers;

        fl2.seats = seat1;
        fl2.passengers = pass1;
    }

    private static void swap1(Flight fl1, Flight fl2) {
        Flight fl3 = fl1;
        fl1 = fl2;
        fl2 = fl3;
    }

}




      /*  double val1, val2, result;
        char opcode;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the val1");
        val1 = sc.nextDouble();

        System.out.println("Enter the val2");
        val2 = sc.nextDouble();

        System.out.println("Enter the opcode");
        opcode = sc.next().charAt(0);


        if(opcode == 'a')
            result = val1 + val2;
        else if (opcode == 's')
            result = val1-val2;
        else if (opcode == 'm')
            result = val1*val2;
        else if (opcode == 'd')
            result = val1/val2;
        else
            result = 0;

        switch (opcode) {
            case 'a':
                System.out.println("Its addition");
                break;
            case 's':
                System.out.println("Its subtraction");
                break;
            case 'm':
                System.out.println("Its multiplication");
                break;
            case 'd':
                System.out.println("Its division now");
                break;
            default:
                System.out.println("Wrtite something correct buddy yo");
        }
        //System.out.println(result);
        System.out.println("The operation being performed gives the result = " + result);

        for (int i = 1; i<10; i++){
            System.out.println(i);
        }*/

        /*int[] arr = new int[10];
        for(int i = 0;i<arr.length;i++){
            arr[i] = i*5;
        }

        for(int j=0;j<arr.length;j++)
            System.out.println("For index " +j+ " the value is "+ arr[j]);

        System.out.println("Now using for each method");
        for(int val: arr)
            System.out.println(val);
        */



//        static void func(){
//            System.out.println("First instance");
//            System.out.println("Second instance");
//        }

//        System.out.println("Calling the method");
//        func();
//        System.out.println("Called");
//        //System.out.println(arr.length);

//        int[] tablearray = new int[10];
//        tablearray = areturn(10);
//        for(int i=0;i<10;i++)
//            System.out.println(tablearray[i]);


//        StringBuilder sb = new StringBuilder(30);
//        sb.append("Hello ");
//        sb.append("I ");
//        sb.append("am Himmanshu");
//
//        String name = sb.toString();
//        System.out.printf(name);
//
//    }

//    private static int[] areturn (int size){
//        int[] array = new int[size];
//        for(int i=0;i<size;i++){
//            array[i] = 5*i;
//        }
//        return array;
//    }
//
//    private static void func() {
//        System.out.println("First instance");
//        System.out.println("Second instance");

