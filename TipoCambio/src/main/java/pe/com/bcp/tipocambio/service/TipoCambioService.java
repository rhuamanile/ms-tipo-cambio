package pe.com.bcp.tipocambio.service;

import java.util.List;

import pe.com.bcp.tipocambio.entity.DataTipoCambioEntity;
import pe.com.bcp.tipocambio.model.DatosActualizarTipoCambioInput;
import pe.com.bcp.tipocambio.model.DatosTipoCambioInput;
import pe.com.bcp.tipocambio.model.DatosTipoCambioOutput;
import pe.com.bcp.tipocambio.model.Resultado;

public interface TipoCambioService {
	
	public DatosTipoCambioOutput getTipoCambio(DatosTipoCambioInput input);
	
	public Resultado actualizarTipoCambio(DatosActualizarTipoCambioInput input);
	
	public List<DataTipoCambioEntity> obtenerDataTipoCambio();

}
