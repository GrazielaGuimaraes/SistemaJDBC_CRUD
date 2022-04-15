package sistemapet.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemapet.controller.ClienteController;
import sistemapet.model.Cliente;
import net.proteanit.sql.DbUtils;
import sistemapet.model.Conexao;

public class TelaCliente extends javax.swing.JInternalFrame {

    ClienteController controler = null;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public TelaCliente() {
        initComponents();
        
        
       
         controler = new ClienteController();
         
         
         populaTabela();
         
        
        
    }
    
    
    public List<Cliente>  populaTabela(){
        
        List<Cliente> clientes = controler.listarClientes();
        
        jTableClientes.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("Telefone");
        modelo.addColumn("Endereço");
        modelo.addColumn("Data_Cadastro");
        
        
        for(Cliente c: clientes){
            
         modelo.addRow(new Object[]{
         
         
         c.getId(),
             c.getNome(),
             c.getTelefone(),
             c.getEndereco(),
             c.getDataCadastro()
         
         });
            
        }
       
        
        
        return clientes;
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabelIdCliente = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cliente");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtEndereco)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jTableClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableClientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar_32px.png"))); // NOI18N

        txtPesquisar.setToolTipText("Digite o nome para pesquisa");
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

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
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        
        limpar();
    }                                        

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // Ao clicar em um registro da tabela
        
        if(jTableClientes.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um regitro na tabela");
        }else{
            
            
            jLabelIdCliente.setText(jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 0).toString());
            txtNome.setText(jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 1).toString());
            txtTelefone.setText(jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 2).toString());
            txtEndereco.setText(jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 3).toString());
            
            
            
            
            
            
            
            
        }
        
        
    }                                           

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        // Remover registro
        
          if(jTableClientes.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um regitro na tabela");
        }else{
              
             
            int remover = JOptionPane.showConfirmDialog(null, "Deseja remover registro?","Atenção",JOptionPane.YES_NO_OPTION);
            
             if(remover == JOptionPane.YES_OPTION){
                 controler.remover(Long.parseLong(jLabelIdCliente.getText()));
                 JOptionPane.showMessageDialog(null, "Removido com sucesso");
                 
                 populaTabela();
                 limpar();
             }
             
             
             
             
            
              
              
              
          }
        
        
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //Editar registro
        
        
          if(jTableClientes.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um regitro na tabela");
        }else{
              
             
            int editar = JOptionPane.showConfirmDialog(null, "Deseja editar registro?","Atenção",JOptionPane.YES_NO_OPTION);
            
             if(editar == JOptionPane.YES_OPTION){
                 
                 Cliente cli = new Cliente();
                 cli.setNome(txtNome.getText());
                 cli.setTelefone(txtTelefone.getText());
                 cli.setEndereco(txtEndereco.getText());
                 cli.setId(Long.parseLong(jLabelIdCliente.getText()));
                 
                  controler.editar(cli);
                 JOptionPane.showMessageDialog(null, "Editado com sucesso");
                 
                 populaTabela();
                 limpar();
                 
             }
                
             }
        
        
    }                                        

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {                                         
        
         // Pesquisar cliente por nome
         
         Connection con = new Conexao().getConnection();
         
         String sql = "select * from cliente where nome like ?";
            
             try {
              
                 PreparedStatement pst = con.prepareStatement(sql);
                 pst.setString(1, "%" + txtPesquisar.getText() + "%");
                ResultSet set = pst.executeQuery();
            
            jTableClientes.setModel(DbUtils.resultSetToTableModel(set));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não encontrado");
        }
              
        
       
         
       
       
        
    }                                        

    private void jTableClientesKeyReleased(java.awt.event.KeyEvent evt) {                                           
        
        
         
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        
        // Salvar cliente
        
          if(txtNome.getText().isEmpty() || txtTelefone.getText().isEmpty() || txtEndereco.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios *");
        }else{
              
             
            int salvar = JOptionPane.showConfirmDialog(null, "Deseja Salvar registro?","Informação",JOptionPane.YES_NO_OPTION);
            
             if(salvar == JOptionPane.YES_OPTION){
                 
                 Cliente cli = new Cliente();
                 cli.setNome(txtNome.getText());
                 cli.setTelefone(txtTelefone.getText());
                 cli.setEndereco(txtEndereco.getText());
                 
                 
                  controler.salvar(cli);
                 JOptionPane.showMessageDialog(null, "Salvo com sucesso");
                 
                 populaTabela();
                 limpar();
                 
             }
             
         }
        
        
        
        
    }                                        

    public void limpar(){
        txtNome.setText("");
        txtTelefone.setText("");
        txtEndereco.setText("");
        jLabelIdCliente.setText("");
        txtPesquisar.setText("");
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
    private javax.swing.JLabel jLabelIdCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration                   
}
