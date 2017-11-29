/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

/**
 *
 * @author Gildo
 */
public interface Dados {
/**
* Adiciona um transporte na base de dados
* @param t
* @throws Exception Se o id já estiver cadastrado
*/
public void adicionar(Transporte t) throws Exception;

/**
* Exclui um transporte da base
* @param t
* @throws Exception se não encontrar o registro
*/
public void excluir(Transporte t);

}
