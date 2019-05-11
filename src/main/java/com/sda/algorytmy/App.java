package com.sda.algorytmy;


public class App {
    public static void main(String[] args) {

        int silnia = 5;
        int wynik = 1;
        for (int i = 1; i <= silnia; i++) {
            wynik = wynik * i;
        }
        System.out.println("silnia: " + wynik);
        System.out.println(silniA(5));
        System.out.println(ciag(5));
        System.out.println(ciag2(5));
    }

    private static int silniA(int a) {
        if (a < 2) {
            return 1;
        }
        return a*silniA(a-1);
    }
    public static double ciag (double a){

        if(a==1){
            return 1;
        }if(a==2){
            return 0.5;
        }
        return -ciag(a-1)*ciag(a-2);
    }
    public static int ciag2 (int a){
        if(a==1){
            return -1;
        }return -ciag2(a-1)*a-3;
    }
}