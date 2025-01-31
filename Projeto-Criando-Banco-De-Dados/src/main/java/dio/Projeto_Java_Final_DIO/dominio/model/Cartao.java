package dio.Projeto_Java_Final_DIO.dominio.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "card")
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numero;

    @Column(name = "limite_cartao",precision = 12,scale = 2)
    private BigDecimal limite;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id;}

    public String getNumero() { return numero; }

    public void setNumero(String numero) { this.numero = numero; }

    public BigDecimal getLimite() { return limite; }

    public void setLimite(BigDecimal limite) { this.limite = limite; }
}