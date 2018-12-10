package Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class NotaEntrada {
 private Connection conexao = ConexaoBD.conectaBD();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    //Método para realizar o cadastro do fornecedor
    public boolean cadastrar(
            int pSecretaria_cod,
            int pFornecedor_cod,
            int pExercicio,
            int pSituacao,
            int pAno,
            int pSerie,
            int pN_nota,
            int pEmpenho,
            Date pData_empenho,
            String pData_entrada,
            int pTp_doc,
            int pTp_nota,
            Date pData_emissao,
            String pDescricao,
            int pTp_entrada,
            int pAlteracao_valor,
            double pValor_alteracao,
            double pValor_nota
            ){
        
        String sql = "INSERT INTO nota_entrada ("
                + " secretaria_cod,"
                + " fornecedor_cod,"
                + " exercicio,"
                + " situacao,"
                + " ano,"
                + " serie,"
                + " n_nota,"
                + " empenho,"
                + " data_empenho,"
                + " data_entrada,"
                + " tp_doc,"
                + " tp_nota,"
                + " data_emissao,"
                + " descricao,"
                + " tp_entrada,"
                + " alteracao_valor,"
                + " valor_alteracao,"
                + " valor_nota"
                + ") VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        
        try{
            pst = conexao.prepareStatement(sql);
        
            pst.setInt(1, pSecretaria_cod);
            pst.setInt(2, pFornecedor_cod);
            pst.setInt(3, pExercicio);
            pst.setInt(4, pSituacao);
            pst.setInt(5, pAno);
            pst.setInt(6, pSerie);
            pst.setInt(7, pN_nota);
            pst.setInt(8, pEmpenho);
            pst.setDate(9, pData_empenho);
            pst.setString(10, pData_entrada);
            pst.setInt(11, pTp_doc);
            pst.setInt(12, pTp_nota);
            pst.setDate(13, pData_emissao);
            pst.setString(14, pDescricao);
            pst.setInt(15, pTp_entrada);
            pst.setInt(16, pAlteracao_valor);
            pst.setDouble(17, pValor_alteracao);
            pst.setDouble(18, pValor_nota);
            
            pst.execute();
            
            return true;
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, erro);
            return false;
        }
    }   

    public Connection getConexao() {
        return conexao;
    }
}
