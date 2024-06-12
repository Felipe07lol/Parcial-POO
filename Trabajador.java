/**
 * Write a description of class Trabajador here.
 * 
 * @author (Luis Felipe Gonzalez Villamizar) 
 * @version (05/06/2024)
 */
public class Trabajador extends Persona
{
    //Atributos
    private double salario;
    private RegimenPensional regimenpensional;
    
    //Constructor vacio
    public Trabajador()
    {
        
    }
    
    //Constructor
    public Trabajador(String nombre, String identificacion, String trabajador, double salario)
    {
        super(nombre, identificacion, trabajador);
        this.salario = salario;
    }
    
    
    //Start GetterSetterExtension Source Code

    /**GET Method Propertie salario*/
    public double getSalario(){
        return this.salario;
    }//end method getSalario

    /**SET Method Propertie salario*/
    public void setSalario(double salario){
        this.salario = salario;
    }//end method setSalario

    /**GET Method Propertie regimenpensional*/
    public RegimenPensional getRegimenpensional(){
        return this.regimenpensional;
    }//end method getRegimenpensional

    /**SET Method Propertie regimenpensional*/
    public void setRegimenpensional(RegimenPensional regimenpensional){
        this.regimenpensional = regimenpensional;
    }//end method setRegimenpensional

    //End GetterSetterExtension Source Code


}