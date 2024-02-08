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
/**
 *
 * @author gbarrosn
 */
public class DAO {
    // Connect to the database using ConectarSQL
    
    // Retrieve a list of ramais from the table Lista_de_ramais
    public List<Ramal> getRamais() throws ClassNotFoundException {
        List<Ramal> ramais = new ArrayList<>();
        
        // SQL query to retrieve ramais from the table
        String query = "SELECT ramal, nome, unidade, andar FROM Lista_de_ramais";
        
        ConectarSQL conectarSQL = new ConectarSQL();
        try (Connection connection = conectarSQL.conectarPrepared();
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery()) {
            
            // Iterate through the result set and populate Ramal objects
            while (resultSet.next()) {
                String ramal = resultSet.getString("ramal");
                String nome = resultSet.getString("nome");
                String unidade = resultSet.getString("unidade");
                String andar = resultSet.getString("andar");
                
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
    
}
