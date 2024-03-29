package br.com.vindiesel.uteis;

import br.com.vindiesel.factory.Conexao;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Will
 */
public class Relatorio {
    
    private static Connection con = Conexao.getConexao();
    
    public static void chamarRelatorio(String enderecoArq) {
        JasperPrint jasperPrint = null;
        try {
            jasperPrint = JasperFillManager.fillReport(enderecoArq, null, con);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório /n " + e);

        }
        JasperViewer.viewReport(jasperPrint, false); // false para não fechar a aplicação quando fechar o relatório.

    }

    public static void chamarRelatorio(InputStream enderecoArq, HashMap parametros) {
        JasperPrint jasperPrint = null;
        try {
            jasperPrint = JasperFillManager.fillReport(enderecoArq, parametros, con);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório /n " + e);

        }
        JasperViewer.viewReport(jasperPrint, false); // false para não fechar a aplicação quando fechar o relatório.

    }

    public static void chamarRelatorio(InputStream enderecoArq, HashMap parametros, List<Object> objetos) {
        JasperPrint jasperPrint = null;
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(objetos);
        try {
            jasperPrint = JasperFillManager.fillReport(enderecoArq, parametros, dataSource);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório /n " + e);

        }
        JasperViewer.viewReport(jasperPrint, false); // false para não fechar a aplicação quando fechar o relatório.

    }

}
