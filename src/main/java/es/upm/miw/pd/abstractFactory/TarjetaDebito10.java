package es.upm.miw.pd.abstractFactory;

import upm.jbb.IO;

public class TarjetaDebito10 extends AbstractTarjetaDebito {
	
	@Override
	public void view() {
		IO.out.println("Gratuita");
	}
	
}
