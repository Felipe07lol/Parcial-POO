import java.util.*;

/**
 * Write a description of class SistemaPensional here.
 * 
 * @author (Luis Felipe Gonzalez Villamizar) 
 * @version (05/06/2024)
 */

public class SistemaPensional
{
    private Trabajador salario;
    private RegimenPensional Rpm;
    private RegimenPensional Rais;
    
        
    public double calculoAportes()
    {   
        double salario = (1300000*16)/100;
        
        return salario;
    }
    
    public void afiliacion()
    {
        ArrayList<Trabajador> listaDeAfiliados = new ArrayList<>();

        
        listaDeAfiliados.add(new Trabajador());
        listaDeAfiliados.add(new Trabajador());
        listaDeAfiliados.add(new Trabajador());

        
        for (Trabajador trabajador : listaDeAfiliados) {
            System.out.println(trabajador);
        }
    }
}
    

