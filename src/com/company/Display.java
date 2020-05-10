package com.company;
import java.util.Scanner;
public class Display {
    private int value=0;
    private int limate=0;
    public void increase(){
        value++;
        if(value==limate)
        {value=0;
    }
}
    public int getValue(){return value;}
    public Display(int limate){
    this.limate=limate;}
    public static void main(String[] args){

    Display d=new Display(24);
    for(;;)
    {d.increase();
    System.out.println(d.getValue());
    }
}}
class Clock {
    private Display hour = new Display(24);
    private Display minute =new Display(60);
    private Display second =new Display(60);
    public void tick(){
        second.increase();
        if (second.getValue()==0)
        {
            minute.increase();
            if (minute.getValue()==0)
            {
                hour.increase();
            }
        }

    }
}
