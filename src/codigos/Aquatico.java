/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

public class Aquatico extends Transporte{
  
    private Integer qtde_motor;
    private Double peso;
    
    public Aquatico(){
    }
    
    public Aquatico(Integer id, Integer ano, String modelo, Double carga_maxima, Integer qtde_rodas, Double potencia){
        super(id, ano, modelo, carga_maxima);
        this.qtde_motor=qtde_rodas;
        this.peso=potencia;
    }
    
    public Integer getQtde_motor() {
        return qtde_motor;
    }

    public void setQtde_motor(Integer qtde_motor) {
        this.qtde_motor = qtde_motor;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    @Override
    public Double consumo() {
            return ((getCarga_maxima())*(this.peso/3)*(this.qtde_motor)*250);
    }
    
    
}
