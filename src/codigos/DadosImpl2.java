/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import java.util.ArrayList;

/**
 *
 * @author Gildo
 */
public class DadosImpl2 implements Dados2{

    ArrayList<Transporte> transporteList = new ArrayList();
    
    @Override
    public void adicionar(Transporte t) throws Exception {
        if (t.getId() == transporteList.indexOf(t.getId())){
            Exception a = null;
            throw a;
        }
        transporteList.add(t);
    }

    @Override
    public void excluir(Transporte t) {
        
    }
    
}
