package pe.com.bcp.tipocambio.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.bcp.tipocambio.entity.DataTipoCambioEntity;
import pe.com.bcp.tipocambio.model.DatosActualizarTipoCambioInput;
import pe.com.bcp.tipocambio.model.DatosTipoCambioInput;
import pe.com.bcp.tipocambio.model.DatosTipoCambioOutput;
import pe.com.bcp.tipocambio.model.Resultado;
import pe.com.bcp.tipocambio.service.TipoCambioService;


@RestController
@RequestMapping("/reto-bcp")
public class TipoCambioController {
	
	@Autowired
	private TipoCambioService tipoCambioService;
	
	@PostMapping("/calcular-tipo-cambio")
	public DatosTipoCambioOutput getTipoCambio(@RequestBody DatosTipoCambioInput input) {
		return tipoCambioService.getTipoCambio(input);
	}
	
	@PostMapping("/actualizar-tipo-cambio")
	public Resultado actualizarTipoCambio(@RequestBody DatosActualizarTipoCambioInput input) {
		Resultado resultado = new Resultado();
		resultado = tipoCambioService.actualizarTipoCambio(input);
		return resultado;
		
	}
	
	@GetMapping("/obtener-data-tipo-cambio")
	public List<DataTipoCambioEntity> obtenerDataTipoCambio(){
		return tipoCambioService.obtenerDataTipoCambio();
	}

}
