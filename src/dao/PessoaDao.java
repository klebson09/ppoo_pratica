/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Pessoa;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author silva
 */
public class PessoaDao {
    public void salvar(Pessoa p){
    String sql = "INSERT INTO Pessoa (nome, email, cpf, ddd, fone) values (?,?,?,?,?)";
    
        try {
            PreparedStatement ps = Conector.getConexao().prepareStatement(sql); //(recebe do java.mysql)
            
            ps.setString(1, p.getNome());
            ps.setString(2, p.getEmail());
            ps.setString(3, p.getCpf());
            ps.setString(4, p.getDdd());
            ps.setString(5, p.getFone());
            
            ps.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
