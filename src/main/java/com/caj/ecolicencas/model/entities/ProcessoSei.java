package com.caj.ecolicencas.model.entities;

public class ProcessoSei {
    private int Id;
    private String descricao;
    private String ativo;

    public ProcessoSei(int id, String descricao, String ativo) {
        Id = id;
        this.descricao = descricao;
        this.ativo = ativo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
}
