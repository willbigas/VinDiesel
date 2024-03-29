package br.com.vindiesel.control.report;

import br.com.vindiesel.dao.EntregaDao;
import br.com.vindiesel.model.Entrega;
import br.com.vindiesel.uteis.Relatorio;
import br.com.vindiesel.uteis.UtilDate;
import br.com.vindiesel.view.TelaEntregaGerenciarRelatorio;
import br.com.vindiesel.view.TelaPrincipal;
import java.io.InputStream;
import java.util.List;

/**
 *
 * @author William
 */
public class TelaEntregaGerenciarRelatorioControl {

    TelaEntregaGerenciarRelatorio telaEntregaGerenciarRelatorio;
    EntregaDao entregaDao;
    Entrega entrega;
    List<Entrega> listEntregas;

    private static final int CB_OPCAO_NENHUMA = 0;
    private static final int CB_OPCAO_DATA_ENTREGA = 1;
    private static final int CB_OPCAO_DATA_CADASTRO = 2;
    private static final int CB_OPCAO_CODIGO_ENCOMENDA = 3;
    private static final int CB_OPCAO_CODIGO_REMETENTE = 4;
    private static final int CB_OPCAO_CODIGO_DESTINATARIO = 5;

    public TelaEntregaGerenciarRelatorioControl() {
        entregaDao = new EntregaDao();
    }

    public void chamarTelaEncomendaGerenciarRelatorio() {

        if (telaEntregaGerenciarRelatorio == null) {
            telaEntregaGerenciarRelatorio = new TelaEntregaGerenciarRelatorio(this);
            TelaPrincipal.desktopPane.add(telaEntregaGerenciarRelatorio);
            telaEntregaGerenciarRelatorio.setVisible(true);
        } else {
            if (telaEntregaGerenciarRelatorio.isVisible()) {
                telaEntregaGerenciarRelatorio.pack();
            } else {
                TelaPrincipal.desktopPane.add(telaEntregaGerenciarRelatorio);
                telaEntregaGerenciarRelatorio.setVisible(true);
            }
        }
    }

    public void acionarRelatorioAction() {
        if (telaEntregaGerenciarRelatorio.getCbOpcaoPesquisa().getSelectedIndex() == CB_OPCAO_NENHUMA) {
            listEntregas = entregaDao.pesquisar();
        }
        if (telaEntregaGerenciarRelatorio.getCbOpcaoPesquisa().getSelectedIndex() == CB_OPCAO_DATA_ENTREGA) {
            listEntregas = entregaDao.pesquisarPorDataEntrega(UtilDate.deStringParaStringBanco(telaEntregaGerenciarRelatorio.getTfCampoPesquisa().getText()));
        }
        if (telaEntregaGerenciarRelatorio.getCbOpcaoPesquisa().getSelectedIndex() == CB_OPCAO_DATA_CADASTRO) {
            listEntregas = entregaDao.pesquisarPorDataCadastro(UtilDate.deStringParaStringBanco(telaEntregaGerenciarRelatorio.getTfCampoPesquisa().getText()));
        }
        if (telaEntregaGerenciarRelatorio.getCbOpcaoPesquisa().getSelectedIndex() == CB_OPCAO_CODIGO_ENCOMENDA) {
            listEntregas = entregaDao.pesquisarPorEncomenda(telaEntregaGerenciarRelatorio.getTfCampoPesquisa().getText());
        }
        if (telaEntregaGerenciarRelatorio.getCbOpcaoPesquisa().getSelectedIndex() == CB_OPCAO_CODIGO_REMETENTE) {
            listEntregas = entregaDao.pesquisarPorCodigoRemetente(telaEntregaGerenciarRelatorio.getTfCampoPesquisa().getText());
        }
        if (telaEntregaGerenciarRelatorio.getCbOpcaoPesquisa().getSelectedIndex() == CB_OPCAO_CODIGO_DESTINATARIO) {
            listEntregas = entregaDao.pesquisarPorCodigoDestinatario(telaEntregaGerenciarRelatorio.getTfCampoPesquisa().getText());
        }
        chamarRelatorioEncomendas(listEntregas);

    }

    private void chamarRelatorioEncomendas(List<Entrega> entregas) {
        InputStream jasperFile = getClass().getResourceAsStream("/reports/entregasList.jasper");
        List<Object> objects = (List<Object>) (Object) entregas;
        Relatorio.chamarRelatorio(jasperFile, null, objects);
    }

}
