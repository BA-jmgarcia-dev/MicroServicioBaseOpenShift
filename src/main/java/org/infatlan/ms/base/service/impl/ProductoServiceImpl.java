package org.infatlan.ms.base.service.impl;

import java.util.Optional;

import org.infatlan.ms.base.entity.Producto;
import org.infatlan.ms.base.exception.ServiceException;
import org.infatlan.ms.base.repository.ProductoRespository;
import org.infatlan.ms.base.service.ProductoService;
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
