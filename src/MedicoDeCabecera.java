
public class MedicoDeCabecera{
	
	private static final int CANTIDAD_DE_CATACTERES_LICENCIA=10;
	public static boolean  esValida(String Licencia)  {
		String licenciaSinEspacios=Licencia.trim();
		int licenciaLargo = licenciaSinEspacios.length();
		return licenciaLargo==CANTIDAD_DE_CATACTERES_LICENCIA;
	}
}