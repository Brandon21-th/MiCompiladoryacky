package edu.itsco;

public class SemanticException  extends Exception{
	
	public final static int VARIABLE_NO_DEFINIDA   = 10;
	public final static int VARIABLE_DUPLICADA = 20;
	public final static int VARIABLE_NO_INICIALIZADA = 30;
	public final static int TIPOS_NO_COINCIDEN = 40;
	
	public SemanticException(Variable variable, int tipoException) {
		super(getMensaje(variable,tipoException));
	}
	
	
	private static String getMensaje(Variable variable, int tipoException) {
		String mensaje = "";
		switch(tipoException) {
		case VARIABLE_NO_DEFINIDA:
			mensaje = "La variable "+variable.getId()+" no ha sido declarada";
			break;
		case VARIABLE_DUPLICADA:
			mensaje = "La variable "+variable.getId()+" ya fue declarda";
			break;
		case VARIABLE_NO_INICIALIZADA:
			mensaje = "La variable "+variable.getId()+" no tiene valor";
			break;
		case TIPOS_NO_COINCIDEN:
			mensaje = " El tipo de dato no coincide con el de la variable "+variable.getId();
			break;
		}
		return mensaje;
	}

}
