package Controle;

import Modelo.Login;

public class Logar {
    
    private String usuario, senha;
    
    Login logando = null;
            
    public Logar(){
        logando = new Login();
    }
    
    public boolean verificaLogin(){
        return logando.verificaLogin(usuario, senha);
    }
   
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}