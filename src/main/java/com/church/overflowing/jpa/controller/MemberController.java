package com.church.overflowing.jpa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.church.overflowing.jpa.dto.MemberMainResponseDto;
import com.church.overflowing.jpa.dto.MemberSaveRequestDto;
import com.church.overflowing.jpa.service.MemberService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
@Api(tags = "MEMBER")
@RequestMapping("/member")
public class MemberController {
	
	
	
	private MemberService memberService;
	
	
//	
//	@GetMapping("/{memSq}")
//	public ResponseEntity<Object> getMember(HttpServletRequest request, @PathVariable("memSq") Long memSq) {
//		
//		return ResponseEntity.status(HttpStatus.OK).body(memberService.selectMemberBySq(memSq));
//	}
//	
//	
//	
//	@GetMapping
//	public ResponseEntity<Object> getMembers(HttpServletRequest request) {
//		
//		return ResponseEntity.status(HttpStatus.OK).body(memberService.selectMemberAll());
//	}
//	
	
	
	@PostMapping
	@ApiOperation(value = "Member 등록", response = Long.class)
	public ResponseEntity<Object> registMember(@RequestBody MemberSaveRequestDto dto) {
		
		return ResponseEntity.status(HttpStatus.OK).body(memberService.insertMember(dto));
	}
	
	
	
	@GetMapping("/{memSq}")
	@ApiOperation(value = "Member 시퀀스로 검색", response = MemberMainResponseDto.class)
	public ResponseEntity<Object> getMember(@PathVariable("memSq") Long memSq) {
		
		return ResponseEntity.status(HttpStatus.OK).body(memberService.selectMemberBySq(memSq));
	}
	
	
	
	@GetMapping
	@ApiOperation(value = "Member 전체 검색", response = MemberMainResponseDto.class)
	public ResponseEntity<Object> getMebers() {
		
		return ResponseEntity.status(HttpStatus.OK).body(memberService.selectAllDesc());
	}
}
