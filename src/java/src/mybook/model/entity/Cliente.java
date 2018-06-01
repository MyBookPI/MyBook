/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.mybook.model.entity;

import java.util.List;

/**
 *
 * @author Home
 */
public class Cliente extends Pessoa{
    private Acervo acervo;
    
    public Acervo getAcervo() {
        return acervo;
    }

    public void setAcervo(Acervo acervo) {
        this.acervo = acervo;
    }

    public Cliente() {
        
    }

    public Cliente(String nome, String rg, String cpfCnpj, Usuario ususario) {
        super(nome, rg, cpfCnpj, ususario);
    }
    
    
    
}
