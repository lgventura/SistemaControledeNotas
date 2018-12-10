package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lgustavo
 */
public class Login {
    
    private Connection  conexao = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    public Login(){
        conexao = ConexaoBD.conectaBD();
    }
    
    public boolean verificaLogin(String pUser, String pSenha){
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND senha = ?";
        
        try {
            
            pst = conexao.prepareStatement(sql);
            pst.setString(1, pUser);
            pst.setString(2, pSenha);
            
            rs = pst.executeQuery();
            
            if(rs.next()){
                return true;
            } else {
                return false;
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            return false;
        }    
        
    }
    
    

    
    
}
