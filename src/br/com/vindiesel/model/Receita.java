package br.com.vindiesel.model;

import java.time.LocalDateTime;
import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

/**
 *
 * @author william.mauro
 */
public class Receita {

    private Integer id;
    @NotNull
    private Date dataCadastro;
    private Date dataPagamento;
    @NotNull
    @Future
    private Date dataVencimento;
    @DecimalMin(value = "0.00")
    @DecimalMax("999999999.00")
    private Double valorTotal;
    @DecimalMin(value = "0.00")
    @DecimalMax("999999999.00")
    private Double valorRecebido;
    @Valid
    private Entrega entrega;
    @Valid
    private FormaPagamento formaPagamento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(Double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "Receita{" + "id=" + id + ", dataCadastro=" + dataCadastro + ", dataPagamento=" + dataPagamento + ", dataVencimento=" + dataVencimento + ", valorTotal=" + valorTotal + ", valorRecebido=" + valorRecebido + ", entrega=" + entrega + ", formaPagamento=" + formaPagamento + '}';
    }

}
