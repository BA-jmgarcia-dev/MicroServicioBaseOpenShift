package org.infatlan.ms.base.service.consumo.impl;

import org.infatlan.ms.base.dto.ResultadoTodoDto;
import org.infatlan.ms.base.service.consumo.TempConsumoService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.Data;

@Data
@Service
public class TempConsumoServiceImpl implements TempConsumoService {

	RestTemplate restTemplate = new RestTemplate();

	public ResultadoTodoDto consumoRest() {

		String endPoint = "https://jsonplaceholder.typicode.com/todos/2";
		ResultadoTodoDto resultTodo = restTemplate.getForObject(endPoint, ResultadoTodoDto.class);	

		return resultTodo;
	}
}
