package view;

import DAO.FazerAgendamento;
import DAO.PreencherTabelaCadastro;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class AgendarUsuario extends javax.swing.JFrame {

    private final FazerAgendamento controller;
    private final PreencherTabelaCadastro controllerAgenda;
    public AgendarUsuario() throws SQLException {
        initComponents();
        controllerAgenda = new PreencherTabelaCadastro(this);
        controller = new FazerAgendamento(this);
 
        controller.agendar();
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCadastros = new javax.swing.JTable();
        UsuarioComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 38));

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 110, 40));

        tabelaCadastros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario"
            }
        ));
        jScrollPane1.setViewportView(tabelaCadastros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 380, 180));
        getContentPane().add(UsuarioComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 260, 34));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/fundoLogin.jpg"))); // NOI18N
        jLabel2.setText("Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 4, 500, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.controllerAgenda.PreencherTabela();
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> UsuarioComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCadastros;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getUsuarioComboBox() {
        return UsuarioComboBox;
    }

    public void setUsuarioComboBox(JComboBox<String> UsuarioComboBox) {
        this.UsuarioComboBox = UsuarioComboBox;
    }

    public JTable getTabelaCadastros() {
        return tabelaCadastros;
    }

    public void setTabelaCadastros(JTable tabelaCadastros) {
        this.tabelaCadastros = tabelaCadastros;
    }

    

}
