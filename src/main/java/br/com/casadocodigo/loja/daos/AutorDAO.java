package br.com.casadocodigo.loja.daos;

import br.com.casadocodigo.loja.models.Autor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AutorDAO {
    
    @PersistenceContext
    private EntityManager manager;
    
    public List<Autor> listar() {
        return manager.createQuery(
            "SELECT a FROM Autor a", Autor.class).getResultList();
    }
    
}
