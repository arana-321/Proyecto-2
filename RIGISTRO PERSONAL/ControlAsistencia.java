
/**
 * Write a description of class ControlAsistencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ControlAsistencia
{
  public String cargo, ocurrencia, detalle;
  int idPersonal, ci;
  char genero;
  
  public ControlAsistencia()
  {
  this.idPersonal= 0;
  this.ci= 0;
  this.genero= ' ';
  this.cargo= "";
  this.ocurrencia= "";
  this.detalle= "";
  }
  
  public ControlAsistencia (int idPersonal, int ci, char genero, String cargo,String ocurrencia, String detalle)
  {
  this.idPersonal= idPersonal;
  this.ci= ci;
  this.genero= genero;
  this.cargo= cargo;
  this.ocurrencia= ocurrencia;
  this.detalle= detalle;
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
  public void setgenero(char genero)
    {
       this.genero= genero;
    } 
  //  
  public void setcargo(String cargo)
    {
       this.cargo= cargo;
    } 
  //  
  public void setocurrencia(String ocurrencia)
    {
       this.ocurrencia= ocurrencia;
    } 
  //  
  public void setdetalle(String detalle)
    {
       this.detalle= detalle;
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
  public char getgenero()
    {
        return this.genero;
    } 
  //
  public String getcargo()
    {
        return this.cargo;
    }
  //
  public String getocurrencia()
    {
        return this.ocurrencia;
    } 
  //
  public String getdetalle()
    {
        return this.detalle;
    }  
}
