package br.com.vindiesel.model;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

/**
 *
 * @author William
 */
public class Dimensao {

    private Integer id;
    @DecimalMin(value = "0.00")
    @DecimalMax("999999999.00")
    private Double comprimento;
    @DecimalMin(value = "0.00")
    @DecimalMax("999999999.00")
    private Double largura;
    @DecimalMin(value = "0.00")
    @DecimalMax("999999999.00")
    private Double altura;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    
    

}
