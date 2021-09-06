package Data;

import java.sql.*;

import Util.Debug;

public class DBConnector {
    private static Connection dbConn;
    //--------------------------------------------------------------------------------------------//
    // singleton pattern
    //--------------------------------------------------------------------------------------------//
    private static class SingleTonHolder{
        private static final DBConnector instance = new DBConnector();
    }
    
    public static DBConnector getInstance(){
        return SingleTonHolder.instance;
    }
    //--------------------------------------------------------------------------------------------//
    // 메서드
    //--------------------------------------------------------------------------------------------//
    public static Connection getConnection(){
        if(dbConn == null){
            String url = "jdbc:mariadb://shindang.iptime.org:3306/90kg";
            String user = "90kg";
            String pwd = "tlsekdehd";

            try{
                dbConn = DriverManager.getConnection(url, user, pwd);

                if (dbConn != null) {
                    Debug.log("Connected to the database!");
                } else {
                    Debug.log("Failed to make connection!");
                }
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        return dbConn;
    }
}
