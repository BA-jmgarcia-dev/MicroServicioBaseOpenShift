package hn.bancatlan.base.controller;

import java.util.Optional;

import hn.bancatlan.base.entity.Producto;
import hn.bancatlan.base.service.ProductoService;
import hn.bancatlan.base.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	private ProductoService productoService;

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Producto>> findById(@PathVariable Long id) {
		try {

			Optional<Producto> optProducto = this.productoService.findById(id);

			if (!optProducto.isPresent()) {
				return ResponseEntity.noContent().build();
			}

			return ResponseEntity.ok(optProducto);

		} catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.internalServerError().build();
		}
	}

}
