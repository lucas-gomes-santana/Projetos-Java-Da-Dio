package dio.Projeto_Java_Final_DIO.dominio.model;

import jakarta.persistence.*;
import java.util.List;


@Entity(name = "user_name")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Conta conta;

    @OneToOne(cascade = CascadeType.ALL)
    private Cartao cartao;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Caracteristicas> caracteristicas;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Noticias> noticias;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public Conta getConta() { return conta; }

    public void setConta(Conta conta) { this.conta = conta; }

    public Cartao getCartao() { return cartao; }

    public void setCartao(Cartao cartao) { this.cartao = cartao; }

    public List<Caracteristicas> getCaracteristicas() { return caracteristicas; }

    public void setCaracteristicas(List<Caracteristicas> caracteristicas) { this.caracteristicas = caracteristicas; }

    public List<Noticias> getNoticias() { return noticias; }

    public void setNoticias(List<Noticias> noticias) { this.noticias = noticias; }
}
