/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vindiesel.model.tablemodel;

import br.com.vindiesel.model.Usuario;
import br.com.vindiesel.interfaces.AcoesTableModel;
import br.com.vindiesel.model.TipoUsuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author william.mauro
 */
public class UsuarioTableModel extends AbstractTableModel implements AcoesTableModel<Usuario> {

    private static final int CPF = 0;
    private static final int NOME = 1;
    private static final int EMAIL = 2;
    private static final int TELEFONE = 3;
    private static final int TIPOUSUARIO = 4;
    private static final int ATIVO = 5;

    private List<Usuario> linhas;
    private String[] COLUNAS = {"CPF", "NOME", "EMAIL", "TELEFONE", "TIPO USUARIO", "ATIVO"};

    public UsuarioTableModel() {
        linhas = new ArrayList<>();
    }

    public UsuarioTableModel(List<Usuario> listFuncionarios) {
        linhas = new ArrayList<>(listFuncionarios);
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
            case CPF:
                return String.class;
            case NOME:
                return String.class;
            case EMAIL:
                return String.class;
            case TELEFONE:
                return String.class;
            case TIPOUSUARIO:
                return String.class;
            case ATIVO:
                return String.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Usuario usuario = linhas.get(linha);
        switch (coluna) {
            case CPF:
                return usuario.getCpf();
            case NOME:
                return usuario.getNome();
            case EMAIL:
                return usuario.getEmail();
            case TELEFONE:
                return usuario.getTelefone();
            case TIPOUSUARIO:
                return usuario.getTipoUsuario();
            case ATIVO:
                if (usuario.getAtivo() == true) {
                    return "Ativado";
                } else {
                    return "Desativado";
                }
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        Usuario usuario = linhas.get(linha);
        switch (coluna) {
            case CPF:
                usuario.setCpf((String) valor);
                break;
            case NOME:
                usuario.setNome((String) valor);
                break;
            case EMAIL:
                usuario.setEmail((String) valor);
                break;
            case TELEFONE:
                usuario.setTelefone((String) valor);
                break;
            case TIPOUSUARIO:
                usuario.setTipoUsuario((TipoUsuario) valor);
                break;
            case ATIVO:
                if (valor.equals("Ativado")) {
                    usuario.setAtivo(true);
                } else {
                    usuario.setAtivo(false);
                }
                ;
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");

        }
        this.fireTableCellUpdated(linha, coluna); // Atualiza Celula da tabela

    }

    @Override
    public Usuario pegaObjeto(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    @Override
    public void adicionar(Usuario usuario) {
        linhas.add(usuario);
        int ultimoIndice = getRowCount() - 1; // linhas -1
        fireTableRowsInserted(ultimoIndice, ultimoIndice); // atualiza insert
    }

    @Override
    public void adicionar(List<Usuario> usuarios) {
        int indice = getRowCount();
        linhas.addAll(usuarios);
        fireTableRowsInserted(indice, indice + usuarios.size());
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
    public void atualizar(int indiceLinha, Usuario usuario) {
        linhas.set(indiceLinha, usuario);
        fireTableRowsUpdated(indiceLinha, indiceLinha); // atualiza delete
    }

    @Override
    public void limpar() {
        linhas.clear();
        fireTableDataChanged(); // atualiza toda tabela.
    }

}
