
/**
 * Write a description of class HistorialRegistros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HistorialRegistros
{
  public String edad, direccion, estudios, anhosExp;
  int idPersonal, ci;
  
  public HistorialRegistros()
  {
  this.idPersonal= 0;
  this.ci= 0;
  this.edad= "";
  this.direccion= "";
  this.estudios= "";
  this.anhosExp= "";
  }
  
  public HistorialRegistros (int idPersonal, int ci, String edad, String direccion,String estudios, String anhosExp)
  {
  this.idPersonal= idPersonal;
  this.ci= ci;
  this.edad= edad;
  this.direccion= direccion;
  this.estudios= estudios;
  this.anhosExp= anhosExp;
  }
  //
  public void setInfobasica(int idPersonal, int ci)
  {
    this.idPersonal= idPersonal;
    this.ci= ci;
    }
  //  
  public void setidPersonal(int idPersonal)
    {
       this.idPersonal= idPersonal;
    }
  //  
  public void setci(int ci)
    {
       this.ci= ci;
    } 
  //  
  public void setedad(String edad)
    {
       this.edad= edad;
    } 
  //
  public void setdireccion(String direccion)
    {
       this.direccion= direccion;
    } 
  //  
  public void setestudios(String estudios)
    {
       this.estudios= estudios;
    } 
  //  
  public void setanhosExp(String anhosExp)
    {
       this.anhosExp= anhosExp;
    } 
  
  //
  public int getidPersonal()
    {
        return this.idPersonal;
    }
  //
  public int getci()
    {
        return this.ci;
    }  
  //
  public String getedad()
    {
        return this.edad;
    } 
  //
  public String getdireccion()
    {
        return this.direccion;
    }
  //
  public String getestudios()
    {
        return this.estudios;
    } 
  //
  public String getanhosExp()
    {
        return this.anhosExp;
    }  
}
