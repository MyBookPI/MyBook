/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.mybook.model.entity;

/**
 *
 * @author Home
 */
public abstract class Pessoa {
    private String nome;
    private String rg;
    private String cpfCnpj;
    private Usuario ususario;

    public Pessoa() {
    
    }

    public Pessoa(String nome, String rg, String cpfCnpj,  Usuario ususario) {
        this.nome = nome;
        this.rg = rg;
        this.cpfCnpj = cpfCnpj;
        this.ususario = ususario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Usuario getUsusario() {
        return ususario;
    }

    public void setUsusario(Usuario ususario) {
        this.ususario = ususario;
    }
    
    
    
}
