/**
 * Write a description of class Rais here.
 * 
 * @author (Luis Felipe Gonzalez Villamizar) 
 * @version (05/06/2024)
 */
public class Rais extends RegimenPensional
{
    //Atributos
    private double saldoAcumulado;
    private double expectativaVida;
    
    //Constructor
    public Rais(double saldoAcumulado, double expectativaVida)
    {
        this.saldoAcumulado = saldoAcumulado;
        this.expectativaVida = expectativaVida;
    }
    
    
    //Start GetterSetterExtension Source Code

    /**GET Method Propertie saldoAcumulado*/
    public double getSaldoAcumulado(){
        return this.saldoAcumulado;
    }//end method getSaldoAcumulado

    /**SET Method Propertie saldoAcumulado*/
    public void setSaldoAcumulado(double saldoAcumulado){
        this.saldoAcumulado = saldoAcumulado;
    }//end method setSaldoAcumulado

    /**GET Method Propertie expectativaVida*/
    public double getExpectativaVida(){
        return this.expectativaVida;
    }//end method getExpectativaVida

    /**SET Method Propertie expectativaVida*/
    public void setExpectativaVida(double expectativaVida){
        this.expectativaVida = expectativaVida;
    }//end method setExpectativaVida

    //End GetterSetterExtension Source Code
    
    //Operaciones
    
    public void calcularPension()
    {
        
    }


}