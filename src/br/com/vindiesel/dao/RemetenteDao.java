package br.com.vindiesel.dao;

import br.com.vindiesel.model.Remetente;
import br.com.vindiesel.interfaces.DaoI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author william.mauro
 */
public class RemetenteDao extends DaoBD implements DaoI<Remetente> {

    EnderecoDao enderecoDao;

    public RemetenteDao() {
        super();
        enderecoDao = new EnderecoDao();
    }

    @Override
    public int inserir(Remetente remetente) {
        String queryInsert = "INSERT INTO remetente (NOME, CODIGOPESSOA , ENDERECO_ID, TELEFONE , EMAIL) VALUES(?, ?, ?, ? , ?)";
        try {
            PreparedStatement stmt;
            stmt = conexao.prepareStatement(queryInsert, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, remetente.getNome());
            stmt.setString(2, remetente.getCodigoPessoa());
            stmt.setInt(3, remetente.getEndereco().getId());
            stmt.setString(4, remetente.getTelefone());
            stmt.setString(5, remetente.getEmail());
            ResultSet res;
            if (stmt.executeUpdate() > 0) {
                res = stmt.getGeneratedKeys();
                res.next();
                return res.getInt(1);
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return 0;
        }
    }

    @Override
    public boolean alterar(Remetente remetente) {
        String queryUpdate = "UPDATE remetente SET nome = ?, CODIGOPESSOA = ?, ENDERECO_ID = ?, TELEFONE = ? , EMAIL = ? WHERE ID = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(queryUpdate);
            stmt.setString(1, remetente.getNome());
            stmt.setString(2, remetente.getCodigoPessoa());
            stmt.setInt(3, remetente.getEndereco().getId());
            stmt.setString(4, remetente.getTelefone());
            stmt.setString(5, remetente.getEmail());
            stmt.setInt(6, remetente.getId());
            return stmt.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean deletar(Remetente obj) {
        String queryDelete = "DELETE FROM REMETENTE WHERE ID = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(queryDelete);
            stmt.setInt(1, obj.getId());
            return stmt.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean deletar(int id) {
        String queryDelete = "DELETE FROM REMETENTE WHERE ID = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(queryDelete);
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean desativar(Remetente remetente) {
        String sql = "UPDATE REMETENTE SET ativo = false WHERE id = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, remetente.getId());
            return stmt.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean desativar(int id) {
        String sql = "UPDATE REMETENTE SET ativo = false WHERE id = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public List<Remetente> pesquisar() {
        String querySelect = "SELECT * FROM REMETENTE";
        try {
            PreparedStatement stmt;
            stmt = conexao.prepareStatement(querySelect);
            ResultSet result = stmt.executeQuery();
            List<Remetente> lista = new ArrayList<>();
            while (result.next()) {
                Remetente remetente = new Remetente();
                remetente.setId(result.getInt("id"));
                remetente.setNome(result.getString("nome"));
                remetente.setCodigoPessoa(result.getString("codigoPessoa"));
                remetente.setTelefone(result.getString("telefone"));
                remetente.setEmail(result.getString("email"));
                remetente.setEndereco(enderecoDao.pesquisar(result.getInt("endereco_id")));
                lista.add(remetente);
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public List<Remetente> pesquisar(String termo) {
        String querySelectComTermo = "SELECT * FROM remetente WHERE (nome LIKE ? or telefone LIKE ? or codigoPessoa like ? )";
        try {
            PreparedStatement stmt = conexao.prepareStatement(querySelectComTermo);
            stmt.setString(1, "%" + termo + "%");
            stmt.setString(2, "%" + termo + "%");
            stmt.setString(3, "%" + termo + "%");
            ResultSet result = stmt.executeQuery();
            List<Remetente> lista = new ArrayList<>();
            while (result.next()) {
                Remetente remetente = new Remetente();
                remetente.setId(result.getInt("id"));
                remetente.setNome(result.getString("nome"));
                remetente.setCodigoPessoa(result.getString("codigoPessoa"));
                remetente.setTelefone(result.getString("telefone"));
                remetente.setEmail(result.getString("email"));
                remetente.setEndereco(enderecoDao.pesquisar(result.getInt("endereco_id")));
                lista.add(remetente);
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public Remetente pesquisar(int id) {
        String querySelectPorId = "SELECT * FROM remetente WHERE ID = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(querySelectPorId);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            if (result.next()) {
                Remetente remetente = new Remetente();
                remetente.setId(result.getInt("id"));
                remetente.setNome(result.getString("nome"));
                remetente.setCodigoPessoa(result.getString("codigoPessoa"));
                remetente.setTelefone(result.getString("telefone"));
                remetente.setEmail(result.getString("email"));
                remetente.setEndereco(enderecoDao.pesquisar(result.getInt("endereco_id")));
                return remetente;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
     public List<Remetente> pesquisarPorCodigoPessoa(String codigoPessoa) {
        String querySelectComTermo = "SELECT * FROM remetente WHERE (codigoPessoa like ?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(querySelectComTermo);
            stmt.setString(1, "%" + codigoPessoa + "%");
            ResultSet result = stmt.executeQuery();
            List<Remetente> lista = new ArrayList<>();
            while (result.next()) {
                Remetente remetente = new Remetente();
                remetente.setId(result.getInt("id"));
                remetente.setNome(result.getString("nome"));
                remetente.setCodigoPessoa(result.getString("codigoPessoa"));
                remetente.setTelefone(result.getString("telefone"));
                remetente.setEmail(result.getString("email"));
                remetente.setEndereco(enderecoDao.pesquisar(result.getInt("endereco_id")));
                lista.add(remetente);
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
     public List<Remetente> pesquisarPorNome(String nome) {
        String querySelectComTermo = "SELECT * FROM remetente WHERE (nome like ?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(querySelectComTermo);
            stmt.setString(1, "%" + nome + "%");
            ResultSet result = stmt.executeQuery();
            List<Remetente> lista = new ArrayList<>();
            while (result.next()) {
                Remetente remetente = new Remetente();
                remetente.setId(result.getInt("id"));
                remetente.setNome(result.getString("nome"));
                remetente.setCodigoPessoa(result.getString("codigoPessoa"));
                remetente.setTelefone(result.getString("telefone"));
                remetente.setEmail(result.getString("email"));
                remetente.setEndereco(enderecoDao.pesquisar(result.getInt("endereco_id")));
                lista.add(remetente);
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
