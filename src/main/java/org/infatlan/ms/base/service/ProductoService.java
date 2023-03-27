package org.infatlan.ms.base.service;

import java.util.Optional;

import org.infatlan.ms.base.entity.Producto;
import org.infatlan.ms.base.exception.ServiceException;

public interface ProductoService {
	
	Optional<Producto> findById(Long id) throws ServiceException;
}
