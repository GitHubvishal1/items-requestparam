package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {
	
	Map<Integer, String> map;
	public ItemsController() {
		map = new HashMap<>();
		map.put(1, "soap");
		map.put(2, "toothbrush");
		map.put(3, "wash");
	}
	
	@GetMapping("/get") //http://localhost:5050/swagger-ui.html
	public Map<Integer, String> getItems() {
		return map;
	}
	
	@GetMapping("/get/{tid}") // http://localhost:5050/swagger-ui.html/get/{tid}
	public List<Entry<Integer, String>> getItems(@PathVariable("tid") int orderId) {
		return map.entrySet().stream().filter(map -> map.getKey() == orderId).collect(Collectors.toList());
		// return list.stream().filter(list -> list.getId() == orderId).collect(Collectors.toList());

	}
}
