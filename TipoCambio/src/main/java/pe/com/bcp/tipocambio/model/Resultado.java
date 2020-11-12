package pe.com.bcp.tipocambio.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Resultado {

	private long codigo;
	private String mensaje;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
