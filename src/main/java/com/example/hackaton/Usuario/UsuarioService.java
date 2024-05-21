package com.example.hackaton.Usuario;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //@Autowired
    //private PasswordEncoder passwordEncoder;
/*
    public Usuario registerUser(Usuario usuario) {
        usuario.setContrasena(passwordEncoder.encode(usuario.getContrasena()));
        return usuarioRepository.save(usuario);
    }
*/
    public Optional<Usuario> findByCorreoElectronico(String correoElectronico) {
        return Optional.ofNullable(usuarioRepository.findByCorreoElectronico(correoElectronico));
    }

    // Otros métodos según sea necesario
}

