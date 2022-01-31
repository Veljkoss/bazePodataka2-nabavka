/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baza.broker;


import domen.objekat.DomenskiObjekat;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jovan
 */
public class BrokerBP {
    
    private Connection connection;
    private static String driverName = "oracle.jdbc.driver.OracleDriver";   
    private String url;
    private String username;
    private String password;

    public BrokerBP() {
        this.setDatabaseAccessParams();
    }
    
    public Connection getConnection(){
        return this.connection;
    }

    public void connect() throws Exception {
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, username, password);
//            connection.setAutoCommit(false);
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new Exception("Greska prilikom uspostavljanja konekcije sa bazom");
        }
    }

    public void disconnect() throws Exception {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                throw new Exception("Greska prilikom raskidanja konekcije sa bazom!");
            }
        }
    }

    public void commit() throws Exception {
        if (connection != null) {
            try {
                this.connection.commit();
            } catch (SQLException ex) {
                ex.printStackTrace();
                throw new Exception("Greska prilikom potvrdjivanja transakcije!");
            }
        }
    }

    public void rollback() throws Exception {
        if (connection != null) {
            try {
                this.connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
                throw new Exception("Greska prilikom ponistavanja transakcije!");
            }
        }
    }
    
    private void setDatabaseAccessParams() {
        this.url = "jdbc:oracle:thin:@localhost:1521/orclpdb";
        this.username = "veljko";
        this.password = "password";
    }
    
    public DomenskiObjekat getById(DomenskiObjekat object) throws SQLException {
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT " + object.getAllColumnNames() + " FROM "
                    + object.getTableName() + " WHERE " + object.getWhereIdClause();
            System.out.println(query);
            ResultSet rs = statement.executeQuery(query);

            return object.getObjectsFromResultSet(rs).get(0);
        } catch (SQLException ex) {
            throw ex;
        }
    }

    public List<DomenskiObjekat> getAll(DomenskiObjekat object) throws SQLException {
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT " + object.getAllColumnNames() + " FROM "
                    + object.getTableName() + " ORDER BY " + object.getOrderByColumn();
            System.out.println(query);
            ResultSet rs = statement.executeQuery(query);

            return object.getObjectsFromResultSet(rs);
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
    public List<DomenskiObjekat> getAllWithWhere(DomenskiObjekat object, String whereClause) throws SQLException {
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT " + object.getAllColumnNames() + " FROM "
                    + object.getTableName() + " WHERE " + whereClause + " ORDER BY " + object.getOrderByColumn();
            System.out.println(query);
            ResultSet rs = statement.executeQuery(query);

            return object.getObjectsFromResultSet(rs);
        } catch (SQLException ex) {
            throw ex;
        }
    }

    public int insert(DomenskiObjekat object) throws SQLException {
        try {
            Statement statement = connection.createStatement();
            String query = "INSERT INTO " + object.getTableName().split(" ")[0] + "(" + object.getInsertColumnNames() + ")" + " VALUES (" + object.getColumnValues() + ")";
            System.out.println(query);
            return statement.executeUpdate(query);
            
        } catch (SQLException ex) {
            throw ex;
        }
    }

    public int update(DomenskiObjekat odo) throws SQLException {
        try {
            Statement statement = connection.createStatement();
            String query = "UPDATE " + odo.getTableName() + " SET " + odo.getUpdateClause() + " WHERE " + odo.getUpdateWhereClause();
            System.out.println(query);
            int rowsUpdated = statement.executeUpdate(query);
            return rowsUpdated;
        } catch (SQLException ex) {
            throw ex;
        }
    }

    public int delete(DomenskiObjekat odo) throws SQLException {
        try {
            Statement statement = connection.createStatement();
            String query = "DELETE FROM " + odo.getTableName() + " WHERE " + odo.getDeleteWhereClause();
            System.out.println(query);
            int rowsUpdated = statement.executeUpdate(query);
            return rowsUpdated;
        } catch (SQLException ex) {
            throw ex;
        }
    }

      
}
