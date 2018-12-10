package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lgustavo
 */
public class ConexaoBD {
    
     public static Connection conectaBD(){
        try{
            
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/nota_fiscal","lgustavo","d01m040245");
            
            return conexao;
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, erro);
            return null;
        }
    }
    
}
