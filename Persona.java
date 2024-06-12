/**
 * Write a description of class Persona here.
 * 
 * @author (Luis Felipe Gonzalez Villamizar) 
 * @version (05/06/2024)
 */
public class Persona
{
    //Atributos
    private String nombre;
    private String identificacion;
    private String trabajador;
    
    //Constructor vacio
    public Persona()
    {
        
    }
    //Constructor
    public Persona(String nombre, String identificacion, String trabajador)
    {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.trabajador = trabajador;
    }

    //Start GetterSetterExtension Source Code

    /**GET Method Propertie nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**SET Method Propertie nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**GET Method Propertie identificacion*/
    public String getIdentificacion(){
        return this.identificacion;
    }//end method getIdentificacion

    /**SET Method Propertie identificacion*/
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }//end method setIdentificacion

    /**GET Method Propertie trabajador*/
    public String getTrabajador(){
        return this.trabajador;
    }//end method getTrabajador

    /**SET Method Propertie trabajador*/
    public void setTrabajador(String trabajador){
        this.trabajador = trabajador;
    }//end method setTrabajador

    //End GetterSetterExtension Source Code


}