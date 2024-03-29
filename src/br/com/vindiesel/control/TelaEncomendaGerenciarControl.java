package br.com.vindiesel.control;

import br.com.vindiesel.dao.DimensaoDao;
import br.com.vindiesel.dao.EncomendaDao;
import br.com.vindiesel.model.Dimensao;
import br.com.vindiesel.model.Encomenda;
import br.com.vindiesel.model.tablemodel.EncomendaTableModel;
import br.com.vindiesel.uteis.Mensagem;
import br.com.vindiesel.uteis.Texto;
import br.com.vindiesel.uteis.DecimalFormat;
import br.com.vindiesel.uteis.UtilTable;
import br.com.vindiesel.uteis.Validacao;
import br.com.vindiesel.view.TelaEncomendaFicha;
import br.com.vindiesel.view.TelaPrincipal;
import br.com.vindiesel.view.TelaEncomendaGerenciar;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class TelaEncomendaGerenciarControl {

    private static final int CODIGO_RASTREIO = 0;
    private static final int VALOR_NF = 1;
    private static final int PESO = 2;
    private static final int LARGURA = 3;
    private static final int ALTURA = 4;
    private static final int COMPRIMENTO = 5;

    TelaEncomendaGerenciar telaEncomendaGerenciar;
    TelaEncomendaFicha telaEncomendaFicha;
    EncomendaTableModel encomendaTableModel;
    EncomendaDao encomendaDao;
    DimensaoDao dimensaoDao;
    Encomenda encomenda;
    Dimensao dimensao;
    Integer linhaSelecionada;

    public TelaEncomendaGerenciarControl() {
        encomendaDao = new EncomendaDao();
        dimensaoDao = new DimensaoDao();
        encomendaTableModel = new EncomendaTableModel();
    }

    public void chamarTelaEncomendaGerenciar() {
        if (telaEncomendaGerenciar == null) {
            telaEncomendaGerenciar = new TelaEncomendaGerenciar(this);
            TelaPrincipal.desktopPane.add(telaEncomendaGerenciar);
            telaEncomendaGerenciar.setVisible(true);
        } else {
            if (telaEncomendaGerenciar.isVisible()) {
                telaEncomendaGerenciar.pack();
            } else {
                TelaPrincipal.desktopPane.add(telaEncomendaGerenciar);
                telaEncomendaGerenciar.setVisible(true);
            }
        }

        telaEncomendaGerenciar.getTblProduto().setModel(encomendaTableModel);
        atualizaTotalDeValorNf(encomendaDao.pesquisar());
        atualizaTotalDosEncomendas(encomendaDao.pesquisar());
        encomendaTableModel.limpar();
        encomendaTableModel.adicionar(encomendaDao.pesquisar());
        telaEncomendaGerenciar.getTfCodigoRastreio().setEditable(false);
        telaEncomendaGerenciar.getTpProduto().setEnabledAt(1, false);
        telaEncomendaGerenciar.getTfPesquisar().requestFocus();
        redimensionarTabela();
    }

    private void redimensionarTabela() {
        UtilTable.centralizarCabecalho(telaEncomendaGerenciar.getTblProduto());
        UtilTable.redimensionar(telaEncomendaGerenciar.getTblProduto(), CODIGO_RASTREIO, 130);
        UtilTable.redimensionar(telaEncomendaGerenciar.getTblProduto(), VALOR_NF, 130);
        UtilTable.redimensionar(telaEncomendaGerenciar.getTblProduto(), PESO, 82);
        UtilTable.redimensionar(telaEncomendaGerenciar.getTblProduto(), LARGURA, 82);
        UtilTable.redimensionar(telaEncomendaGerenciar.getTblProduto(), ALTURA, 82);
        UtilTable.redimensionar(telaEncomendaGerenciar.getTblProduto(), COMPRIMENTO, 82);
    }

    public void novaEncomendaAction() {
        limparCampos();
        telaEncomendaGerenciar.getTpProduto().setEnabledAt(1, true);
        UtilTable.limparSelecaoDaTabela(telaEncomendaGerenciar.getTblProduto());
        encomenda = null;
        telaEncomendaGerenciar.getTpProduto().setSelectedIndex(1);
        telaEncomendaGerenciar.getTfValorNf().requestFocus();
    }

    public void chamarDialogEncomendaFichaAction() {
        telaEncomendaFicha = new TelaEncomendaFicha(telaEncomendaGerenciar, true, this);
        carregarEncomendaJdialogFicha();
        telaEncomendaFicha.setVisible(true);
    }

    private void cadastrarEncomenda() {
        encomenda = new Encomenda();
        try {
            setarAtributosDeEncomenda();

            dimensao = new Dimensao();
            setarAtributosDeDimensao();
        } catch (NumberFormatException numberFormatException) {
            Mensagem.info(Texto.ERRO_COVERTER_CAMPO_DECIMAL);
            dimensao = null;
            encomenda = null;
            return;
        }

        if (Validacao.validaEntidade(dimensao) != null) {
            Mensagem.info(Validacao.validaEntidade(dimensao));
            dimensao = null;
            encomenda = null;
            return;
        }
        int idDimensaoInserida = dimensaoDao.inserir(dimensao);
        dimensao.setId(idDimensaoInserida);
        encomenda.setDimensao(dimensao);

        if (Validacao.validaEntidade(encomenda) != null) {
            Mensagem.info(Validacao.validaEntidade(encomenda));
            dimensao = null;
            encomenda = null;
            return;
        }

        Integer idInserido = encomendaDao.inserir(encomenda);
        if (idInserido != 0) {
            encomenda.setId(idInserido);
            encomendaTableModel.adicionar(encomenda);
            atualizaTotalDeValorNf(encomendaDao.pesquisar());
            atualizaTotalDosEncomendas(encomendaDao.pesquisar());
            limparCampos();
            Mensagem.info(Texto.SUCESSO_CADASTRAR);
        } else {
            Mensagem.erro(Texto.ERRO_CADASTRAR);
        }
        encomenda = null;
    }

    private void setarAtributosDeDimensao() throws NumberFormatException {
        dimensao.setComprimento(Double.valueOf(DecimalFormat.paraPonto(telaEncomendaGerenciar.getTfComprimento().getText())));
        dimensao.setAltura(Double.valueOf(DecimalFormat.paraPonto(telaEncomendaGerenciar.getTfAltura().getText())));
        dimensao.setLargura(Double.valueOf(DecimalFormat.paraPonto(telaEncomendaGerenciar.getTfLargura().getText())));
    }

    private void alterarEncomenda() {
        linhaSelecionada = telaEncomendaGerenciar.getTblProduto().getSelectedRow();
        encomenda = encomendaTableModel.pegaObjeto(telaEncomendaGerenciar.getTblProduto().getSelectedRow());

        try {

            setarAtributosDeEncomenda();
            dimensao = encomenda.getDimensao();
            setarAtributosDeDimensao();
        } catch (NumberFormatException numberFormatException) {
            Mensagem.info(Texto.ERRO_COVERTER_CAMPO_DECIMAL);
            return;
        }

        if (Validacao.validaEntidade(dimensao) != null) {
            Mensagem.info(Validacao.validaEntidade(dimensao));
            return;
        }

        boolean dimensaoAlterada = dimensaoDao.alterar(dimensao);
        encomenda.setDimensao(dimensao);

        if (Validacao.validaEntidade(encomenda) != null) {
            Mensagem.info(Validacao.validaEntidade(encomenda));
            return;
        }
        // atributos de encomenda
        boolean alterado = encomendaDao.alterar(encomenda);

        if (alterado) {
            encomendaTableModel.atualizar(linhaSelecionada, encomenda);
            Mensagem.info(Texto.SUCESSO_EDITAR);
            atualizaTotalDeValorNf(encomendaDao.pesquisar());
            atualizaTotalDosEncomendas(encomendaDao.pesquisar());
            limparCampos();
        } else {
            Mensagem.erro(Texto.ERRO_EDITAR);
        }
        encomenda = null;
        dimensao = null;
    }

    private void setarAtributosDeEncomenda() throws NumberFormatException {
        encomenda.setCodigoRastreio(telaEncomendaGerenciar.getTfCodigoRastreio().getText());
        encomenda.setPeso(Double.valueOf(DecimalFormat.paraPonto(telaEncomendaGerenciar.getTfPeso().getText())));
        encomenda.setValorNotaFiscal(Double.valueOf(DecimalFormat.paraPonto(telaEncomendaGerenciar.getTfValorNf().getText())));
    }

    public void gravarProdutoAction() {
        if (encomenda == null) {
            cadastrarEncomenda();
        } else {
            alterarEncomenda();
        }
    }

    public void carregarEncomendaAction() {
        if (validaLinhaNaoSelecionada()) {
            return;
        }
        encomenda = encomendaTableModel.pegaObjeto(telaEncomendaGerenciar.getTblProduto().getSelectedRow());
        telaEncomendaGerenciar.getTfCodigoRastreio().setText(encomenda.getCodigoRastreio());
        telaEncomendaGerenciar.getTfPeso().setText(DecimalFormat.paraVirgula(String.valueOf(encomenda.getPeso())));
        telaEncomendaGerenciar.getTfValorNf().setText(DecimalFormat.paraVirgula(String.valueOf(encomenda.getValorNotaFiscal())));
        telaEncomendaGerenciar.getTfComprimento().setText(DecimalFormat.paraVirgula(String.valueOf(encomenda.getDimensao().getComprimento())));
        telaEncomendaGerenciar.getTfAltura().setText(DecimalFormat.paraVirgula(String.valueOf(encomenda.getDimensao().getAltura())));
        telaEncomendaGerenciar.getTfLargura().setText(DecimalFormat.paraVirgula(String.valueOf(encomenda.getDimensao().getLargura())));
        telaEncomendaGerenciar.getTpProduto().setSelectedIndex(1);
        // Atributos de encomenda
    }

    private boolean validaLinhaNaoSelecionada() {
        if (telaEncomendaGerenciar.getTblProduto().getSelectedRow() == -1) {
            Mensagem.atencao(Texto.SELECIONADA_LINHA);
            return true;
        }
        return false;
    }

    public void excluirEncomendaAction() {
        if (telaEncomendaGerenciar.getTblProduto().getSelectedRow() == -1) {
            Mensagem.info(Texto.SELECIONADA_LINHA);
            return;
        }
        encomenda = encomendaTableModel.pegaObjeto(telaEncomendaGerenciar.getTblProduto().getSelectedRow());
        int retorno = Mensagem.confirmacao(Texto.PERGUNTA_EXCLUIR + encomenda.getCodigoRastreio() + " ?");

        if (retorno == JOptionPane.NO_OPTION || retorno == JOptionPane.CLOSED_OPTION) {
            return;
        }

        if (encomendaDao.deletar(encomenda.getId())) {
            encomendaTableModel.remover(telaEncomendaGerenciar.getTblProduto().getSelectedRow());
            telaEncomendaGerenciar.getTblProduto().clearSelection();
            Mensagem.info(Texto.SUCESSO_REMOVER);
        } else {
            Mensagem.erro(Texto.ERRO_DELETAR);
        }
        encomenda = null;
    }

    public void pesquisarEncomendaAction() {
        List<Encomenda> encomendasPesquisadas = encomendaDao.pesquisar(telaEncomendaGerenciar.getTfPesquisar().getText());
        if (encomendasPesquisadas == null) {
            encomendaTableModel.limpar();
            encomendasPesquisadas = encomendaDao.pesquisar();
            atualizaTotalDeValorNf(encomendasPesquisadas);
            atualizaTotalDosEncomendas(encomendasPesquisadas);
        } else {
            encomendaTableModel.limpar();
            encomendaTableModel.adicionar(encomendasPesquisadas);
            atualizaTotalDeValorNf(encomendasPesquisadas);
            atualizaTotalDosEncomendas(encomendasPesquisadas);
        }

    }

    public void limparCampos() {
        telaEncomendaGerenciar.getTfCodigoRastreio().setText("");
        telaEncomendaGerenciar.getTfPeso().setText("");
        telaEncomendaGerenciar.getTfValorNf().setText("");
        telaEncomendaGerenciar.getTfAltura().setText("");
        telaEncomendaGerenciar.getTfComprimento().setText("");
        telaEncomendaGerenciar.getTfLargura().setText("");
        telaEncomendaGerenciar.getTfPesquisar().setText("");
        telaEncomendaGerenciar.getTblProduto().clearSelection();
    }

    private String gerarCodigoRandomico() {
        Random rand = new Random();
        String prefixo = "VD-";
        String randomico = Integer.toHexString(rand.nextInt()).toUpperCase();
        String codigoMontado = prefixo + randomico;
        return codigoMontado;
    }

    public void geraCodigoRastreamentoRandomicoAction() {
        String codigoFinal = "";
        String codigoGeradoRancomicamente = gerarCodigoRandomico();
        if (encomendaDao.pesquisar(codigoGeradoRancomicamente) != null) {
            codigoFinal = gerarCodigoRandomico();
        } else {
            codigoFinal = codigoGeradoRancomicamente;
        }
        telaEncomendaGerenciar.getTfCodigoRastreio().setText(codigoFinal);
    }

    public void atualizaTotalDeValorNf(List<Encomenda> encomendas) {
        Double totalValorNfBanco = 0.0;
        Double totalValorNfFiltrado = 0.0;
        List<Encomenda> encomendasDobanco = encomendaDao.pesquisar();
        for (Encomenda encomenda : encomendasDobanco) {
            totalValorNfBanco += encomenda.getValorNotaFiscal();
        }
        for (Encomenda encomenda : encomendas) {
            totalValorNfFiltrado += encomenda.getValorNotaFiscal();
        }
        telaEncomendaGerenciar.getLblTotalValorNf().setText(DecimalFormat.decimalFormatR$(totalValorNfBanco));
        telaEncomendaGerenciar.getLblTotalValorNfFiltrados().setText(DecimalFormat.decimalFormatR$(totalValorNfFiltrado));
    }

    public void atualizaTotalDosEncomendas(List<Encomenda> remetentes) {
        Integer totalEncomendasBanco = 0;
        Integer totalEncomendasFiltradas = 0;
        List<Encomenda> remetentesDoBanco = encomendaDao.pesquisar();

        totalEncomendasBanco = remetentesDoBanco.size();
        totalEncomendasFiltradas = remetentes.size();

        telaEncomendaGerenciar.getLblTotalEncomendas().setText(String.valueOf(totalEncomendasBanco));
        telaEncomendaGerenciar.getLblTotalEncomendasFiltradas().setText(String.valueOf(totalEncomendasFiltradas));
    }

    private void carregarEncomendaJdialogFicha() {
        encomenda = encomendaTableModel.pegaObjeto(telaEncomendaGerenciar.getTblProduto().getSelectedRow());
        telaEncomendaFicha.getLblCodigo().setText(encomenda.getCodigoRastreio());
        telaEncomendaFicha.getLblValor().setText(DecimalFormat.decimalFormatR$(encomenda.getValorNotaFiscal()));
        telaEncomendaFicha.getLblPeso().setText(String.valueOf(encomenda.getPeso()) + " KG");
        telaEncomendaFicha.getLblLargura().setText(String.valueOf(encomenda.getDimensao().getLargura()) + " CM");
        telaEncomendaFicha.getLblAltura().setText(String.valueOf(encomenda.getDimensao().getAltura()) + " CM");
        telaEncomendaFicha.getLblProfundidade().setText(String.valueOf(encomenda.getDimensao().getComprimento()) + " CM");
    }
}
