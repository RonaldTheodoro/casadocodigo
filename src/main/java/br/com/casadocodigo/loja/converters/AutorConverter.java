package br.com.casadocodigo.loja.converters;

import br.com.casadocodigo.loja.models.Autor;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("autorConverter")
public class AutorConverter implements Converter {

    @Override
    public Object getAsObject(
            FacesContext context, UIComponent component, String string) {

        if (string == null || string.trim().isEmpty())
            return null;

        Autor autor = new Autor();
        autor.setId(Integer.valueOf(string));

        return autor;
    }

    @Override
    public String getAsString(
            FacesContext context, UIComponent component, Object object) {

        if (object == null)
            return null;

        Autor autor = (Autor) object;
        return autor.getId().toString();
    }

}
