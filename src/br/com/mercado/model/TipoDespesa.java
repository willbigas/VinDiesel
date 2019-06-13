/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mercado.model;

import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author william.mauro
 */
public class TipoDespesa {

    private Integer id;
    @NotBlank
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "TipoDespesa{" + "id=" + id + ", nome=" + nome + '}';
    }

}
