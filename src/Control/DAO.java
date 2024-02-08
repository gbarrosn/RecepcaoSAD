/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import View.LoginUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.Ramal;
import Model.Unidade;
import Model.Pavimento;
/**
 *
 * @author gbarrosn
 */
public class DAO {
    // Connect to the database using ConectarSQL
    
    // Retrieve a list of ramais from the table Lista_de_ramais
    public static List<Ramal> getRamais() throws ClassNotFoundException {
        List<Ramal> ramais = new ArrayList<>();
        
        // SQL query to retrieve ramais from the table
        String query = "SELECT * \n" + //
                "FROM Lista_de_ramais ldr\n" + //
                "INNER JOIN Pavimento p ON ldr.id_andar = p.id_pavimento\n" + //
                "INNER JOIN Unidade u ON ldr.id_unidade  = u.id_unidade ;";
        
        ConectarSQL conectarSQL = new ConectarSQL();
        try (Connection connection = conectarSQL.conectarPrepared();
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery()) {
            
            // Iterate through the result set and populate Ramal objects
            while (resultSet.next()) {
                String ramal = resultSet.getString("ramal");
                String nome = resultSet.getString("nome");
                String unidade = resultSet.getString("unidade");
                String andar = resultSet.getString("pavimento");
                
                Ramal ramalObj = new Ramal();
                ramalObj.setGerencia(unidade);
                ramalObj.setNome(nome);
                ramalObj.setPavimento(andar);
                ramalObj.setRamal(ramal);
                ramais.add(ramalObj);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return ramais;
    }
    
    // Retrieve a list of pavimentos from the table Pavimento
    public static List<Pavimento> getPavimentos() throws ClassNotFoundException {
        List<Pavimento> pavimentos = new ArrayList<>();
        
        // SQL query to retrieve pavimentos from the table
        String query = "SELECT * FROM Pavimento;";
        
        ConectarSQL conectarSQL = new ConectarSQL();
        try (Connection connection = conectarSQL.conectarPrepared();
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery()) {
            
            // Iterate through the result set and populate Pavimento objects
            while (resultSet.next()) {
                int idPavimento = resultSet.getInt("id_pavimento");
                String pavimento = resultSet.getString("pavimento");
                
                Pavimento pavimentoObj = new Pavimento();
                pavimentoObj.setIdPavimento(idPavimento);
                pavimentoObj.setPavimento(pavimento);
                pavimentos.add(pavimentoObj);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return pavimentos;
    }
    
    

// Retrieve a list of unidades from the table Unidade
public static List<Unidade> getUnidades() throws ClassNotFoundException {
    List<Unidade> unidades = new ArrayList<>();
    
    // SQL query to retrieve unidades from the table
    String query = "SELECT * FROM Unidade;";
    
    ConectarSQL conectarSQL = new ConectarSQL();
    try (Connection connection = conectarSQL.conectarPrepared();
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery()) {
        
        // Iterate through the result set and populate Unidade objects
        while (resultSet.next()) {
            int idUnidade = resultSet.getInt("id_unidade");
            String unidade = resultSet.getString("unidade");
            
            Unidade unidadeObj = new Unidade();
            unidadeObj.setIdUnidade(idUnidade);
            unidadeObj.setUnidade(unidade);
            unidades.add(unidadeObj);
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return unidades;
}
