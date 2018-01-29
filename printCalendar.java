package com.company;


import javax.xml.crypto.Data;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

/**
 * Created by ttc on 18-1-25.
 */
public class printCalendar {
    public static void main(String[] args) throws Exception {
        System.out.println("请输入一个日期");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-mm-dd");
        //把输入的字符串转换成日期类型
        Date date= simpleDateFormat.parse(str);
        Calendar calendar=Calendar.getInstance();
        //将日历设置成当前输入的
        calendar.setTime(date);
        //输入的那天是几号
        int currutDay=calendar.get(Calendar.DATE);
        //把日期改成该月的一号
        calendar.set(Calendar.DATE,1);
        //该月第一天是周几
        int dayOfWeek=calendar.get(Calendar.DAY_OF_WEEK);
        //当月一共多少天
        int total=calendar.getActualMaximum(Calendar.DATE);
        int arr[]=new int[42];
        for(int i=0;i<total;i++)
        {
            arr[dayOfWeek-1]=i+1;
            dayOfWeek++;

        }
        System.out.println( "日\t一\t二\t三\t四\t五\t六");//
        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]==0)
            {
                System.out.print("");
            }
            else{
                if(arr[i]==currutDay)
                {
                    System.out.print("*");
                }
            System.out.print(arr[i]);}
            System.out.print("\t");
            if((i+1)%7==0)
            {
                System.out.println();
            }
        }
    }
}
