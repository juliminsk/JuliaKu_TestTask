package com.company;

public class Aplication {

    public static void main(String[] args) {
        Student[] students = new Student [5];
        students[0] = new Student("Olga", "Tsvetkova");
        students[1] = new Student("Ekaterina", "Moskaleva");
        students[2] = new Student("Igor", "Babul");
        students[3] = new Student("Viktor", "Zilko");
        students[4] = new Student("Andrey", "Tymoshchuk");

        float ave = 0;
        int minRes = 1;
        int maxRes = 5;
        int[] results = new int[5];
        for (int i=0; i<5; i++){
            results[i] = minRes + (int)(Math.random()*(maxRes-1));
            System.out.println(students[i].getName()+" "+students[i].getLastName()+" "+results[i]);
            ave += results[i];
        }
        ave = ave/5;
        System.out.println();
        System.out.println("Average mark = "+ave);

    }
}
