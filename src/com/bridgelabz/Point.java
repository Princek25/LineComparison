package com.bridgelabz;

import java.util.Scanner;

public class Point {
    private int x , y;
    Point(){

    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void getPoints(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Point : ");
        x = sc.nextInt();
        System.out.println("Enter Point : ");
        y = sc.nextInt();
    }
}
