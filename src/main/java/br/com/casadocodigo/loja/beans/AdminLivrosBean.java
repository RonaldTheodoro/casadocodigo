package br.com.casadocodigo.loja.beans;

import br.com.casadocodigo.loja.daos.LivroDAO;
import br.com.casadocodigo.loja.models.Livro;
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

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
}
