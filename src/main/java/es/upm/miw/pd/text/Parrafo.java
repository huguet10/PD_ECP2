package es.upm.miw.pd.text;

public class Parrafo extends Compuesto {

	@Override
	public void add(Componente componente) {
		if (componente.isCompuesto()) {
			throw new UnsupportedOperationException(
					"No es un caracter y no se puede anadir");
		}
		super.getComponente().add(componente);
	}

	@Override
	public String dibujar(Boolean enMayusculas) {
		String resultado = super.dibujarGenerico(enMayusculas);
		resultado += "\n";
		return resultado;
	}

}
