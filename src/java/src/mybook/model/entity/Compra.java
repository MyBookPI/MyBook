/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.mybook.model.entity;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Home
 */
public class Compra {
    private List<Livro> livro;
    private Cliente cliente;

    public Compra(List<Livro> livro, Cliente cliente) {
        this.livro = livro;
        this.cliente = cliente;
    }

    public Compra() {
        this.livro = new LinkedList<>();
    }

    
    public List<Livro> getLivro() {
        return livro;
    }

    public void setLivro(List<Livro> livro) {
        this.livro = livro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}
