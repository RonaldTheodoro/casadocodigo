package br.com.casadocodigo.loja.beans;

import br.com.casadocodigo.loja.daos.LivroDAO;
import br.com.casadocodigo.loja.models.Livro;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class AdminListaLivrosBean {
    
    private List<Livro> livros = new ArrayList<>();

    @Inject
    private LivroDAO livroDAO;
    
    public List<Livro> getLivros() {
        this.livros = livroDAO.listar();
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    
}
