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
public class TipoDeProduto {

private Connection conexao = ConexaoBD.conectaBD();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    //Método para realizar o cadastro do fornecedor
    public boolean cadastrar(String pNome){
        String sql = "INSERT INTO tipo_produto (nome_tipo) VALUES (?)";

        
        try{
            pst = conexao.prepareStatement(sql);

            pst.setString(1, pNome);
            
            pst.execute();
            
            return true;
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, erro);
            return false;
        }
    }

    public ResultSet consultar(){
        String sql = "Select nome_tipo FROM tipo_produto";

        
        try{
            pst = conexao.prepareStatement(sql);

            rs = pst.executeQuery();

            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, erro);
            return null;
        }
        
        return rs;
    }    
}
