package com.javasm.utill;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static String formatDateYMd(Date date){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String format = df.format(date);
        return format;
    }

    public static String getCurrentTime() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(new Date());
    }

    public static void main(String[] args){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long milliSecond = 1594001352000L;
        Date date = new Date(milliSecond);
        String format = df.format(date);
        System.out.println(date);
        System.out.println(format);
        System.out.println();

    }
}
