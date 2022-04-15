 package sistemapet.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistemapet.model.Conexao;
import sistemapet.model.Usuario;


public class UsuarioController {
    
     Connection con = null;

    public UsuarioController() {
        this.con = new Conexao().getConnection();
    }
    
    
    
    public void salvar(Usuario u){
        
        try {
            
            
            
            String sql = "insert into usuario(nome, telefone, endereco, login, senha) values"
                    + " (?,?,?,?,?)";
            //Connection con = new Conexao().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, u.getNome());
            pst.setString(2, u.getTelefone());
            pst.setString(3, u.getEndereco());
            pst.setString(4, u.getLogin());
            pst.setString(5, u.getSenha());
            
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
    
    public void remover(String id){
        
         String sql = "delete from usuario where id = ?";
          //  Connection con = new Conexao().getConnection();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, id);
            pst.executeUpdate();
            
            
        } catch (SQLException ex) {
            System.out.println("Erro ao remover: " + ex);
        }
        
    }
    
     public void editar(Usuario u){
        
         String sql = "update usuario set nome = ?, telefone = ?, endereco = ?, login = ?, senha = ? where id = ?";
           // Connection con = new Conexao().getConnection();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, u.getNome());
            pst.setString(2, u.getTelefone());
            pst.setString(3, u.getEndereco());
            pst.setString(4, u.getLogin());
            pst.setString(5, u.getSenha());
            pst.setLong(6, u.getId());
            
            pst.executeUpdate();
            
            
        } catch (SQLException ex) {
            System.out.println("Erro ao editar: " + ex);
        }
     }
     
     public List<Usuario> listarUsuarios(){
         
         List<Usuario> lista = new ArrayList<>();
         
          String sql = "select * from usuario";
           // Connection con = new Conexao().getConnection();
            try {
             PreparedStatement pst = con.prepareStatement(sql);
                ResultSet set = pst.executeQuery();
                
                while(set.next()){
                    
                    Usuario user = new Usuario();
                    
                    user.setId(set.getLong("id"));
                    user.setNome(set.getString("nome"));
                    user.setTelefone(set.getString("telefone"));
                    user.setEndereco(set.getString("endereco"));
                    user.setLogin(set.getString("login"));
                    user.setSenha(set.getString("senha"));
                    
                    lista.add(user);
                }
             
             
         } catch (SQLException e) {
             System.out.println("Erro ao listar usuários: " + e);
         }
         return lista;
         
     }
     
     
     public Usuario login(String login, String senha){
         
         Usuario user  = null;
         
         String sql = "select * from usuario where login = ? and senha = ?";
           // Connection con = new Conexao().getConnection();
            try {
             PreparedStatement pst = con.prepareStatement(sql);
             pst.setString(1, login);
             pst.setString(2, senha);
                ResultSet set = pst.executeQuery();
                
                while(set.next()){
                    
                   user = new Usuario();
                    
                    user.setId(set.getLong("id"));
                    user.setNome(set.getString("nome"));
                    user.setTelefone(set.getString("telefone"));
                    user.setEndereco(set.getString("endereco"));
                    user.setLogin(set.getString("login"));
                    user.setSenha(set.getString("senha"));
                    
                    
                }
             
             
         } catch (SQLException e) {
             System.out.println("Erro ao fazer login: " + e);
         }
         return user;
         
     
         
         
         
         
     }
     
     
     public Usuario verificaLoginExistente(String login){
         
         
        Usuario  user = new Usuario();
         
         String sql = "select * from usuario where login = ?";
           // Connection con = new Conexao().getConnection();
            try {
             PreparedStatement pst = con.prepareStatement(sql);
             pst.setString(1, login);
                ResultSet set = pst.executeQuery();
                
               
                   user.setLogin(set.getString("login"));
                   System.out.println("Encontrado");
                    
                
             
             
         } catch (SQLException e) {
             System.out.println("Erro ao encontrar login: " + e);
         } 
    
         return user;
         
     
     }
     
        
     
     
    
}
