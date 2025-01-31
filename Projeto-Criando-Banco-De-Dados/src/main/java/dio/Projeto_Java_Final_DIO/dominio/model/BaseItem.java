package dio.Projeto_Java_Final_DIO.dominio.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String icone;
    private String descricao;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getIcone() { return icone; }

    public void setIcone(String icone) { this.icone = icone; }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

}
