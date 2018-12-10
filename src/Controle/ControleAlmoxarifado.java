package Controle;

/**
 *
 * @author lgustavo
 */
import Modelo.Almoxarifado;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleAlmoxarifado {

    private String nome;
    Almoxarifado almoxarifado = null;
    
    public ControleAlmoxarifado() {
        nome = "";
        almoxarifado = new Almoxarifado();
    }
    
    public boolean cadastrar(){
        return almoxarifado.cadastrar(nome);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ResultSet consultar(){
        return almoxarifado.consultar();
    }
    
}
