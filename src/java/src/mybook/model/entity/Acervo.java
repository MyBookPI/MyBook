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
public class Acervo {
    private List<Livro> livros;

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    
}
