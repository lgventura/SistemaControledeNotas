package Controle;

/**
 *
 * @author lgustavo
 */
import Modelo.Produtos;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class ControleProduto {
    
    private int tpProdutos_cod, unidade, qntd, nota_entrada_fk;
    private String descricao, nome;
    private double valor_uni, valor_total;
    
    Produtos produto;
    
    public ControleProduto(){
        tpProdutos_cod = unidade = qntd = 0;
        descricao = nome = "";
        valor_uni =  valor_total = 0.00f;
        
        produto = new Produtos();
    }
    
    public boolean cadastrar(){
        return produto.cadastrar(tpProdutos_cod, descricao, unidade, qntd, valor_uni, valor_total, nome, nota_entrada_fk);
    }
    
    public ResultSet consultar(){
        return produto.consultaProdutos(this.nota_entrada_fk);
    }
    
    public void setNota_entrada_fk() {
        
        ResultSet rsNota = null;
        PreparedStatement pst = null;
       
        int cod = 0;
        
        try  
        {  
            String sql = "SELECT cod FROM nota_entrada";
        
            pst = produto.getConexao().prepareStatement(sql);
            rsNota = pst.executeQuery();
            
            while(rsNota.next()){
                cod = rsNota.getInt("cod");
            } 
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            
        }
        this.nota_entrada_fk = cod;
    }

    public int getTpProdutos_cod() {
        return tpProdutos_cod;
    }

    public void setTpProdutos_cod(String tpProdutos) {
        
        ResultSet rsProduto = null;
        PreparedStatement pst = null;
        
        try  
        {  
            String sql = "SELECT tipo_produto_cod FROM tipo_produto WHERE nome_tipo = ?";
        
            pst = produto.getConexao().prepareStatement(sql);
            pst.setString(1, tpProdutos);
            
            rsProduto = pst.executeQuery();
            
            if(rsProduto.next()){
              
                this.tpProdutos_cod = rsProduto.getInt("tipo_produto_cod");
          
            } 
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            
        }
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        
        if(unidade.equals("ml")){
            this.unidade = 1;
        }else if(unidade.equals("kg")){
            this.unidade = 2;
        }else if(unidade.equals("Unidade")){
            this.unidade = 3;
        }
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor_uni() {
        return valor_uni;
    }

    public void setValor_uni(double valor_uni) {
        this.valor_uni = valor_uni;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total() {
        this.valor_total = this.valor_uni * this.qntd;
    }
    
    public int getNota_entrada_fk() {
        return nota_entrada_fk;
    }
    
    public String getDateTime() {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	return dateFormat.format(date);
    }
}
