package Controle;

/**
 *
 * @author lgustavo
 */
import Modelo.NotaEntrada;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControleNota_entrada {

    private int secretaria_cod, fornecedor_cod, exercicio, situacao;
    private int ano, serie, n_nota, empenho, tp_doc;
    private int tp_nota, tp_entrada, alteracao_valor;
    private Date data_emissao, data_empenho;
    private String descricao, data_entrada;
    private double valor_alteracao, valor_nota;
   
                    
    NotaEntrada nota = null;
    
    public ControleNota_entrada() {
        nota = new NotaEntrada();
    }
    
    public boolean cadastrar(){
        return nota.cadastrar(secretaria_cod, fornecedor_cod, exercicio, situacao, ano, serie, n_nota, empenho, data_empenho, data_entrada, tp_doc, tp_nota, data_emissao, descricao, tp_entrada, alteracao_valor, valor_alteracao, valor_nota);
    }

    public int getSecretaria_cod() {
        return secretaria_cod;
    }

    public void setSecretaria_cod(String secretaria) {
        String sql = "SELECT secretaria_cod FROM secretarias WHERE nome = ?";
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            pst = nota.getConexao().prepareStatement(sql);
            
            pst.setString(1, secretaria);
            
            rs = pst.executeQuery();
            
            if(rs.next()){
                this.secretaria_cod = rs.getInt("secretaria_cod");
            }
            
        } catch (SQLException ex) {}
        
        
        this.secretaria_cod = secretaria_cod;
    }

    public int getFornecedor_cod() {
        return fornecedor_cod;
    }

    public void setFornecedor_cod(int fornecedor_cod) {
        this.fornecedor_cod = fornecedor_cod;
    }

    public int getExercicio() {
        return exercicio;
    }

    public void setExercicio(int exercicio) {
        this.exercicio = exercicio;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getN_nota() {
        return n_nota;
    }

    public void setN_nota(int n_nota) {
        this.n_nota = n_nota;
    }

    public int getEmpenho() {
        return empenho;
    }

    public void setEmpenho(int empenho) {
        this.empenho = empenho;
    }

    public int getTp_doc() {
        return tp_doc;
    }

    public void setTp_doc(String tp_doc) {
        if(tp_doc.equals("Nota Fiscal")){
            this.tp_doc = 1;
        }
    }

    public int getTp_nota() {
        return tp_nota;
    }

    public void setTp_nota(String tp_nota) {
        if(tp_nota.equals("NF-e")){
            this.tp_nota = 1;
        }else if(tp_nota.equals("Nota de Serviço")){
            this.tp_nota = 2;
        }
    }

    public int getTp_entrada() {
        return tp_entrada;
    }

    public void setTp_entrada(String tp_entrada) {
        if(tp_entrada.equals("Estoque")){
            this.tp_entrada = 1;
        }else if(tp_entrada.equals("Rotativa")){
            this.tp_entrada = 2;
        }
    }

    public int getAlteracao_valor() {
        return alteracao_valor;
    }

    public void setAlteracao_valor(String alteracao_valor) {
       
        if(alteracao_valor.equals("Nenhum")){
            this.alteracao_valor = 0;
        }else if(alteracao_valor.equals("Desconto")){
            this.alteracao_valor = 1;
        }else if(alteracao_valor.equals("Acréscimo")){
            this.alteracao_valor = 2;
        }
    }

    public Date getData_emissao() {
        return data_emissao;
    }

    public void setData_emissao(Date data_emissao) {
        this.data_emissao = data_emissao;
    }

    public Date getData_empenho() {
        return data_empenho;
    }

    public void setData_empenho(Date data_empenho) {
        this.data_empenho = data_empenho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor_alteracao() {
        return valor_alteracao;
    }

    public void setValor_alteracao(double valor_alteracao) {
        this.valor_alteracao = valor_alteracao;
    }

    public double getValor_nota() {
        return valor_nota;
    }

    public void setValor_nota(double valor_nota) {
        this.valor_nota = valor_nota;
    }

    public String getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }
    
}
