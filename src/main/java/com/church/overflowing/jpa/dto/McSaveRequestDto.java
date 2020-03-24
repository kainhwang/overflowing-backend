package com.church.overflowing.jpa.dto;

import java.time.LocalDateTime;

import com.church.overflowing.jpa.entity.MC;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class McSaveRequestDto {
	
	private String mcNm;
	
	private String mcLeader;
	
	private LocalDateTime mcStdate;
	
	private LocalDateTime mcEnddate;
	
	private String mcDesc;
	
	
	
	@Builder
	public McSaveRequestDto(String mcNm,
							String mcLeader,
							LocalDateTime mcStdate,
							LocalDateTime mcEnddate,
							String mcDesc) {
		
		this.mcNm = mcLeader;
		this.mcLeader = mcLeader;
		this.mcStdate = mcStdate;
		this.mcEnddate = mcEnddate;
		this.mcDesc = mcDesc;
	}
	
	
	
	public MC toEntity() {
		
		return MC.builder()
					.mcNm(mcNm)
					.mcLeader(mcLeader)
					.mcStdate(mcStdate)
					.mcEnddate(mcEnddate)
					.mcDesc(mcDesc)
					.build();
	}
}
