package com.church.overflowing.jpa.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
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
	private Timestamp mcStdate;
	
	@Column(name="MC_ENDDATE")
	private Timestamp mcEnddate;
	
	@Column(name="MC_DESC")
	private String mcDesc;
}
