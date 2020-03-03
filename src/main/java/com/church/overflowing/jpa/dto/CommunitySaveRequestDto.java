package com.church.overflowing.jpa.dto;

import java.time.LocalDateTime;

import com.church.overflowing.jpa.entity.Community;
import com.church.overflowing.jpa.entity.Flags.YesOrNo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CommunitySaveRequestDto {
	
	private String commNm;
	
	private String commPaster;
	
	private LocalDateTime commStdate;
	
	private LocalDateTime commEnddate;
	
	private String commDesc;
	
	private YesOrNo commUseYn;
	
	public Community toEntity() {
		
		return Community.builder()
				.commNm(commNm)
				.commPaster(commPaster)
				.commStdate(commStdate)
				.commEnddate(commEnddate)
				.commDesc(commDesc)
				.commUseYn(commUseYn)
				.build();
	}
}
