package br.edu.iftm.rastreamento.service.exceptions;

public class IdNaoEncontradoException extends RuntimeException {
    public IdNaoEncontradoException(String message) {
        super(message);
    }
}