/**
 * Abstract class RegimenPensional - write a description of the class here
 * 
 * @author: Luis Felipe Gonzalez Villamizar
 * Date: 05/06/2024
 */
public abstract class RegimenPensional
{
    private RegimenPensional Rpm;
    private RegimenPensional Rais;
    
    public RegimenPensional()
    {
        
    }

    //Start GetterSetterExtension Source Code

    /**GET Method Propertie Rpm*/
    public RegimenPensional getRpm(){
        return this.Rpm;
    }//end method getRpm

    /**SET Method Propertie Rpm*/
    public void setRpm(RegimenPensional Rpm){
        this.Rpm = Rpm;
    }//end method setRpm

    /**GET Method Propertie Rais*/
    public RegimenPensional getRais(){
        return this.Rais;
    }//end method getRais

    /**SET Method Propertie Rais*/
    public void setRais(RegimenPensional Rais){
        this.Rais = Rais;
    }//end method setRais

    //End GetterSetterExtension Source Code


}