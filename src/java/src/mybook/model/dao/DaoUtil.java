/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.mybook.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tecnologia
 */
/*Classe Singleton*/
public abstract class DaoUtil {
    
    private Connection connect = null; 
    
    
    public Connection getConnection() throws SQLException, ClassNotFoundException{
//        if(connect == null){
//            String password = "system";
//            String user = "123456";
//            String url = "jdbc:oracle:thin:@localhost:1521:XE";
//            /*Driver do banco de dados.*/
//            Class.forName("oracle.jdbc.OracleDriver");
//            
//           connect = DriverManager.getConnection(url,user, password);
//        }
        
        return connect;
    }
    
    public void getFechaConnection() throws SQLException{
        if(connect != null){
            this.connect.close();
            this.connect = null ;
        }
    }
    
    /*DDL E DML*/
    public Statement getStatement() throws SQLException, ClassNotFoundException{
        return this.getConnection().createStatement();
    }
    
    /*DML*/
    public PreparedStatement getPreparedStatement(String sql) throws SQLException, ClassNotFoundException{
        return this.getConnection().prepareStatement(sql);
    }
    
    
}
