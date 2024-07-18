
/**
 * Write a description of class ControlVisitas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlVisitas
{
     //
    public String nombre, apellidoPaterno, apellidoMaterno, cargo, horaIngreso, horaSalida;
    public int idVisita, ci;
    
    public ControlVisitas ()
    {
        this.idVisita= 0;
        this.nombre= "";
        this.apellidoPaterno= "";
        this.apellidoMaterno= "";
        this.ci= 0;
        this.cargo= "";
        this.horaIngreso= "";
        this.horaSalida= "";
        
    }
    //
    public ControlVisitas (int idVisita, String nombre, String apellidoPaterno, String apellidoMaterno ,int ci, String cargo, String horaIngreso, String horaSalida)
    {
        this.idVisita= idVisita;
        this.nombre= nombre;
        this.apellidoPaterno= apellidoPaterno;
        this.apellidoMaterno= apellidoMaterno;
        this.ci= ci;
        this.cargo= cargo;
        this.horaIngreso= horaIngreso;
        this.horaSalida= horaSalida;
        
    }
    //
    public ControlVisitas (int idVisita, int ci, String nombre)
    {
     this.idVisita= idVisita;
     this.ci= ci;
     this.nombre= nombre;
    }
    //Me asigna lo ingresado al personal
    public void setidVisita(int idVisita)
    {
        this.idVisita= idVisita;
    }
    //
    public void setNombre(String nombre)
    {
        this.nombre= nombre;
    }
    //
    public void setApellidoPaterno(String apellidoPaterno)
    {
        this.apellidoPaterno= apellidoPaterno;
    }
    //
    public void setApellidoMaterno(String apellidoMaterno)
    {
        this.apellidoMaterno= apellidoMaterno;
    }
    //
    public void setIc(int ci)
    {
        this.ci= ci;
    }
    //
    public void setcargo(String cargo)
    {
        this.cargo= cargo;
    }
    //
    public void sethoraIngreso(String horaIngreso)
    {
        this.horaIngreso= horaIngreso;
    }
    //
    public void sethoraSalida(String horaSalida)
    {
        this.horaSalida= horaSalida;
    }
    
    //Nos recupera la informacion asignada al personal
    public int getidVisita()
    {
        return this.idVisita;
    }
    //
    public String getNombre()
    {
        return this.nombre;
    }
    //
    public String getApellidoPaterno()
    {
        return this.apellidoPaterno;
    }
    //
    public String getApellidoMaterno()
    {
        return this.apellidoMaterno;
    }
    //
    public int getCi()
    {
        return this.ci;
    }
    //
    public String getcargo()
    {
        return this.cargo;
    }
    //
    public String gethoraIngreso()
    {
        return this.horaIngreso;
    }
    //
    public String gethoraSalida()
    {
        return this.horaSalida;
    }
    //
}
