
public class DBA
{
  
    //
    /* REGISTRO PERSONAL*/
    public static void setPersonal(Personal p)
    {
        DB.RegistrarPersonal(p);
    }

    public static Personal getPersonal(int pos) {
        if (pos <= DB.pe) {
            return DB.personalPos(pos - 1);
        } else {
            return null;
        }
    }

    public static boolean EliminarPersonal(int pos)
    {
        return DB.eliminarPersonal(pos - 1);
    }

    public static boolean ModificarPersonal(int pos, Personal nuevoPersonal) {
        if (pos <= DB.pe) {
            return DB.modificarPersonal(pos - 1, nuevoPersonal);
        } else {
            return false;
        }
    }
    
    /* REGISTRO ASISTENCIA*/
    public static void setAsistencia(Asistencia c)
    {
        DB.RegistrarAsistencia(c);
    }

    public static Asistencia getAsistencia(int pos) {
        if (pos <= DB.con) {
            return DB.asistenciaPos(pos - 1);
        } else {
            return null;
        }
    }

    public static boolean EliminarAsistencia(int pos)
    {
        return DB.eliminarAsistencia(pos - 1);
    }

    public static boolean ModificarAsistencia(int pos, Asistencia nuevaAsistencia) {
        if (pos <= DB.con) {
            return DB.modificarAsistencia(pos - 1, nuevaAsistencia);
        } else {
            return false;
        }
    }
    
     /*      USUARIO         */
    public static void setUsuario(Usuario us){
        DB.RegistrarUsuario(us);
    }

    

    public static boolean EliminarUsuario(int pos)
    {
        return DB.eliminarUsuario(pos - 1);
    }

    public static boolean ModificarUsuario(int pos, Usuario nuevoUsuario) {
        if (pos <= DB.us) {
            return DB.modificarUsuario(pos - 1, nuevoUsuario);
        } else {
            return false;
        }
    }

    public static boolean existeUsuario(Usuario usu){
        boolean res= false;
        for(int i=0; i<DB.us; i++){
            if(usu.getUsuario().equals(DB.usuario[i].getUsuario())&&usu.getContrasenha().equals(DB.usuario[i].getContrasenha()))
                res= true;
        }
        return res;
    }
    
}
