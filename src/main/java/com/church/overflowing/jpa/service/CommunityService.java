package com.church.overflowing.jpa.service;

import org.springframework.stereotype.Service;

import com.church.overflowing.jpa.repository.CommunityRepository;

@Service
public class CommunityService {
	
	
	private CommunityRepository communityRepository;
	
	public CommunityService(CommunityRepository communityRepository) {
		
		this.communityRepository = communityRepository;
	}
}
