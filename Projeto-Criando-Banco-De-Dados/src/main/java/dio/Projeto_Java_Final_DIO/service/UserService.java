package dio.Projeto_Java_Final_DIO.service;

import dio.Projeto_Java_Final_DIO.dominio.model.Usuario;

public interface UserService {

    Usuario findById(Long id);

    Usuario create(Usuario usuarioParaCriar);
}
