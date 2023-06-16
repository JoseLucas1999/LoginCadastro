package DAO;

import javax.swing.ComboBoxModel;
import javax.swing.table.DefaultTableModel;
import view.AgendarUsuario;

public class PreencherTabelaCadastro {
    private final AgendarUsuario agendaView;

    public PreencherTabelaCadastro(AgendarUsuario agendaView) {
        this.agendaView = agendaView;
    }
    
    public void PreencherTabela(){
        ComboBoxModel<String> nome = agendaView.getUsuarioComboBox().getModel();
        DefaultTableModel tabelaModel = (DefaultTableModel) agendaView.getTabelaCadastros().getModel();
        tabelaModel.setNumRows(0);
        
        Object[] dados = {nome.toString()};
        tabelaModel.addRow(dados);
    }

}
