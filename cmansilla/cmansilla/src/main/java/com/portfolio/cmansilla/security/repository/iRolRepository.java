
package com.portfolio.cmansilla.security.repository;

import com.portfolio.cmansilla.security.entity.Rol;
import com.portfolio.cmansilla.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre (RolNombre rolNombre);
    
}
