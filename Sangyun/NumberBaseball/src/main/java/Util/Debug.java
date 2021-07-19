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
    static private boolean  DEBUG = true;
    
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    public static Debug getInstance(){
        if (instance == null) { instance = new Debug();}
        return instance;
    }
    //------------------------------------------------------------------------//
    // at com.sang.numberbaseball.GameLauncher.GameManager.play(GameManager.java:38)
    //------------------------------------------------------------------------//
    public static void log(String message){
        if(DEBUG){
            String callInfo = getClassName() + ".java:[" + getLineNumber() +",0]";
//            System.out.println(callInfo + " "+ getTime() + " : " + message);
            System.out.println(message);
        }
    }
    //------------------------------------------------------------------------//
    // test 후 private으로
    //------------------------------------------------------------------------//
    private static String getTime(){
        Date now = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss:SS");
        return date.format(now);
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private static int getLineNumber(){
        int lineNumber = (new Throwable()).getStackTrace()[2].getLineNumber();
        return lineNumber;
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private static String getFileName(){
        String fileName = (new Throwable()).getStackTrace()[2].getFileName();
        
        return "(" + fileName + ":" + getLineNumber() + ")";
    }
    //------------------------------------------------------------------------//
    //------------------------------------------------------------------------//
    private static String getClassName(){
        String className = (new Throwable()).getStackTrace()[2].getClassName();
        String generatedClassName = className.replace(".", "/");

        return generatedClassName;
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private static String getMethodName(){
        String methodName = (new Throwable()).getStackTrace()[2].getMethodName();

        return methodName + "()";
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    public static void setIsDebug(boolean isDebug){
        DEBUG = isDebug;
    }
}
