package hn.bancatlan.base.service;

import java.util.Optional;

import hn.bancatlan.base.entity.Producto;
import hn.bancatlan.base.exception.ServiceException;

public interface ProductoService {
	
	Optional<Producto> findById(Long id) throws ServiceException;
}
