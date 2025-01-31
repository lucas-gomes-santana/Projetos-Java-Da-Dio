package dio.Projeto_Java_Final_DIO.dominio.repositorio;

import dio.Projeto_Java_Final_DIO.dominio.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepositorio extends JpaRepository<Usuario,Long> {

    boolean existsByConta_Numero(String numero);
}
