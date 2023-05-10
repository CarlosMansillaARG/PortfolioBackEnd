
package com.portfolio.cmansilla.security.service;

import com.portfolio.cmansilla.security.entity.Rol;
import com.portfolio.cmansilla.security.enums.RolNombre;
import com.portfolio.cmansilla.security.repository.iRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre (RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
        
    }
    
    public void save (Rol rol){
        irolRepository.save(rol);
    }
    
}
