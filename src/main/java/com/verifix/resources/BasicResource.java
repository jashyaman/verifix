package com.verifix.resources;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verifix.model.DefaultResponse;

@RestController
//@RequestMapping(path="/verifix/v1")
public class BasicResource {

	@GetMapping(path="/")
	public ResponseEntity<Map<String, DefaultResponse>> basicResponse() {
		Map<String, DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();
		
		responseMap.put("data", new DefaultResponse("10001", "good data default response", "200", "OK"));
		return new ResponseEntity<Map<String,DefaultResponse>>(responseMap, HttpStatus.OK);
	}
	
}
