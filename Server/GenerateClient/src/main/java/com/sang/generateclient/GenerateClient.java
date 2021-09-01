/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang.generateclient;

//import Data.DBConnector;
import Managers.GenerateManager;

/**
 *
 * @author ssy02
 */
public class GenerateClient {
    public static void main(String[] args){
        //DBConnector.getConnection();
        GenerateManager gm = new GenerateManager();
        gm.setNumOfClients();
        gm.matching();
        gm.setTargetClient();
    }
}
