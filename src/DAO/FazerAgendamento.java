package DAO;

import JDBC.ConexaoJDBC;
import Model.Usuario;
import java.sql.SQLException;
import view.AgendarUsuario;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class FazerAgendamento {
    private AgendarUsuario viewAgendar;

    public FazerAgendamento(AgendarUsuario viewAgendar) {
        this.viewAgendar = viewAgendar;
    }
    
    public void agendar()throws SQLException{
        
        Connection conn = ConexaoJDBC.getConexao();
        
	String sql = "SELECT nome FROM usuario";
        Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Usuario> usuario = new ArrayList<>();
	
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) viewAgendar.getUsuarioComboBox().getModel();
        
        while(rs.next()){
            String nome = rs.getString("nome");
            usuario.add(new Usuario(nome));
        }
        
        for(Usuario u : usuario){
            comboBoxModel.addElement(u);
        }
        
            
    }
}
