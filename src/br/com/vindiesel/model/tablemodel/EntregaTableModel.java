package br.com.vindiesel.model.tablemodel;

import br.com.vindiesel.interfaces.AcoesTableModel;
import br.com.vindiesel.model.Entrega;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Will
 */
public class EntregaTableModel extends AbstractTableModel implements AcoesTableModel<Entrega> {

    private static final int ENCOMENDA_CODIGO = 0;
    private static final int DATA_CADASTRO = 1;
    private static final int DATA_ENTREGA = 2;
    private static final int VALOR_ENTREGA = 3;
    private static final int REMETENTE_NOME = 4;
    private static final int DESTINATARIO_NOME = 5;
    private static final int ENTREGUE = 6;

    private List<Entrega> linhas;
    private String[] COLUNAS = {"CÓDIGO RASTREIO", "CADASTRO", "ENTREGA", "FRETE", "REMETENTE", "DESTINATARIO", "ENTREGUE"};

    public EntregaTableModel() {
        linhas = new ArrayList<>();
    }

    public EntregaTableModel(List<Entrega> listEntregas) {
        linhas = new ArrayList<>(listEntregas);
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return COLUNAS.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return COLUNAS[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case ENCOMENDA_CODIGO:
                return String.class;
            case DATA_CADASTRO:
                return LocalDate.class;
            case DATA_ENTREGA:
                return LocalDate.class;
            case VALOR_ENTREGA:
                return Double.class;
            case REMETENTE_NOME:
                return String.class;
            case DESTINATARIO_NOME:
                return String.class;
            case ENTREGUE:
                return String.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Entrega entrega = linhas.get(linha);
        switch (coluna) {
            case ENCOMENDA_CODIGO:
                return entrega.getEncomenda().getCodigoRastreio();
            case DATA_CADASTRO:
                return entrega.getDataCadastro().toLocalDate();
            case DATA_ENTREGA:
                if (entrega.getDataEntrega() == null) {
                    return "Nao informado";
                } else {
                    return entrega.getDataEntrega().toLocalDate();
                }
            case VALOR_ENTREGA:
                return entrega.getValorTotal();
            case REMETENTE_NOME:
                return entrega.getRemetente().getNome();
            case DESTINATARIO_NOME:
                return entrega.getDestinatario().getNome();
            case ENTREGUE:
                return entrega.getEntregue();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        Entrega entrega = linhas.get(linha);
        switch (coluna) {
            case ENCOMENDA_CODIGO:
                entrega.getEncomenda().setCodigoRastreio((String) valor);
                break;
            case DATA_CADASTRO:
                entrega.setDataCadastro((LocalDateTime) valor);
                break;
            case DATA_ENTREGA:
                entrega.setDataEntrega((LocalDateTime) valor);
                break;
            case VALOR_ENTREGA:
                entrega.setValorTotal((Double) valor);
                break;
            case REMETENTE_NOME:
                entrega.getRemetente().setNome((String) valor);
                break;
            case DESTINATARIO_NOME:
                entrega.getDestinatario().setNome((String) valor);
                break;
            case ENTREGUE:
                entrega.setEntregue((Boolean) valor);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");

        }
        this.fireTableCellUpdated(linha, coluna); // Atualiza Celula da tabela

    }

    @Override
    public Entrega pegaObjeto(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    @Override
    public void adicionar(Entrega entrega) {
        linhas.add(entrega);
        int ultimoIndice = getRowCount() - 1; // linhas -1
        fireTableRowsInserted(ultimoIndice, ultimoIndice); // atualiza insert
    }

    @Override
    public void adicionar(List<Entrega> entregas) {
        int indice = getRowCount();
        linhas.addAll(entregas);
        fireTableRowsInserted(indice, indice + entregas.size());
        fireTableDataChanged();
    }

    @Override
    public void remover(int indiceLinha) {
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha); // atualiza delete
    }

    @Override
    public void remover(int linhaInicio, int linhaFim) {
        for (int i = linhaInicio; i <= linhaFim; i++) {
            linhas.remove(i);
            fireTableRowsDeleted(linhaInicio, linhaFim); // atualiza delete
        }

    }

    @Override
    public void atualizar(int indiceLinha, Entrega entrega) {
        linhas.set(indiceLinha, entrega);
        fireTableRowsUpdated(indiceLinha, indiceLinha); // atualiza delete
    }

    @Override
    public void limpar() {
        linhas.clear();
        fireTableDataChanged(); // atualiza toda tabela.
    }

}