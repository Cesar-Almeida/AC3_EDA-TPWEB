package br.com.bandtec.ac3veiculos.dominio;

import javax.persistence.*;

@Entity
public class Anexo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nomeArquivo;

    // o tipo byte[] é usado para guardar arquivos no banco
    // é recomendável definir o tamanho de campos byte[] (esse tamanho é em bytes)
    // pois alguns bancos usam um tamanho muito pequeno como padrão
    @Column(length = 5_000_000)
    private byte[] conteudoArquivo;

    private String tipoArquivo;

    // apenas getters e setters abaixo

    public String getTipoArquivo() {
        return tipoArquivo;
    }

    public void setTipoArquivo(String tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public byte[] getConteudoArquivo() {
        return conteudoArquivo;
    }

    public void setConteudoArquivo(byte[] conteudoArquivo) {
        this.conteudoArquivo = conteudoArquivo;
    }
}
