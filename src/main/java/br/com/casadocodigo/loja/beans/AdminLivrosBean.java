package br.com.casadocodigo.loja.beans;

import br.com.casadocodigo.loja.daos.AutorDAO;
import br.com.casadocodigo.loja.daos.LivroDAO;
import br.com.casadocodigo.loja.models.Autor;
import br.com.casadocodigo.loja.models.Livro;
import java.util.List;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.Part;
import javax.transaction.Transactional;

@Model
public class AdminLivrosBean {

    private Livro livro = new Livro();

    @Inject
    private LivroDAO livroDAO;
    @Inject
    private AutorDAO autorDAO;
    @Inject
    private FacesContext context;

    private Part capaLivro;

    @Transactional
    public String salvar() {
        livroDAO.salvar(livro);

        context.getExternalContext().getFlash().setKeepMessages(true);
        context.addMessage(null, new FacesMessage("Livro cadastrado com sucesso"));

        return "/livros/lista?faces-redirect=true";
    }

    public List<Autor> getAutores() {
        return autorDAO.listar();
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Part getCapaLivro() {
        return capaLivro;
    }

    public void setCapaLivro(Part capaLivro) {
        this.capaLivro = capaLivro;
    }

}
