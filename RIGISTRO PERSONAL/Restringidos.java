
/**
 * Write a description of class Registros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restringidos
{
  public String restringio, motivoRestriccion, inicio, finalR;
  int idPersonal, ci;
  
  public  Restringidos()
  {
  this.idPersonal= 0;
  this.ci= 0;
  this.restringio= "";
  this.motivoRestriccion= "";
  this.inicio= "";
  this.finalR= "";
  }
  
  public Restringidos (int idPersonal, int ci, String restringio, String motivoRestriccion, String inicio, String finalR)
  {
  this.idPersonal= idPersonal;
  this.ci= ci;
  this.restringio= restringio;
  this.motivoRestriccion= motivoRestriccion;
  this.inicio= inicio;
  this.finalR= finalR;
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
  public void setrestringio(String restringio)
    {
       this.restringio= restringio;
    } 
  //  
  public void setmotivoRestriccion(String motivoRestriccion)
    {
       this.motivoRestriccion= motivoRestriccion;
    } 
  //  
  public void setoinicio(String inicio)
    {
       this.inicio= inicio;
    } 
  //  
  public void setfinalR(String finalR)
    {
       this.finalR= finalR;
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
  public String getrestringio()
    {
        return this.restringio;
    } 
  //
  public String getmotivoRestriccion()
    {
        return this.motivoRestriccion;
    }
  //
  public String getinicio()
    {
        return this.inicio;
    } 
  //
  public String getfinalR()
    {
        return this.finalR;
    }  
}
