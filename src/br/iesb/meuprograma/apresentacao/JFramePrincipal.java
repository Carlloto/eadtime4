package br.iesb.meuprograma.apresentacao;

import br.iesb.meuprograma.apresentacao.bundle.IesbBundle;
import br.iesb.meuprograma.apresentacao.table.TreeCellRenderer;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
        initComponents();
        montarMenuLateral();
    }

    private void montarMenuLateral() {
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("br/iesb/meuprograma/apresentacao/bundle/Bundle");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode(bundle.getString("PrincipalCad.jTree.raiz.text"));
        DefaultMutableTreeNode child;

        //child = new DefaultMutableTreeNode(bundle.getString("PrincipalCad.jTree.registroObras.text"));
        //root.add(child);
        child = new DefaultMutableTreeNode(bundle.getString("PrincipalCad.jTree.condominos.text"));
        root.add(child);
        child = new DefaultMutableTreeNode(bundle.getString("PrincipalCad.jTree.visitante.text"));
        root.add(child);
        child = new DefaultMutableTreeNode(bundle.getString("PrincipalCad.jTree.entradaVisitante.text"));
        root.add(child);
        child = new DefaultMutableTreeNode(bundle.getString("PrincipalCad.jTree.dependentes.text"));
        root.add(child);
        child = new DefaultMutableTreeNode(bundle.getString("PrincipalCad.jTree.reservaEspaco.text"));
        root.add(child);
        child = new DefaultMutableTreeNode(bundle.getString("PrincipalCad.jTree.logout.text"));
        root.add(child);
        DefaultTreeModel dtm = new DefaultTreeModel(root);

        jTree1.setModel(dtm);
        //jTree.expandRow(1); // Expand children to illustrate leaf icons
        jTree1.setCellRenderer(new TreeCellRenderer());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuSistema = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meu Programa");

        jDesktopPane1.setBackground(javax.swing.UIManager.getDefaults().getColor("window"));

        jLabel1.setText("Olá aluno, seu último acesso foi em...");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(382, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(433, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jDesktopPane1);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(155, 275));
        jScrollPane1.setRequestFocusEnabled(false);

        jTree1.setRowHeight(24);
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        jSplitPane1.setLeftComponent(jScrollPane1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        jMenuSistema.setMnemonic('S');
        jMenuSistema.setText("Sistema");

        jMenuItemSair.setMnemonic('r');
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSistema.add(jMenuItemSair);

        jMenuBarPrincipal.add(jMenuSistema);

        jMenuCadastro.setMnemonic('C');
        jMenuCadastro.setText("Cadastro");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setText("Condôminos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem1);

        jMenuBarPrincipal.add(jMenuCadastro);

        jMenuAjuda.setMnemonic('j');
        jMenuAjuda.setText("Ajuda");

        jMenuItemSobre.setMnemonic('S');
        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBarPrincipal.add(jMenuAjuda);

        setJMenuBar(jMenuBarPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        JDialogSobre dialog = new JDialogSobre(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
        try {
            Object node = evt.getPath().getLastPathComponent();
            evt.getNewLeadSelectionPath();
            String menu = null;
            if (evt.isAddedPath()) {
                menu = node.toString();

               
                if (menu.equals(IesbBundle.getBundle("PrincipalCad.jTree.dependentes.text"))) {
                    CadDependente cadVisitantes = new CadDependente();
                    jDesktopPane1.add(cadVisitantes);
                    
                    cadVisitantes.setClosable(true);
                    cadVisitantes.setMaximum(true);
                    cadVisitantes.setVisible(true);
                }


                if (menu.equals(IesbBundle.getBundle("PrincipalCad.jTree.logout.text"))) {
                    int msg = JOptionPane.showOptionDialog(this, IesbBundle.getBundle("generic.fecharSistema.msg"), "Fechar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                    if (msg == JOptionPane.YES_OPTION) {
                        System.exit(0);
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jTree1ValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenu jMenuSistema;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}