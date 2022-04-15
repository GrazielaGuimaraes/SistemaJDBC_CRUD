package sistemapet.view;


import java.sql.Connection;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import sistemapet.controller.UsuarioController;
import sistemapet.model.Conexao;
import sistemapet.model.Usuario;

public class TelaLogin extends javax.swing.JFrame {

   
    public TelaLogin() {
        initComponents();
        
        Connection con = new Conexao().getConnection();
        if(con!=null){
            txtConexao.setText("");
        }else{
            txtConexao.setText("Servidor offline.");
            txtLogin.setEnabled(false);
            txtSenha.setEnabled(false);
            jButton1.setEnabled(false);
            
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        txtConexao = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso ao sistema");
        setBackground(new java.awt.Color(0, 153, 153));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login_24px.png"))); // NOI18N

        txtLogin.setToolTipText("Usuário de acesso");
        txtLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/senha_24px.png"))); // NOI18N

        txtSenha.setToolTipText("Senha de acesso");
        txtSenha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setBackground(new java.awt.Color(0, 51, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Acessar");
        jButton1.setToolTipText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtConexao.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtConexao.setForeground(new java.awt.Color(153, 0, 0));
        txtConexao.setText("Conexão");

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sair");
        jButton2.setToolTipText("Fechar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Login de acesso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtLogin)
                    .addComponent(txtSenha)
                    .addComponent(txtConexao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(jLabel3))))
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConexao)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(283, 310));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        
        //Logar usuário
        
        if(txtLogin.getText().isEmpty() || txtSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha os campos");
            
        }else{
        
        UsuarioController c = new UsuarioController();
        
        Usuario u = new Usuario();
        
        //Retorna um usuário através do login e senha vindos do banco
       u =  c.login(txtLogin.getText(), txtSenha.getText());
        
       
       // Se existir um usuário
        if(u!=null){
            
           LocalDate data =  LocalDate.now();
           int dia = data.getDayOfMonth();
           int mes = data.getMonthValue();
           int ano = data.getYear();
           
           String dataConcatenada = dia + "/" + mes + "/" + ano;
           
            
           if(u.getLogin().equalsIgnoreCase("admin")){
               
               TelaPrincipal tela = new TelaPrincipal();
               TelaPrincipal.usuarioLogado.setText(u.getNome());
               TelaPrincipal.dataAtual.setText(dataConcatenada);
               
               tela.setVisible(true);
               this.dispose();
               
           } else {
               
               TelaPrincipal tela = new TelaPrincipal();
               tela.jMenuItemUsuario.setEnabled(false);
               TelaPrincipal.usuarioLogado.setText(u.getNome());
               TelaPrincipal.dataAtual.setText(dataConcatenada);
               tela.setVisible(true);
               this.dispose();
               
               
           }
            
            
            
            
            
           
        }else{
            JOptionPane.showMessageDialog(null, "Login ou senha inválidos");
        }
        
        
        
        
        } // fim else
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        //Fechar tela de login
        System.exit(0);
        
    }                                        
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel txtConexao;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration                   
}
