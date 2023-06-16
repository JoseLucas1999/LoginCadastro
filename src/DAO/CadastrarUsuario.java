package DAO;

import JDBC.ConexaoJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import view.CadastroView;

public class CadastrarUsuario {

    private final CadastroView viewCadastrar;

    //construtor
    public CadastrarUsuario(CadastroView view) {
        this.viewCadastrar = view;
    }
    
    public void Inserir() throws SQLException{
        Connection conexao = ConexaoJDBC.getConexao();
        
        String nome = viewCadastrar.getCadastroText().getText();
        String senha = viewCadastrar.getSenhaText().getText();
        String sql = "INSERT INTO usuario(nome,senha) VALUES(?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            stmt.execute();
            this.viewCadastrar.exibirMensagem("cadastro efetuado com sucesso");
            
            this.viewCadastrar.getCadastroText().setText("");
            this.viewCadastrar.getSenhaText().setText("");
            conexao.close();
        }
    
}
