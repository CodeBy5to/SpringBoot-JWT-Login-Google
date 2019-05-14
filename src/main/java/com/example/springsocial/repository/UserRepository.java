package com.example.springsocial.repository;

import com.example.springsocial.model.FrUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<FrUsuario, Long> {

    Optional<FrUsuario> findByEmail(String email);

    Boolean existsByEmail(String email);


}
