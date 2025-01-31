package dio.Projeto_Java_Final_DIO.dominio.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "account")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numero;

    private String agencia;

    @Column(nullable = false,precision = 12,scale = 2)
    private BigDecimal saldo;

    @Column(name = "limite_conta",nullable = false,precision = 12,scale = 2)
    private BigDecimal limite;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNumero() { return numero; }

    public void setNumero(String numero) { this.numero = numero; }

    public String getAgencia() { return agencia; }

    public void setAgencia(String agencia) { this.agencia = agencia; }

    public BigDecimal getSaldo() { return saldo; }

    public void setSaldo(BigDecimal saldo) { this.saldo = saldo;}

    public BigDecimal getLimite() { return limite; }

    public void setLimite(BigDecimal limite) {this.limite = limite;
    }
}