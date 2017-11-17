package br.com.casadocodigo.loja.daos;

import br.com.casadocodigo.loja.models.Livro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class LivroDAO {

    @PersistenceContext
    private EntityManager manager;
    
    public void salvar(Livro livro) {
        manager.persist(livro);
    }
    
    public List<Livro> listar() {
        String jpql = "SELECT DISTINCT(l) FROM Livro l JOIN FETCH l.autores";
        return manager.createQuery(jpql, Livro.class).getResultList();
    }
}
