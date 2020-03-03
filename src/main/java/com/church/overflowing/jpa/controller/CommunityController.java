package com.church.overflowing.jpa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.church.overflowing.jpa.dto.CommunitySaveRequestDto;
import com.church.overflowing.jpa.service.CommunityService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@Api(tags = "COMMUNITY")
@RequestMapping("/community")
public class CommunityController {
	
	
	
	private CommunityService communityService;
	
	
	
	@GetMapping
	@ApiOperation(value = "공동체 등록", response = Long.class)
	public ResponseEntity<Object> insertCommunity(@RequestBody CommunitySaveRequestDto dto) {
		
		return new ResponseEntity<Object>(communityService.save(dto), HttpStatus.OK);
	}
}
