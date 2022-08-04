package br.com.dio.desafio.dominio;



public class Curso {
    private String tilulo;
    private String descricao;
    private int cargaHoraria;

    public Curso() {
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "curso{" +
                "tilulo='" + tilulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
