package Data;

import java.sql.*;

public class DBManager{
    Connection dbConn;
    //--------------------------------------------------------------------------------------------//
    // singleton pattern
    //--------------------------------------------------------------------------------------------//
    private static class SingleTonHolder{
        private static final DBManager instance = new DBManager();
    }
    
    public static DBManager getInstance(){
        return SingleTonHolder.instance;
    }
}