package com.church.overflowing.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@Entity
@Table(name="MC")
public class MC extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MC_SQ", updatable=false)
	private long mcSq;
	
	@Column(name="MC_NM")
	private String mcNm;
	
	@Column(name="MC_LEADER")
	private String mcLeader;
	
	@Column(name="MC_STDATE")
	private LocalDateTime mcStdate;
	
	@Column(name="MC_ENDDATE")
	private LocalDateTime mcEnddate;
	
	@Column(name="MC_DESC")
	private String mcDesc;
	
	
	
	@Builder
	public MC(long mcSq,
				String mcNm,
				String mcLeader,
				LocalDateTime mcStdate,
				LocalDateTime mcEnddate,
				String mcDesc) {
		
		this.mcSq = mcSq;
		this.mcNm = mcNm;
		this.mcLeader = mcLeader;
		this.mcStdate = mcStdate;
		this.mcEnddate = mcEnddate;
		this.mcDesc = mcDesc;
	}
}
