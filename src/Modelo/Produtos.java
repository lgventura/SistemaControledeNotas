package Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

public class Produtos {
    private Connection conexao = ConexaoBD.conectaBD();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Produtos(){
        conexao = ConexaoBD.conectaBD();
    }
    
    //Método para realizar o cadastro do fornecedor
    public boolean cadastrar(
            int pTpProdutos_cod,
            String pDescricao,
            int pUnidade,
            int pQntd,
            double pValor_unitario,
            double pValor_total,
            String pNome,
            int pNota
            ){
        
        String sql = "INSERT INTO produtos ("
                + " tipo_produto_cod,"
                + " descricao,"
                + " unidade,"
                + " quantidade,"
                + " valor_unitario,"
                + " valor_total,"
                + " nome,"
                + " nota_entrada_fk"
                + ") VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)";

        
        try{
            pst = conexao.prepareStatement(sql);
        
            pst.setInt(1, pTpProdutos_cod);
            pst.setString(2, pDescricao);
            pst.setInt(3, pUnidade);
            pst.setInt(4, pQntd);
            pst.setDouble(5, pValor_unitario);
            pst.setDouble(6, pValor_total);
            pst.setString(7, pNome);
            pst.setInt(8, pNota);
            
            pst.execute();
            
            return true;
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, erro);
            return false;
        }
    }   
    
    public ResultSet consultaProdutos(int pNota){
        
        String sql = "SELECT nome AS "+"\"Nome do Produto\""+","+
                " CASE WHEN unidade = 1 THEN 'ml'"+
                " WHEN unidade = 2 THEN 'kg'"+
                " WHEN unidade = 3 THEN 'Unidade'"+
                " ELSE 'Outros' END AS "+"\"Unidade\""+","+
                " quantidade AS "+"\"Quantidade\""+","+
                " valor_unitario AS "+"\"Valor Unitario\""+","+
                " valor_total AS "+"\"Valor Total\""+
                " FROM produtos WHERE nota_entrada_fk = ?";
        
        try{
            
            pst=conexao.prepareStatement(sql);
            
            pst.setInt(1, pNota);
            rs = pst.executeQuery();
            
            return rs;
        
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, erro);
            
            return null;
        }
    }

    public Connection getConexao() {
        return conexao;
    }
}
