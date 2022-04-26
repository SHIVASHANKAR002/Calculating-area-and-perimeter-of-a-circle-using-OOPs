package com.packages;

import java.util.Scanner;

class getInfo{
    float r = 0.00f;
    float area = 0.00f;
    float peri = 0.00f;
    public void input(){
        Scanner rad = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        r = rad.nextFloat();
    }
    public float getArea(){
        area = (float) Math.PI * r * r;
        return area;
    }
    public float getPeri(){
        peri = 2 * (float) Math.PI * r;
        return peri;
    }
}

public class areaAndCircumfrenceOfCircle {
    public static void main(String[] args) {
        getInfo area = new getInfo();
        area.input();
        System.out.println("area is :" + area.getArea());
        System.out.println("the perimeter is : " + area.getPeri());
    }
}