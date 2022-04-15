package sistemapet.view;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import sistemapet.controller.ClienteController;
import sistemapet.model.Cliente;
import sistemapet.model.Conexao;

public class TelaRelatorioCliente extends javax.swing.JFrame {
    
     ClienteController controler = null;
    DefaultTableModel modelo = new DefaultTableModel();

    public TelaRelatorioCliente() {
        initComponents();
        
         controler = new ClienteController();
         
        populaTabela();
    }

    
    public List<Cliente>  populaTabela(){
        
        List<Cliente> clientes = controler.listarClientes();
        
        jTableClientesRelatorio.setModel(modelo);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientesRelatorio = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisarClienteRelatorio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 51, 204));

        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("RELATÓRIO DE CLIENTES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jTableClientesRelatorio.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableClientesRelatorio);

        jLabel2.setText("Pesquisar cliente:");

        txtPesquisarClienteRelatorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarClienteRelatorioKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 51, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("IMPRIMIR RELATÓRIO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarClienteRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPesquisarClienteRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        setSize(new java.awt.Dimension(760, 432));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void txtPesquisarClienteRelatorioKeyReleased(java.awt.event.KeyEvent evt) {                                                         
       
        
        // Pesquisar cliente por nome
         
         Connection con = new Conexao().getConnection();
         
         String sql = "select * from cliente where nome like ?";
            
             try {
              
                 PreparedStatement pst = con.prepareStatement(sql);
                 pst.setString(1, "%" + txtPesquisarClienteRelatorio.getText() + "%");
                ResultSet set = pst.executeQuery();
            
            jTableClientesRelatorio.setModel(DbUtils.resultSetToTableModel(set));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não encontrado");
        }
              
        
        
    }                                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         


        //Gerar relatório de clientes
       
        gerarPdf();
        
    }                                        

    
    public void gerarPdf(){
        
         //Criar documento PDF com todos os clientes do banco
         
        Connection con = new Conexao().getConnection();
        
        List<Cliente> clientes = controler.listarClientes();
      
        Document doc = new Document();
        String relatorio = "relatorio.pdf";
        
        try {
            
            PdfWriter.getInstance(doc, new FileOutputStream(relatorio));
            
            doc.open();
           
            
            Paragraph p = new Paragraph("Relatório de Clientes");
            p.setAlignment(1);
            p.setSpacingAfter(30);
            doc.add(p);
            
            p = new Paragraph("");
            doc.add(p);
            
           
            
            PdfPTable tabela = new PdfPTable(5);
            
           
           
            tabela.setWidthPercentage(100);
            
           
            
            PdfPCell cel1 = new PdfPCell(new Paragraph("ID"));
            cel1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            
            PdfPCell cel2 = new PdfPCell(new Paragraph("Nome"));
            cel2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            
            PdfPCell cel3 = new PdfPCell(new Paragraph("Telefone"));
            cel3.setBackgroundColor(BaseColor.LIGHT_GRAY);
            
            PdfPCell cel4 = new PdfPCell(new Paragraph("Endereço"));
            cel4.setBackgroundColor(BaseColor.LIGHT_GRAY);
            
            PdfPCell cel5 = new PdfPCell(new Paragraph("Data de cadastro"));
            cel5.setBackgroundColor(BaseColor.LIGHT_GRAY);
            
            tabela.addCell(cel1);
            tabela.addCell(cel2);
            tabela.addCell(cel3);
            tabela.addCell(cel4);
            tabela.addCell(cel5);
            
           
            
            
            for (Cliente c : clientes) {
                
                
            cel1 = new PdfPCell(new Paragraph(c.getId() + ""));
            cel2 = new PdfPCell(new Paragraph(c.getNome()));
            cel3 = new PdfPCell(new Paragraph(c.getTelefone()));
            cel4 = new PdfPCell(new Paragraph(c.getEndereco()));
            cel5 = new PdfPCell(new Paragraph(c.getDataCadastro().toString()));
            
            tabela.addCell(cel1);
            tabela.addCell(cel2);
            tabela.addCell(cel3);
            tabela.addCell(cel4);
            tabela.addCell(cel5);
            
                
            }
            
            doc.add(tabela);
            doc.close();
            
            Desktop.getDesktop().open(new File(relatorio));
            
        } catch (DocumentException | IOException e) {
            
            System.out.println("Erro ao gerar PDF: " + e);
        }
        
    }
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorioCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientesRelatorio;
    private javax.swing.JTextField txtPesquisarClienteRelatorio;
    // End of variables declaration                   
}
