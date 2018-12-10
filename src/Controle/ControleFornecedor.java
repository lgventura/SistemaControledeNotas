package Controle;

import Modelo.Fornecedor;
import java.sql.ResultSet;
import java.text.ParseException;
/**
 *
 * @author lgustavo
 */
public class ControleFornecedor{
    
    private String razaoSocial, cnpj, nome, email, endereco, obs, tipo, cidade, uf;
    private int pTipo;
    
    private Fornecedor fornecedor = null;
    
    
    public ControleFornecedor(){
        tipo = razaoSocial = cnpj = nome = email = endereco = obs = "";
        pTipo = 0;
        fornecedor = new Fornecedor();
    }
    
    public boolean cadastrar(){
        return fornecedor.cadastrar(razaoSocial, cnpj, nome, email, endereco,cidade, uf, pTipo, obs);
    }
    
    public ResultSet consultar(String pCampoNome, int pCampoCod){
        return fornecedor.consultaFornecedores(pCampoNome, pCampoCod);
    }
    
    public ResultSet consultar(){
        return fornecedor.consultaFornecedores();
    }
   
    public String consultarNomeFornecedor( int cod ){
        return fornecedor.consultarNomeFornecedor(cod);
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        
        if(this.tipo.equals("Teste tipo 1")){
            this.setpTipo(1);
        }else if(this.tipo.equals("Teste tipo 2")){
            this.setpTipo(2);
        }else if(this.tipo.equals("Teste tipo 3")){
            this.setpTipo(3);
        }
        
    }
    
    public int getpTipo() {
        return pTipo;
    }

    public void setpTipo(int pTipo) {
        this.pTipo = pTipo;
    }
        public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    /*
    public ResultSet consultaFuncionario(String pCampo){
        return funcionario.consultaFuncionarios(pCampo);
    }
    
    public ResultSet consultaFuncionario(){
        return funcionario.consultaFuncionarios();
    }
    
    public boolean excluirFuncionario(int cod){
        return funcionario.excluirFuncionarios(cod);
    }
    */

    
    

    
}
