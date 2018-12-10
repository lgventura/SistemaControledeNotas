package Controle;

/**
 *
 * @author lgustavo
 */
import Modelo.TipoDeProduto;
import java.sql.ResultSet;

public class ControleTipoProduto {

    private String nome;
    TipoDeProduto tipo = null;
    
    public ControleTipoProduto() {
        nome = "";
        tipo = new TipoDeProduto();
    }
    
    public boolean cadastrar(){
        return tipo.cadastrar(nome);
    }
    
    public ResultSet consultar(){
        return tipo.consultar();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
