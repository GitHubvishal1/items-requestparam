package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {
	
	Map<Integer, String> map;
	public ItemsController() {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		map.put(1, "soap");
		map.put(2, "toothbrush");
		map.put(3, "wash");
	}
	
	@GetMapping("/items") //http://localhost:5050/items/
	public Map<Integer, String> getItems() {
		return map;
	}
}
