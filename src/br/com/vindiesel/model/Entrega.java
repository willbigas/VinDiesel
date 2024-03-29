package br.com.vindiesel.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

/**
 *
 * @author william.mauro
 */
public class Entrega {

    private Integer id;
    @DecimalMin(value = "0.00")
    @DecimalMax("999999999.00")
    private Double valorTotal;
    @NotNull
    private Date dataCadastro;
    private Date dataEntrega;
    @NotNull
    private Boolean entregue;
    @Valid
    private Remetente remetente;
    @Valid
    private Destinatario destinatario;
    @Valid
    private Encomenda encomenda;
    @Valid
    List<Tramite> tramites;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Boolean getEntregue() {
        return entregue;
    }

    public void setEntregue(Boolean entregue) {
        this.entregue = entregue;
    }

    public Remetente getRemetente() {
        return remetente;
    }

    public void setRemetente(Remetente remetente) {
        this.remetente = remetente;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
    }

    public List<Tramite> getTramites() {
        return tramites;
    }

    public void setTramites(List<Tramite> tramites) {
        this.tramites = tramites;
    }
    
    
    @Override
    public String toString() {
        return "Entrega{" + "id=" + id + ", valorTotal=" + valorTotal + ", dataCadastro=" + dataCadastro + ", dataEntrega=" + dataEntrega + ", entregue=" + entregue + ", remetente=" + remetente + ", destinatario=" + destinatario + ", encomenda=" + encomenda + '}';
    }

}
