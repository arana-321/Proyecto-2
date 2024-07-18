
/**
 * Write a description of class DB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DB
{
    public static Usuario[] usuario = new Usuario[100];
    public static int ius = 0;
    
    public static RegistroPersonal[] RegistroPersonal= new RegistroPersonal[100];
    public static int ia= 0;
    
    public static ControlAsistencia[] ControlAsistencia= new ControlAsistencia[100];
    public static int ic= 0;
    
    public static Restringidos[] restringidos= new Restringidos[100];
    public static int ir= 0;
    
    public static ControlVisitas[] controlVisitas= new ControlVisitas[100];
    public static int iv= 0;
    
    public static HistorialRegistros[] HistorialRegistros= new HistorialRegistros[100];
    public static int ih= 0;
    
    /////////////////REGISTRAR///////////////////////////
    public static void registrarUsuario(Usuario us){
        usuario[ius] = us;
        ius++;
    }
    //
    public static void registrarRegistroPersonal(RegistroPersonal an)
    {        
        RegistroPersonal[ia]= an;
        ia++;
    }
    //
    public static void ControlAsistencia(ControlAsistencia con)
    {
        ControlAsistencia[ic] = con;
        ic++;
    }
    //
    public static void Restringidos(Restringidos con)
    {
        restringidos[ir] = con;
        ir++;
    }
    //
    public static void ControlVisitas(ControlVisitas con)
    {
        controlVisitas[iv] = con;
        iv++;
    }
    //
    public static void HistorialRegistros(HistorialRegistros con)
    {
        HistorialRegistros[ih] = con;
        ih++;
    }
    
    //////////////////POSICION //////////////////////////
    public static Usuario usuarioPos(int pos){
        return usuario[pos];
    }
    //
    public static RegistroPersonal RegistroPersonalPos(int pos)
    {
        return RegistroPersonal[pos];
    }
    //
    public static ControlAsistencia ControlAsistenciaPos(int pos)
    {
        return ControlAsistencia[pos];
    }
    //
    public static Restringidos RestringidosPos(int pos)
    {
        return restringidos[pos];
    }
    //
    public static ControlVisitas ControlVisitasPos(int pos)
    {
        return controlVisitas[pos];
    }
    //
    public static HistorialRegistros HistorialRegistrosPos(int pos)
    {
        return HistorialRegistros[pos];
    }
}
