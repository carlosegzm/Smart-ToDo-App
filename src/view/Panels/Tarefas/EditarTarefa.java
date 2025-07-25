package view.Panels.Tarefas;

import controller.TodoController;
import exceptions.EntityNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.GrupoTarefas;
import model.Tarefa;
import view.Dashboard;

/**
 *
 * @author boli6
 */
public class EditarTarefa extends javax.swing.JPanel {

    private Dashboard d;
    private GrupoTarefas g;
    private TodoController c;
    private Tarefa t;

    /**
     * Creates new form EditarTarefa
     */
    public EditarTarefa(Dashboard d, GrupoTarefas g, Tarefa t, TodoController c) {
        this.d = d;
        this.g = g;
        this.t = t;
        this.c = c;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCentral = new javax.swing.JPanel();
        jPanelTopo = new javax.swing.JPanel();
        Icon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonEditarTarefa = new javax.swing.JButton();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelNome1 = new javax.swing.JLabel();
        jLabelNome2 = new javax.swing.JLabel();
        jComboBoxLista = new javax.swing.JComboBox<>();
        Cancelar2 = new javax.swing.JButton();
        jFormattedTextFieldInicioData = new javax.swing.JFormattedTextField();
        jLabelNome = new javax.swing.JLabel();
        Editar = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldPrioridade = new javax.swing.JTextField();
        jLabelNome4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Banner = new javax.swing.JLabel();

        jPanelCentral.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCentral.setPreferredSize(new java.awt.Dimension(653, 606));

        jPanelTopo.setBackground(new java.awt.Color(0, 17, 33));

        Icon.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Icon.setForeground(new java.awt.Color(255, 255, 255));
        Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarefas.png"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jButtonEditarTarefa.setBackground(new java.awt.Color(0, 17, 33));
        jButtonEditarTarefa.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButtonEditarTarefa.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarTarefa.setText("Editar Nova Tarefa");
        jButtonEditarTarefa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButtonEditarTarefa.setContentAreaFilled(false);
        jButtonEditarTarefa.setFocusPainted(false);
        jButtonEditarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarTarefaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTopoLayout = new javax.swing.GroupLayout(jPanelTopo);
        jPanelTopo.setLayout(jPanelTopoLayout);
        jPanelTopoLayout.setHorizontalGroup(
            jPanelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanelTopoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButtonEditarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTopoLayout.setVerticalGroup(
            jPanelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopoLayout.createSequentialGroup()
                .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEditarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jLabelDescricao.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabelDescricao.setForeground(new java.awt.Color(0, 17, 33));
        jLabelDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDescricao.setText("Descrição:");

        jTextFieldDescricao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDescricao.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jTextFieldDescricao.setForeground(new java.awt.Color(0, 17, 33));
        jTextFieldDescricao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 17, 33), 1, true));

        jLabelNome1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabelNome1.setForeground(new java.awt.Color(0, 17, 33));
        jLabelNome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNome1.setText("Prazo:");

        jLabelNome2.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabelNome2.setForeground(new java.awt.Color(0, 17, 33));
        jLabelNome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNome2.setText("Prioridade:");

        jComboBoxLista.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxLista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBoxLista.setForeground(new java.awt.Color(0, 17, 33));
        jComboBoxLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        jComboBoxLista.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 17, 33), 1, true));

        Cancelar2.setBackground(new java.awt.Color(255, 255, 255));
        Cancelar2.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        Cancelar2.setForeground(new java.awt.Color(0, 17, 33));
        Cancelar2.setText("Cancelar");
        Cancelar2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 17, 33), 1, true));
        Cancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar2ActionPerformed(evt);
            }
        });

        jFormattedTextFieldInicioData.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextFieldInicioData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 17, 33), 1, true));
        jFormattedTextFieldInicioData.setForeground(new java.awt.Color(0, 17, 33));
        try {
            jFormattedTextFieldInicioData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldInicioData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldInicioData.setEnabled(false);
        jFormattedTextFieldInicioData.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N

        jLabelNome.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(0, 17, 33));
        jLabelNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNome.setText("Nome:");

        Editar.setBackground(new java.awt.Color(255, 255, 255));
        Editar.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        Editar.setForeground(new java.awt.Color(0, 17, 33));
        Editar.setText("Editar");
        Editar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 17, 33), 1, true));
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        jTextFieldNome.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNome.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jTextFieldNome.setForeground(new java.awt.Color(0, 17, 33));
        jTextFieldNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 17, 33), 1, true));

        jTextFieldPrioridade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPrioridade.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jTextFieldPrioridade.setForeground(new java.awt.Color(0, 17, 33));
        jTextFieldPrioridade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPrioridade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 17, 33), 1, true));

        jLabelNome4.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabelNome4.setForeground(new java.awt.Color(0, 17, 33));
        jLabelNome4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNome4.setText("Concluída:");

        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Design sem nome.gif"))); // NOI18N

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                        .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(Cancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                                .addComponent(jLabelDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCentralLayout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNome))
                            .addGroup(jPanelCentralLayout.createSequentialGroup()
                                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                                        .addComponent(jLabelNome1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldInicioData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelNome2))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNome4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxLista, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addComponent(Banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addComponent(jPanelTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricao)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome1)
                    .addComponent(jLabelNome2)
                    .addComponent(jFormattedTextFieldInicioData, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome4)
                    .addComponent(jComboBoxLista, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Editar)
                    .addComponent(Cancelar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Banner))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarTarefaActionPerformed

    }//GEN-LAST:event_jButtonEditarTarefaActionPerformed

    private void Cancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar2ActionPerformed
        Tarefas tarefa = new Tarefas(d, g, c);
        d.abrirPanelForm(tarefa);
    }//GEN-LAST:event_Cancelar2ActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        try {
            Tarefa new_t = new Tarefa();

            if (!jTextFieldNome.getText().isBlank()) {
                new_t.setTitulo(jTextFieldNome.getText());
            }

            if (!jTextFieldDescricao.getText().isBlank()) {
                new_t.setDescricao(jTextFieldDescricao.getText());
            }
            if (!jTextFieldPrioridade.getText().isBlank()) {
                new_t.setPrioridade(Integer.parseInt(jTextFieldPrioridade.getText()));
            }
            new_t.setConcluida(!jComboBoxLista.getSelectedItem().equals("Sim"));
            new_t.setId(this.t.getId());
            
            c.updateTask(new_t);
            Tarefas tarefa = new Tarefas(d, g, c);
            d.abrirPanelForm(tarefa);
        } catch (SQLException | EntityNotFoundException ex) {
            Logger.getLogger(EditarTarefa.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_EditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Banner;
    private javax.swing.JButton Cancelar2;
    private javax.swing.JButton Editar;
    private javax.swing.JLabel Icon;
    private javax.swing.JButton jButtonEditarTarefa;
    private javax.swing.JComboBox<String> jComboBoxLista;
    private javax.swing.JFormattedTextField jFormattedTextFieldInicioData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNome1;
    private javax.swing.JLabel jLabelNome2;
    private javax.swing.JLabel jLabelNome4;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelTopo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPrioridade;
    // End of variables declaration//GEN-END:variables
}
