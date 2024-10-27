package com.example.mywebapps.repository;


 
import com.example.mywebapps.model.Usuario; 
import org.springframework.data.jpa.repository.JpaRepository; 
 
public interface UsuarioRepository extends JpaRepository<Usuario, Long> { 
} 