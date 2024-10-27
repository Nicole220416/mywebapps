package com.example.mywebapps.service;

import com.example.mywebapps.model.Usuario; 
import com.example.mywebapps.repository.UsuarioRepository; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
 
import java.util.List; 
 
@Service 
public class UsuarioService { 
    @Autowired 
    private UsuarioRepository usuarioRepository; 
 
    public List<Usuario> listarUsuarios() { 
        return usuarioRepository.findAll(); 
    } 
 
    public void guardarUsuario(Usuario usuario) { 
        usuarioRepository.save(usuario); 
    } 
}
