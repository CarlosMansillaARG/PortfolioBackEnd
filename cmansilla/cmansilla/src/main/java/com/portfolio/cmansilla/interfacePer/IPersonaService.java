
package com.portfolio.cmansilla.interfacePer;

import com.portfolio.cmansilla.entity.Persona;
import java.util.List;


public interface IPersonaService {
    // Traer una lista de persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar usuario buscando por id
    public void deletePersona(Long id);
    
    //Buscar persona por id
    public Persona findPersona(Long id);
    
}
