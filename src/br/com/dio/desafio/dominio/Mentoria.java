package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String tilulo;
    private String descricao;
    LocalDate data;

    public Mentoria() {
    }

    public String getTilulo() {
        return tilulo;
    }

    public void setTilulo(String tilulo) {
        this.tilulo = tilulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "mentoria{" +
                "tilulo='" + tilulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
