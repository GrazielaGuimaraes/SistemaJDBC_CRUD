package sistemapet.view;

import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

   
    public TelaPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        dataAtual = new javax.swing.JLabel();
        usuarioLogado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemUsuario = new javax.swing.JMenuItem();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de cadastro ");
        setResizable(false);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(765, 475));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        dataAtual.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        dataAtual.setText("Data");

        usuarioLogado.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        usuarioLogado.setText("Usuário");

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_48px.png"))); // NOI18N
        jMenuCadastro.setToolTipText("Cadastro");

        jMenuItemUsuario.setText("Usuário");
        jMenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemUsuario);

        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCliente);

        jMenuBar1.add(jMenuCadastro);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/relatorio_48px.png"))); // NOI18N
        jMenu2.setToolTipText("Relatórios");

        jMenuItem3.setText("Clientes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help_48px.png"))); // NOI18N
        jMenu3.setToolTipText("Ajuda");

        jMenuItem2.setText("Ajuda");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair_48px.png"))); // NOI18N
        jMenu4.setToolTipText("Sair");

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dataAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(usuarioLogado)
                .addGap(29, 29, 29)
                .addComponent(dataAtual)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(902, 562));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        //Sair do sistema
        int sair = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);

        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }                                          

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        
        // Abri formulário interno de clientes
        
        TelaCliente t = new TelaCliente();
        t.setVisible(true);
        jDesktopPane1.add(t);
        
        
       
        
        
    }                                                

    private void jMenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        
         // Abri formulário interno de usuários
        
        TelaUsuario t = new TelaUsuario();
        t.setVisible(true);
        jDesktopPane1.add(t);
    }                                                

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
       
         // Abri janela de ajuda
        
        TelaAjuda a = new TelaAjuda();
       a.setVisible(true);
    }                                          

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        
        //Abrir tela de relalatório de clientes
        TelaRelatorioCliente t = new TelaRelatorioCliente();
        t.setVisible(true);
        
        
    }                                          

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public static javax.swing.JLabel dataAtual;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemCliente;
    public static javax.swing.JMenuItem jMenuItemUsuario;
    public static javax.swing.JLabel usuarioLogado;
    // End of variables declaration                   
}
