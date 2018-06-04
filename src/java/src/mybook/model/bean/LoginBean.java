/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.mybook.model.bean;

import src.mybook.model.entity.Usuario;



public class LoginBean {

private Usuario usuario;
private String user;
private String password;


public String logar(){    
    if("MyBook".equals(user) && "123456".equals(password)){       
        return "TelaPrincipal";
    }  
   return null;
} 
    public LoginBean() {
        super();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
   
    
    
    
    
    
}
