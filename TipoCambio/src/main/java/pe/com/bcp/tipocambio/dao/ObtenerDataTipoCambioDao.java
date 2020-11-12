package pe.com.bcp.tipocambio.dao;

import org.springframework.data.repository.CrudRepository;

import pe.com.bcp.tipocambio.entity.DataTipoCambioEntity;


public interface ObtenerDataTipoCambioDao extends CrudRepository<DataTipoCambioEntity, Long>{
	
	public DataTipoCambioEntity findByMonedaOrigenAndMonedaDestino(String monedaOrigen, String monedaDestino);

}
