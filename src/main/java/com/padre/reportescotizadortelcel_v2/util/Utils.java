package com.padre.reportescotizadortelcel_v2.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class Utils {
    public static String yesterdayDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        Date yesterday = calendar.getTime();
        return String.valueOf(yesterday);
    }


    public static List<Object> convertObjectToList(Object obj) {
        List<Object> list = new ArrayList<Object>();
       return obj.getClass().isArray()?Arrays.asList((Object[])obj): obj instanceof Collection ? new ArrayList<>((Collection<?>)obj): list;
    }
}
