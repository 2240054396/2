package com.company;
import java.util.Scanner;
class Display {

    private int value = 0;
    private int limit = 0;

    public Display(int limit) {
        // TODO Auto-generated constructor stub
        this.limit=limit;
    }
    public void increase()
    {
        value++;
        if(value==limit)
        {
            value=0;
        }
    }
    public void writeValue(int value)
    {
        this.value=value;
    }
    public int getValue()
    {
        return value;
    }
}
public class Clock {
    private Display hour = new Display(24);
    private Display minute =new Display(60);
    private Display second =new Display(60);
    public Clock(int hour, int minute, int second)
    {   // 用hour, minute和second初始化时间。
        this.hour.writeValue(hour);
        this.minute.writeValue(minute);
        this.second.writeValue(second);
    }
    public void tick()
    {
        // “嘀嗒”一下，时间走1秒。
        second.increase();
        if(second.getValue()==0)
        {
            minute.increase();
            if(minute.getValue()==0)
            {
                hour.increase();
            }
        }

    }
    public String toString()
    {// 返回一个String的值，以“hh:mm:ss“的形式表示当前时间。这里每个数值都占据两位，不足两位时补0。如“00:01:22"。注意其中的冒号是西文的，不是中文的。
        // 提示：String.format()可以用和printf一样的方式来格式化一个字符串。
        return String.format("%02d:%02d:%02d", this.hour.getValue(), this.minute.getValue(), this.second.getValue());
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in =new Scanner(System.in);
        Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
        clock.tick();
        System.out.println(clock);
        in.close();
    }

}