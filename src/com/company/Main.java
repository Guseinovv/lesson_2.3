package com.company;

public class Main {

    public static void hi() {
        System.out.println("hello");
        makeTea();
    }


    public static void main(String[] args) {
        double result = calculateArea(4, 5);
        System.out.println("area is:" + result);
        System.out.println("total carpet (m2) " + calculateArea( 5.2, 2));
        System.out.println(concat("hell", '!', true ));
        System.out.println(concat("mthf", '!', false));
    }

    public static void makeTea() { // невозращаемый метод без входящих параметров
        System.out.println("BREAKFAST");
        System.out.println("hot water");
        System.out.println("put the tea leafs");
        System.out.println("wait");
        System.out.println("add sugar");

    }

    public static void addition(int num1, int num2, String word) {
        System.out.println("сумма: " + (num1 + num2));

    }

    public static void calculatePerimeter(double weigh, double length) {
        System.out.println("Perimeter: " + (weigh + length));
    }

    public static double calculateArea(double width, double length) {
        double area = width * length;
        return area;
    }
 public static String concat (String text, char symbol, boolean isActive){
        return text + " " + isActive + " " + symbol;
 }


}
