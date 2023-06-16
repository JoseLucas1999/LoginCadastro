package DAO;

import JDBC.ConexaoJDBC;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import view.LoginView;
import view.MenuView;

public class AltenticarUsuario {
    
    private final LoginView viewLogin;

    //construtor
    public AltenticarUsuario(LoginView view) {
        this.viewLogin = view;
    }
    
    public void autenticar()throws SQLException{        
        //buscar usuario na tela
        String usuarioTela = viewLogin.getLoginUsuario().getText();
        String senhaTela = viewLogin.getSenhaUsuario().getText();
        Usuario usuario = new Usuario(usuarioTela,senhaTela);
        
        //verificar usuario no banco 
        Connection conexao = ConexaoJDBC.getConexao();
        String sql = "SELECT nome,senha FROM usuario WHERE nome  = ? and senha = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, usuarioTela);
        stmt.setString(2, senhaTela);
        stmt.execute();
        ResultSet resultado = stmt.getResultSet();
        
	if(resultado.next()) {
            MenuView telaDeMenu = new MenuView();
            telaDeMenu.setVisible(true);
	}else{
            this.viewLogin.exibirMensagem("Usuario ou senha invalido! ");
    }
        stmt.close(); 
	conexao.close();
    }
}