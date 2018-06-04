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
public class Endereco {
    private String idEndereco;
    private String complemento;
    private String referencia;
    private String telefone;
    private Bairro bairro;
    private Pessoa pessoa;

    public Endereco(String idEndereco, String complemento, String referencia, String telefone, Bairro bairro, Pessoa pessoa) {
        this.idEndereco = idEndereco;
        this.complemento = complemento;
        this.referencia = referencia;
        this.telefone = telefone;
        this.bairro = bairro;
        this.pessoa = pessoa;
    }

    public Endereco() {
    }

    
    
    
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    
    public String getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(String idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
    
    
}
