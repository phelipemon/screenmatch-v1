package br.com.alura.screenmatch.exceptions;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }
    public String getMensage() {
        return this.mensagem;
    }
}
