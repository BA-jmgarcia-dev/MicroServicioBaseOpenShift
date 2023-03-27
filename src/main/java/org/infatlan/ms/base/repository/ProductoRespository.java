package org.infatlan.ms.base.repository;

import java.util.List;

import org.infatlan.ms.base.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRespository extends JpaRepository<Producto, Long> {

	@Query("select p from Producto p where p.estado='1'")
	List<Producto> findAllProducto();
}
