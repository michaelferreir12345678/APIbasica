package br.com.crudSpring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.crudSpring.entities.User;


public interface UserRepository extends JpaRepository <User, Long> {
    
}
