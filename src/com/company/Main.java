package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


//        Dancer danc = new Dancer();
//        Singer singer = new Singer();
//        singer.Walk();
//          Scanner scan=new Scanner(System.in);
//          int b= scan.nextInt();
//            int a =1;
//            int c=2;
//
//
//        if(a>=b){
//            System.out.println("bugun 18:00, java  5 sabagi bolot");
//        }else if(c>=b){
//            System.out.println("bugun 19:00, session sabagi bolot");
//        }else {
//            System.out.println("bugun sabak bolboit salamatta kalinizdar");
//        }


//        Scanner scan=new Scanner(System.in);
//        int input1=scan.nextInt();
//        int counter=0;
//        while(input1/*0*/>0){
//            input1/=10;
//            counter++;
//        }
//        System.out.println(counter);
//        Scanner scan = new Scanner(System.in);
//        int input=scan.nextInt();
//        int counter=0;
//        while(input>0){
//            input/=10;
//            counter++;
//        }
////        System.out.println(counter);
//        Scanner scan = new Scanner(System.in);
//        int input;
//        do {
//
//            System.out.println("  san jaziniz  ");
//            input = scan.nextInt();
//        } while (input >= 0);
//
//
//        System.out.println("  salamatta kaliniz  ");


//        Person person=new Programmer();
//        Person person1=new Dancer();
//        Person person2=new Singer();
//
//        Person[] persons={person,person1,person2};
//
//        for (Person pers:persons
//             ) {
//            System.out.println(pers.getClass());
//            System.out.println(pers.getClass().getName().substring(12));
       Animal[]animal={new Shark(),new Turtle(),new Eage()};

        for (Animal animals:animal){
           if(animals instanceof Shark){
          ((Shark) animals).attack();
           }else if(animals instanceof Turtle){
              ((Turtle) animals).swim();
           }else{
    animals.fly();

       }
            Shark[] shark = new Shark[0];
             Turtle[]turtle=new Turtle[0];
            Eage []eage=new Eage[0];

        System.out.println(shark.getClass().getName().substring(14));
       System.out.println(turtle.getClass().getName().substring(14));
       System.out.println(eage.getClass().getName().substring(14));

}
}

}


