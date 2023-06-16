package DAO;

import JDBC.ConexaoJDBC;
import java.sql.Statement;
import java.sql.Connection;
import view.TabelaUsuarios;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class PreencherTabelaUsuarios {
    
    private TabelaUsuarios ViewTabela;
    public PreencherTabelaUsuarios(TabelaUsuarios view) {
        this.ViewTabela = view;
    }

   public void preencher()throws SQLException{
        //buscar lista com agendamentosno banco de dados
	Connection conn = ConexaoJDBC.getConexao();	
	String sql = "SELECT nome,senha FROM usuario";
        Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery(sql);
	
        DefaultTableModel tabelaModel = (DefaultTableModel) ViewTabela.getTabelaUsuarios().getModel();
        tabelaModel.setNumRows(0);
        
        while(rs.next()) {
            Object[] dados = {rs.getString("nome"),rs.getString("senha")};
            tabelaModel.addRow(dados);
	}
    }
}