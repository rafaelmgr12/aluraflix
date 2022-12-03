package com.rafaelmgr12.aluraflix.dto;


import javax.validation.constraints.NotBlank;

public class PostVideosFormDto {


    @NotBlank
    private String titulo;
    @NotBlank
    private String descricao;
    @NotBlank
    private String url;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
