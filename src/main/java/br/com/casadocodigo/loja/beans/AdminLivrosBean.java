package br.com.casadocodigo.loja.beans;

import br.com.casadocodigo.loja.daos.LivroDAO;
import br.com.casadocodigo.loja.models.Autor;
import br.com.casadocodigo.loja.models.Livro;
import java.util.Arrays;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

@Named
@RequestScoped
public class AdminLivrosBean {

    private Livro livro = new Livro();
    @Inject
    private LivroDAO dao;
    
    @Transactional
    public void salvar() {
        dao.salvar(livro);
    }

    public List<Autor> getAutores() {
        return Arrays.asList(
            new Autor(1, "Paulo Silveira"),
            new Autor(2, "Sergio Lopes")
        );
    }
    
    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
}
