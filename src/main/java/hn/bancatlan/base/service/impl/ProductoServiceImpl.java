package hn.bancatlan.base.service.impl;

import java.util.Optional;

import hn.bancatlan.base.entity.Producto;
import hn.bancatlan.base.exception.ServiceException;
import hn.bancatlan.base.repository.ProductoRespository;
import hn.bancatlan.base.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRespository  productoRespository;

	
	@Override
	public Optional<Producto> findById(Long id) throws ServiceException {
		try {
			return productoRespository.findById(id);
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

}
