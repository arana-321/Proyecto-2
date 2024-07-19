
/**
 * Write a description of class DB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DB
{
    
    public static Usuario[] usuario = new Usuario[100];
    public static int us = 0;
    
    public static Personal[] personal= new Personal[100];
    public static int pe= 0;
    
    public static Asistencia[] asistencia= new Asistencia[100];
    public static int con= 0;
    
    
    
    /////////////////REGISTRAR///////////////////////////

     public static void RegistrarUsuario(Usuario usu)
    {
        usuario[us] = usu;
        us++;
    }
    //
   public static void RegistrarPersonal(Personal per)
    {
        personal[pe] = per;
        pe++;
    }
    //
    public static void RegistrarAsistencia(Asistencia consul)
    {
        asistencia[con] = consul;
        con++;
    }
    //
    
    //
   
    //
    
    
    ///////////////////    MODIFICAR   //////////////////////////
     /*      MODIFICAR       */
    public static boolean modificarUsuario(int pos, Usuario nuevoUsuario)
    {
        if (pos >= 0 && pos < us) {
            usuario[pos] = nuevoUsuario;
            return true;
        }
        return false;
    }  
    
    public static boolean modificarPersonal(int pos, Personal nuevoPersonal)
    {
        if (pos >= 0 && pos < pe) {
            personal[pos] = nuevoPersonal;
            return true;
        }
        return false;
    }
    
    public static boolean modificarAsistencia(int pos, Asistencia nuevaAsistencia)
    {
        if (pos >= 0 && pos < con) {
            asistencia[pos] = nuevaAsistencia;
            return true;
        }
        return false;
    }
    
    /*      ELEMINAR         */
    public static boolean eliminarUsuario(int pos) {
        if (pos >= 0 && pos < us) {
         if(usuario[pos] != null){
          for (int i = pos; i < us - 1; i++) {
                    usuario[i] = usuario[i + 1];
             }
                usuario[us - 1] = null;
                us--;
                return true;
            }
        }
        return false;
    } 
    public static boolean eliminarPersonal(int pos) {
        if (pos >= 0 && pos < pe) {
            if(personal[pos] != null){
                for (int i = pos; i < pe - 1; i++) {
                    personal[i] = personal[i + 1];
                }
                personal[pe - 1] = null;
                pe--;
                return true;
            }
        }
        return false;
    }
    
    public static boolean eliminarAsistencia(int pos) {
        if (pos >= 0 && pos < con) {
            if(asistencia[pos] != null){
                for (int i = pos; i < con - 1; i++) {
                    asistencia[i] = asistencia[i + 1];
                }
                asistencia[con - 1] = null;
                con--;
                return true;
            }
        }
        return false;
    }
    
    /*      POSICION        */ 
    
    public static Personal personalPos(int pos)
    {
        return personal[pos];
    }
    
    public static Asistencia asistenciaPos(int pos)
    {
        return asistencia[pos];
    }
}
