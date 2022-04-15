package sistemapet.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import sistemapet.controller.UsuarioController;
import sistemapet.model.Conexao;
import sistemapet.model.Usuario;

public class TelaUsuario extends javax.swing.JInternalFrame {

    UsuarioController controler = null;
    DefaultTableModel modelo = new DefaultTableModel();
    Usuario loginExistente = null;
    Usuario user  = null;
    Usuario cli = null;
    
    public TelaUsuario() {
        initComponents();
        
        
         
         controler = new UsuarioController();
         
         
         populaTabela();
         
    }

    
    
    
     public List<Usuario>  populaTabela(){
        
        List<Usuario> usuarios = controler.listarUsuarios();
        
        jTableUsuarios.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("Telefone");
        modelo.addColumn("Endereço");
        modelo.addColumn("Login");
        modelo.addColumn("Senha");
        
        
        for(Usuario c: usuarios){
            
         modelo.addRow(new Object[]{
         
         
         c.getId(),
             c.getNome(),
             c.getTelefone(),
             c.getEndereco(),
             c.getLogin(),
             c.getSenha()
         
         });
            
        }
       
        
        
        return usuarios;
        
        
    }
     
     
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeUsu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTelefoneUsu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEnderecoUsu = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtLoginUsu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSenhaUsu = new javax.swing.JPasswordField();
        jLabelIdUsuario = new javax.swing.JLabel();
        jLabelMensagem = new javax.swing.JLabel();
        jLabelloginexistente = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelIdCliente = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        txtPesquisarUsuarios = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuário");
        setPreferredSize(new java.awt.Dimension(765, 504));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome");

        jLabel2.setText("Telefone");

        jLabel3.setText("Endereço");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar_32px.png"))); // NOI18N
        jButton1.setToolTipText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Login");

        txtLoginUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLoginUsuKeyReleased(evt);
            }
        });

        jLabel6.setText("Senha");

        jLabelloginexistente.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtLoginUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSenhaUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(78, 78, 78)))
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeUsu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefoneUsu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEnderecoUsu, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(32, 32, 32)
                        .addComponent(jLabelIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelloginexistente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelIdUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19)))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefoneUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnderecoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLoginUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtSenhaUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelloginexistente, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addComponent(jLabelMensagem)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, 250));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar_32px_1.png"))); // NOI18N
        jButton2.setToolTipText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/remover_32px.png"))); // NOI18N
        jButton3.setToolTipText("Remover");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpar_32px.png"))); // NOI18N
        jButton4.setToolTipText("Limpar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(0, 49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 12, -1, -1));

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jTableUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableUsuariosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuarios);

        txtPesquisarUsuarios.setToolTipText("Digite o nome para pesquisa");
        txtPesquisarUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarUsuariosKeyReleased(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar_32px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtPesquisarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(txtPesquisarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 272, -1, -1));

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        // Salvar usuário
        
        
        if(txtNomeUsu.getText().isEmpty() || txtTelefoneUsu.getText().isEmpty() || txtEnderecoUsu.getText().isEmpty() || txtLoginUsu.getText().isEmpty() || txtSenhaUsu.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios *");
        }
         
          else{
                        
           
                Usuario u = new Usuario();
                
                u.setNome(txtNomeUsu.getText());
                u.setTelefone(txtTelefoneUsu.getText());
                u.setEndereco(txtEnderecoUsu.getText());
                u.setLogin(txtLoginUsu.getText());
                u.setSenha(txtSenhaUsu.getText());
                
                
                
                int salvar = JOptionPane.showConfirmDialog(null, "Deseja salvar usuário?","Atenção", JOptionPane.YES_NO_OPTION);
               
                
                if(salvar == JOptionPane.YES_OPTION){
                    controler.salvar(u);
                     JOptionPane.showMessageDialog(null, "Salvo com sucesso");
                     limpar();
                }
                    
                    
                    
                    
              
             
        }
        
    

    }                                        

    
    
    
    
    
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        //Editar registro

        if(jTableUsuarios.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um regitro na tabela");
        }else{

            int editar = JOptionPane.showConfirmDialog(null, "Deseja editar registro?","Atenção",JOptionPane.YES_NO_OPTION);

            if(editar == JOptionPane.YES_OPTION){

                Usuario usuario = new Usuario();
                usuario.setNome(txtNomeUsu.getText());
                usuario.setTelefone(txtTelefoneUsu.getText());
                usuario.setEndereco(txtEnderecoUsu.getText());
                usuario.setLogin(txtLoginUsu.getText());
                usuario.setSenha(txtSenhaUsu.getText());
                usuario.setId(Long.parseLong(jLabelIdUsuario.getText()));

                controler.editar(usuario);
                JOptionPane.showMessageDialog(null, "Editado com sucesso");

                populaTabela();
                limpar();

            }

        }

    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        // Remover registro

        if(jTableUsuarios.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um regitro na tabela");
        }else{

            int remover = JOptionPane.showConfirmDialog(null, "Deseja remover registro?","Atenção",JOptionPane.YES_NO_OPTION);

            if(remover == JOptionPane.YES_OPTION){
                controler.remover((jLabelIdUsuario.getText()));
                JOptionPane.showMessageDialog(null, "Removido com sucesso");

                populaTabela();
                limpar();
            }

        }

    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        limpar();
    }                                        

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // Ao clicar em um registro da tabela

        if(jTableUsuarios.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um regitro na tabela");
        }else{

            jLabelIdUsuario.setText(jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 0).toString());
            txtNomeUsu.setText(jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 1).toString());
            txtTelefoneUsu.setText(jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 2).toString());
            txtEnderecoUsu.setText(jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 3).toString());
            txtLoginUsu.setText(jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 4).toString());
            txtSenhaUsu.setText(jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 5).toString());

        }

    }                                           

    private void jTableUsuariosKeyReleased(java.awt.event.KeyEvent evt) {                                           

        
        if(jTableUsuarios.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um regitro na tabela");
        }else{

            jLabelIdUsuario.setText(jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 0).toString());
            txtNomeUsu.setText(jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 1).toString());
            txtTelefoneUsu.setText(jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 2).toString());
            txtEnderecoUsu.setText(jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 3).toString());
            txtLoginUsu.setText(jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 4).toString());
            txtSenhaUsu.setText(jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 5).toString());
            
        }
    }                                          

    private void txtPesquisarUsuariosKeyReleased(java.awt.event.KeyEvent evt) {                                                 

        // Pesquisar usuário por nome

        Connection con = new Conexao().getConnection();

        String sql = "select * from usuario where nome like ?";

        try {

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "%" + txtPesquisarUsuarios.getText() + "%");
            ResultSet set = pst.executeQuery();

            jTableUsuarios.setModel(DbUtils.resultSetToTableModel(set));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não encontrado");
        }

    }                                                

    
        
        
    
    
    private void txtLoginUsuKeyReleased(java.awt.event.KeyEvent evt) {                                        
    }                                       

    
    public void limpar(){
        txtNomeUsu.setText("");
        txtTelefoneUsu.setText("");
        txtEnderecoUsu.setText("");
        txtLoginUsu.setText("");
        txtSenhaUsu.setText("");
        jLabelIdUsuario.setText("");
        txtPesquisarUsuarios.setText("");
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelIdCliente;
    private javax.swing.JLabel jLabelIdUsuario;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JLabel jLabelloginexistente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField txtEnderecoUsu;
    private javax.swing.JTextField txtLoginUsu;
    private javax.swing.JTextField txtNomeUsu;
    private javax.swing.JTextField txtPesquisarUsuarios;
    private javax.swing.JPasswordField txtSenhaUsu;
    private javax.swing.JTextField txtTelefoneUsu;
    // End of variables declaration                   
}
