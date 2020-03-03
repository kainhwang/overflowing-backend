package com.church.overflowing.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.church.overflowing.jpa.entity.Flags.YesOrNo;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@Entity
@Table(name="COMMUNITY")
public class Community extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COMM_SQ", updatable=false)
	private long commSq;
	
	@Column(name="COMM_NM")
	private String commNm;
	
	@Column(name="COMM_PASTER")
	private String commPaster;
	
	@Column(name="COMM_STDATE")
	private LocalDateTime commStdate;
	
	@Column(name="COMM_ENDDATE")
	private LocalDateTime commEnddate;
	
	@Column(name="COMM_DESC")
	private String commDesc;
	
	@Enumerated(EnumType.STRING)
	@Column(name="COMM_USE_YN")
	private YesOrNo commUseYn;
	
	@Builder
	public Community(long commSq, String commNm, String commPaster, LocalDateTime commStdate, LocalDateTime commEnddate,
			String commDesc, YesOrNo commUseYn) {
		
		this.commSq = commSq;
		this.commNm = commNm;
		this.commPaster = commPaster;
		this.commStdate = commStdate;
		this.commEnddate = commEnddate;
		this.commDesc = commDesc;
		this.commUseYn = commUseYn;
	}
}
