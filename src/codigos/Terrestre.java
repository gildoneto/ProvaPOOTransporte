/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

public class Terrestre extends Transporte{
  
    private Integer qtde_rodas;
    private Double potencia;
    
    public Terrestre(){
    }
    
    public Terrestre(Integer id, Integer ano, String modelo, Double carga_maxima, Integer qtde_rodas, Double potencia){
        super(id, ano, modelo, carga_maxima);
        this.qtde_rodas=qtde_rodas;
        this.potencia=potencia;
    }
    
    public Integer getQtde_rodas() {
        return qtde_rodas;
    }

    public void setQtde_rodas(Integer qtde_rodas) {
        this.qtde_rodas = qtde_rodas;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }
    
    @Override
    public Double consumo() {
        return ((this.potencia)*(getCarga_maxima())*100);
    }
    
    
}
