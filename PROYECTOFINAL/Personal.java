
/**
 * Write a description of class RegistrarPersonal here.
 * 
 * @author (yo name) 
 * @version (a version number or a date)
 */

public class Personal
{
    //
    public String nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, correoElectronico, cargo, direccion, telefono;
    public int idPersonal, ci;
    
    public Personal ()
    {
        this.idPersonal= 0;
        this.ci= 0;
        this.nombre= "";
        this.apellidoPaterno= "";
        this.apellidoMaterno= "";
        this.fechaNacimiento= "";
        this.correoElectronico= "";
        this.cargo= "";
        this.direccion= "";
        this.telefono= "";
    }
    //
    public Personal (int idPersonal, int ci, String nombre, String apellidoPaterno, String apellidoMaterno , String fechaNacimiento, String correoElectronico, String cargo, String direccion, String telefono)
    {
        this.idPersonal= idPersonal;
        this.ci= ci;
        this.nombre= nombre;
        this.apellidoPaterno= apellidoPaterno;
        this.apellidoMaterno= apellidoMaterno;
        this.fechaNacimiento= fechaNacimiento;
        this.correoElectronico= correoElectronico;
        this.cargo= cargo;
        this.direccion= direccion;
        this.telefono= telefono;
        
    }
    //
    public Personal (int idPersonal, int ci, String nombre)
    {
     this.idPersonal= idPersonal;
     this.ci= ci;
     this.nombre= nombre;
    }
    //Me asigna lo ingresado al personal
    public void setIdPersonal(int idPersonal)
    {
        this.idPersonal= idPersonal;
    }
    //
    public void setIc(int ci)
    {
        this.ci= ci;
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
    public void setFechaNacimiento(String fechaNacimiento)
    {
        this.fechaNacimiento= fechaNacimiento;
    }
    //
    public void setCorreoElectronico(String correoElectronico)
    {
        this.correoElectronico= correoElectronico;
    }
    //
    public void setCargo(String cargo)
    {
        this.cargo= cargo;
    }
    //
    public void setDireccion(String direccion)
    {
        this.direccion= direccion;
    }
    //
    public void setTelefono(String telefono)
    {
        this.telefono= telefono;
    }
    
    //Nos recupera la informacion asignada al personal
    public int getIdPersonal()
    {
        return this.idPersonal;
    }
    //
    public int getCi()
    {
        return this.ci;
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
    public String getFechaNacimiento()
    {
        return this.fechaNacimiento;
    }
    //
    public String getCorreoElectronico()
    {
        return this.correoElectronico;
    }
    //
    public String getCargo()
    {
        return this.cargo;
    }
    //
    public String getDireccion()
    {
        return this.direccion;
    }
    //
    public String getTelefono()
    {
        return this.telefono;
    }
}
