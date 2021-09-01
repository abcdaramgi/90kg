/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ssy02
 */
public class Debug {
    private static Debug instance = new Debug();
    static boolean  DEBUG = true;
    private Debug(){
        
    }
    public static Debug getInstance(){
        if (instance == null) { instance = new Debug();}
        return instance;
    }
    public static void log(String message){
        if(DEBUG){
            System.out.println(getFileName() + " "+ getTime() + " : " + message);
        }
        
    }
    private static String getTime(){
        Date now = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss:SS");
        return date.format(now);
    }
    private int getLineNumber(){
        int lineNumber = (new Throwable()).getStackTrace()[2].getLineNumber();
        return lineNumber;
    }
    private static String getFileName(){

        String fileName = (new Throwable()).getStackTrace()[2].toString();
        return fileName;
    }
}
