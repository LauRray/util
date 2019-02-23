package main;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class aa {


    public static void main(String[] args) throws Exception {
        Date currentDate = new Date();
        Long startTimp = currentDate.getTime() - (1000 * 3600 * 24 * 7);
        System.out.println(new Date(startTimp).toLocaleString());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(startTimp));
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 0);

        calendar.set(Calendar.MINUTE, 0);

        calendar.add(Calendar.DAY_OF_YEAR, 1);

        String aa = "asdasd";


        Date startDate = calendar.getTime();
        System.out.println(startDate.toLocaleString());
    }
}