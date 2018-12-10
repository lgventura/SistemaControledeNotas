package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Fornecedor {
    private Connection conexao = ConexaoBD.conectaBD();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    //Método para realizar o cadastro do fornecedor
    public boolean cadastrar(String pRazaoSocial, String pCnpj, String pNome, String pEmail, String pEndereco, String pCidade, String pUf, int pTipo, String pObs){
        String sql = "INSERT INTO fornecedor (razao_social, cnpj, nome, email, endereco, cidade, uf, tipo, observacoes) VALUES (? , ?, ?, ?, ?, ?, ?, ?, ?)";

        
        try{
            pst = conexao.prepareStatement(sql);

            pst.setString(1, pRazaoSocial);
            pst.setString(2, pCnpj);
            pst.setString(3, pNome);
            pst.setString(4, pEmail);
            pst.setString(5, pEndereco);
            pst.setString(6, pCidade);
            pst.setString(7, pUf);
            pst.setInt(8, pTipo);
            pst.setString(9, pObs);
            
            pst.execute();
            
            return true;
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, erro);
            return false;
        }
    }
    
    public ResultSet consultaFornecedores(){
        
        String sql = "SELECT fornecedor_cod AS "+"\"Código\""+"  , razao_social AS "+"\"Razao Social\""+" , nome AS "+"\"Nome\""+" , cnpj AS "+"\"CNPJ\""+" FROM fornecedor";
        
        try{
            
            pst=conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            return rs;
        
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, erro);
            
            return null;
        }
        
    }
    
    public ResultSet consultaFornecedores(String pCampoNome, int pCampoCod){
        
        String sql = "SELECT fornecedor_cod AS "+"\"Código\""+"  , razao_social AS "+"\"Razao Social\""+" , nome AS "+"\"Nome\""+" , cnpj AS "+"\"CNPJ\""+" FROM fornecedor WHERE nome like ? OR fornecedor_cod = ?";
        
        try{
            
            pst=conexao.prepareStatement(sql);
            
            if(pCampoCod == 0){
                pst.setString(1, "%"+pCampoNome+"%");
            }else {
                pst.setString(1, "");
            }
            pst.setInt(2, pCampoCod);
            rs = pst.executeQuery();
            
            return rs;
        
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, erro);
            
            return null;
        }
        
    }
    
    public String consultarNomeFornecedor( int cod ){
        
        String sql = "SELECT nome FROM fornecedor WHERE fornecedor_cod = ?";
        try{
            
            pst=conexao.prepareStatement(sql);
            
            pst=conexao.prepareStatement(sql);
            
            pst.setInt(1, cod);
            rs = pst.executeQuery();
            
            rs = pst.executeQuery();
            
            if(rs.next()){
                return rs.getString("nome");
            }else{
                return "";
            }
                
            
        
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, erro);
            return "";
        }
    }
    
    /*
    public ResultSet consultaFuncionarios(){
        
        String sql = "SELECT cod_func AS "+"\"Código\""+"  , nome AS "+"\"Nome\""+" , endereco AS "+"\"Endereco\""+" , telefone AS "+"\"Telefone\""+" , salario AS "+"\"Sálario\""+"  FROM funcionarios ";
        
        try{
            
            pst=conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            return rs;
        
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, erro);
            
            return null;
        }
        
    }
    
    public boolean excluirFuncionarios(int cod_func){
        String sql =" DELETE FROM funcionarios WHERE cod_func = ?";
        
        try {
            pst = conexao.prepareStatement(sql);
            
            pst.setInt(1, cod_func);
            
            pst.execute();
            
            return true;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            return false;
        }
    }*/
}
