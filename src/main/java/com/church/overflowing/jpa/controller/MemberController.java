package com.church.overflowing.jpa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.church.overflowing.jpa.service.MemberService;


@RestController
@RequestMapping("/member")
public class MemberController {
	
	
	
	@Autowired
	MemberService memberService;
	
	
	
	@GetMapping("/{memSq}")
	public ResponseEntity<Object> getMember(HttpServletRequest request, @PathVariable("memSq") Long memSq) {
		
		return ResponseEntity.status(HttpStatus.OK).body(memberService.selectMemberBySq(memSq));
	}
	
	
	
	@GetMapping
	public ResponseEntity<Object> getMembers(HttpServletRequest request) {
		
		return ResponseEntity.status(HttpStatus.OK).body(memberService.selectMemberAll());
	}
}
