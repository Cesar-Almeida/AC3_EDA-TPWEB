package br.com.bandtec.ac3veiculos.dominio;

public class VeiculoSimplesResposta {
    private String modelo;
    private Garagem vaga;

    public void VeiculoSimplesResposta(Veiculo entidade) {
        this.modelo = entidade.getModelo();
        this.vaga = entidade.getVaga();
    }

    // somente Getters
    public String getModelo() {
        return modelo;
    }

    public Garagem getVaga() {
        return vaga;
    }
}
