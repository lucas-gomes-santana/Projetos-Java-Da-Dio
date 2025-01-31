package dio.Projeto_Java_Final_DIO.service.impl;

import dio.Projeto_Java_Final_DIO.dominio.model.Usuario;
import dio.Projeto_Java_Final_DIO.dominio.repositorio.UsuarioRepositorio;
import dio.Projeto_Java_Final_DIO.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UsuarioRepositorio usuarioRepositorio;

    public UserServiceImpl(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepositorio.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario create(Usuario usuarioParaCriar) {

        if(usuarioRepositorio.existsByConta_Numero(usuarioParaCriar.getConta().getNumero())) {
            throw new IllegalArgumentException("Este número de conta já existe.");
        }
        return usuarioRepositorio.save(usuarioParaCriar);
    }
}
