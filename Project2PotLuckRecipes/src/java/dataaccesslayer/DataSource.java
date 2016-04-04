/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccesslayer;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Marie
 */
public class DataSource {
    
    public DataSource(){}

	public Connection createConnection(){
		Connection connection = null;
            try{
                Context initCtx = new InitialContext();
                Context envCtx = (Context)initCtx.lookup("java:comp/env");
                javax.sql.DataSource ds = (javax.sql.DataSource)envCtx.lookup("jdbc/potluckrecipes");
                connection = ds.getConnection();
            }
            catch(NamingException | SQLException ex){
                ex.printStackTrace();
            }
            return connection;

	}
    
}
