package com.church.overflowing.jpa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.church.overflowing.jpa.dto.McMainResponseDto;
import com.church.overflowing.jpa.dto.McSaveRequestDto;
import com.church.overflowing.jpa.service.McService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@Api(tags = "MC")
@RequestMapping("/mc")
public class McController {
	
	
	
	private McService mcService;
	
	
	
	@PostMapping
	@ApiOperation(value = "MC 등록", response = Long.class)
	public ResponseEntity<Object> registMc(@RequestBody McSaveRequestDto dto) {
		
		return ResponseEntity.status(HttpStatus.OK).body(mcService.insertMc(dto));
	}
	
	
	
	@GetMapping("/{mcSq}")
	@ApiOperation(value = "MC 시퀀스로 검색", response = McMainResponseDto.class)
	public ResponseEntity<Object> getMc(@PathVariable("commSq") Long mcSq) {
		
		return ResponseEntity.status(HttpStatus.OK).body(mcService.selectMcBySq(mcSq));
	}
	
	
	
	@GetMapping
	@ApiOperation(value = "MC 전체 검색", response = McMainResponseDto.class)
	public ResponseEntity<Object> getMcList() {
		
		return ResponseEntity.status(HttpStatus.OK).body(mcService.selectAllDesc());
	}
}
