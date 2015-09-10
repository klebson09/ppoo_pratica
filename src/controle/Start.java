/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.Pessoa;
import dao.PessoaDao;

/**
 *
 * @author silva
 */
public class Start {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("klebson");
        p.setDdd("81");
        p.setEmail("klebson@email.com");
        p.setCpf("12345678910");
        p.setFone("12345-6789");
        
        PessoaDao pd = new PessoaDao();
        
        pd.salvar(p);
        System.out.println("Pessoa inserida com sucesso!");                
                
    }
    
}
