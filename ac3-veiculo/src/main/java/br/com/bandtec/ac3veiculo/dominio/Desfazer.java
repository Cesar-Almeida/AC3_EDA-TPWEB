package br.com.bandtec.ac3veiculo.dominio;

public class Desfazer <T>{

    private String metodo;

    private T pilhaDesfazer;

    public Desfazer(String post, T pilhaDesfazer) {
        this.metodo = metodo;
        this.pilhaDesfazer = pilhaDesfazer;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public T getPilhaDesfazer() {
        return pilhaDesfazer;
    }

    public void setPilhaDesfazer(T pilhaDesfazer) {
        this.pilhaDesfazer = pilhaDesfazer;
    }
}
