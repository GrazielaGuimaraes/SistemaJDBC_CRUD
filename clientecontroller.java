package sistemapet.controller;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistemapet.model.Cliente;
import sistemapet.model.Conexao;
import sistemapet.model.Usuario;


public class ClienteController {
    
     Connection con = null;

    public ClienteController() {
        this.con = new Conexao().getConnection();
    }
    
    
    
    public void salvar(Cliente u){
        
        try {
            
            
            
            String sql = "insert into cliente(nome, telefone, endereco) values"
                    + " (?,?,?)";
            //Connection con = new Conexao().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, u.getNome());
            pst.setString(2, u.getTelefone());
            pst.setString(3, u.getEndereco());
            
            
            pst.execute();
            
            /*System.out.println("Nome: " + u.getNome());
            System.out.println("Telefone: " + u.getTelefone());
            System.out.println("Endereço: " + u.getEndereco());
            System.out.println("Login: " + u.getLogin());
            System.out.println("Senha: " + u.getSenha());*/
            
            
        } catch (SQLException ex) {
            System.out.println(("Erro ao salvar: " + ex));
        }
        
    }
    
    public void remover(Long id){
        
         String sql = "delete from cliente where id = ?";
          //  Connection con = new Conexao().getConnection();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setLong(1, id);
            pst.executeUpdate();
            
            
        } catch (SQLException ex) {
            System.out.println("Erro ao remover: " + ex);
        }
        
    }
    
     public void editar(Cliente u){
        
         String sql = "update Cliente set nome = ?, telefone = ?, endereco = ? where id = ?";
           // Connection con = new Conexao().getConnection();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, u.getNome());
            pst.setString(2, u.getTelefone());
            pst.setString(3, u.getEndereco());
            pst.setLong(4, u.getId());
            
            pst.executeUpdate();
            
            
        } catch (SQLException ex) {
            System.out.println("Erro ao editar: " + ex);
        }
     }
     
     public List<Cliente> listarClientes(){
         
         List<Cliente> lista = new ArrayList<>();
         
          String sql = "select * from cliente order by nome ASC";
           // Connection con = new Conexao().getConnection();
            try {
             PreparedStatement pst = con.prepareStatement(sql);
                ResultSet set = pst.executeQuery();
                
                while(set.next()){
                    
                    Cliente user = new Cliente();
                    
                    user.setId(set.getLong("id"));
                    user.setNome(set.getString("nome"));
                    user.setTelefone(set.getString("telefone"));
                    user.setEndereco(set.getString("endereco"));
                    user.setDataCadastro(set.getDate("data_cadastro"));
                   
                    
                    lista.add(user);
                }
             
             
         } catch (SQLException e) {
             System.out.println("Erro ao listar clientes: " + e);
         }
         return lista;
         
     }
     
     
     /*public List<Cliente> buscarClientePorNome(String nome){
         
        
         
     }*/
     
     
     
    
}
