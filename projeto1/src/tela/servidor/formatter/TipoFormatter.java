package tela.servidor.formatter;

import com.towel.bean.Formatter;

import engine.tipos.Tipo;

public class TipoFormatter implements Formatter {
	public Object format(Object obj) {
		Tipo d = (Tipo) obj;
		return d.toString();
	}

	public Object parse(Object obj) {
		return Tipo.valueOf((String) obj);
	}

	public String getName() {
		return "tipo";
	}
}