package br.com.bandtec.ac3veiculo.dominio;

import javax.persistence.*;

@Entity
public class VeiculoGaragem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Veiculo veiculo;

    @ManyToOne
    private Garagem garagem;
}
