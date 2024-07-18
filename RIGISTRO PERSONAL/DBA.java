
public class DBA
{
   /* USUARIO */
    public static void setUsuario(Usuario us){
        DB.registrarUsuario(us);
    }

    public static Usuario getUsuarioPos(int pos) {
        if (pos <= DB.ius) {
            return DB.usuarioPos(pos - 1);
        } else {
            return null;
        }
    }
 
    public static boolean existeUsuario(Usuario usu){
        boolean res= false;
        
        for(int i=0; i<DB.ius; i++){
            if(usu.getUsuario().equals(DB.usuario[i].getUsuario())&&usu.getContrasenha().equals(DB.usuario[i].getContrasenha()))
                res= true;
        }
        return res;
    }
    //
    /* REGISTRO PERSONAL*/
    public static void setRegistroPersonal(RegistroPersonal us){
        DB.registrarRegistroPersonal(us);
    }
    public static RegistroPersonal getRegistroPersonalPos(int poss){
        if (poss<=DB.ia){
            return DB.RegistroPersonalPos(poss-1);
        }
        else{
            System.out.println("ERROR: Registro no encontrado.");
            return null;
        }      
    }
    /*  Control Asistencia*/
    public static void setControlAsistencia(ControlAsistencia c){
        DB.ControlAsistencia(c);
    }
    public static ControlAsistencia getControlAsistenciaPos(int poss){
        if (poss<=DB.ic){
            return DB.ControlAsistenciaPos(poss-1);
        }
        else{
            System.out.println("ERROR: Asistencia no encontrado.");
            return null;
        }      
    }
    /*  Restringidos*/
    public static void setRestringidos(Restringidos r){
        DB.Restringidos(r);
    }
    public static Restringidos getRestringidosPos(int poss){
        if (poss<=DB.ir){
            return DB.RestringidosPos(poss-1);
        }
        else{
            System.out.println("ERROR: Restringido no encontrado.");
            return null;
        }      
    }
    /*  Control Visitas*/
    public static void setControlVisitas(ControlVisitas v){
        DB.ControlVisitas(v);
    }
    public static ControlVisitas getControlVisitasPos(int poss){
        if (poss<=DB.iv){
            return DB.ControlVisitasPos(poss-1);
        }
        else{
            System.out.println("ERROR: Restringido no encontrado.");
            return null;
        }      
    }
    /*  Historial Registros*/
    public static void setHistorialRegistros(HistorialRegistros h){
        DB.HistorialRegistros(h);
    }
    public static HistorialRegistros getHistorialRegistrosPos(int poss){
        if (poss<=DB.ih){
            return DB.HistorialRegistrosPos(poss-1);
        }
        else{
            System.out.println("ERROR: Historial no encontrado.");
            return null;
        }      
    }
}
