package com.company;

public class Main {

    public static void main(String[] args) {
        //       int x = 25;
 //       String s = "hello ";
 //       String space = "";
 //       String name = " alexsadr ";
 //       System.out.println("my number is " + x);//      System.out.println(x + space + name);

        // write your code here
        //цикл
        int[] numbers = new int [5];
        numbers [0] = 10;
        String [] strings = new String[3];
        strings[0] = "hi";
        strings[1] = "bay";
        strings[2] = "hy sugar";
        System.out.println(strings[0]);
        System.out.println(strings[2]);
        for (int i =0; i<strings.length; i++){ //цикл фор
            System.out.println(strings[i]);
            }
        for (String string:strings){ // for each
            System.out.println(string);
        }
        int[] numbers1 = {1,2,3};
        int sum = 0;
        for (int x:numbers1){
            sum = sum+x;
        }    System.out.println(sum);
        int value = 0;
        String s = "dkadakld";{
            System.out.println(s);
        }


    }
}
