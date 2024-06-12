/**
 * Write a description of class Rpm here.
 * 
 * @author (Luis Felipe Gonzalez Villamizar) 
 * @version (05/06/2024)
 */
public class Rpm extends RegimenPensional
{
    //Atributos
    private double IBL;
    private double P;
    private double semanasCotizadas;
    
    //Constructor
    public Rpm(double IBL, double P)
    {
        this.IBL = IBL;
        this.P = P;
        this.semanasCotizadas = semanasCotizadas;
    }
    
    //Start GetterSetterExtension Source Code

    /**GET Method Propertie IBL*/
    public double getIBL(){
        return this.IBL;
    }//end method getIBL

    /**SET Method Propertie IBL*/
    public void setIBL(double IBL){
        this.IBL = IBL;
    }//end method setIBL

    /**GET Method Propertie P*/
    public double getP(){
        return this.P;
    }//end method getP

    /**SET Method Propertie P*/
    public void setP(double P){
        this.P = P;
    }//end method setP

    /**GET Method Propertie semanasCotizadas*/
    public double getSemanasCotizadas(){
        return this.semanasCotizadas;
    }//end method getSemanasCotizadas

    /**SET Method Propertie semanasCotizadas*/
    public void setSemanasCotizadas(double semanasCotizadas){
        this.semanasCotizadas = semanasCotizadas;
    }//end method setSemanasCotizadas

    //End GetterSetterExtension Source Code
    
    //Operaciones
    
    public void calcularPension()
    {
        if(semanasCotizadas == 1300)
        {
            
        }
    }


}