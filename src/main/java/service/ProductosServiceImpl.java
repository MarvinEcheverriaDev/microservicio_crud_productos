package service;

import org.springframework.stereotype.Service;
import java.util.List;
import model.Producto;

@Service
public class ProductosServiceImpl implements ProductosService {

	@Override
	public List<Producto> catalogo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> productosCategoria(String categoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto productoCodigo(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void altaProducto(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto eliminarProducto(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto actualizarPrecio(int cod, double precio) {
		// TODO Auto-generated method stub
		return null;
	}

}
