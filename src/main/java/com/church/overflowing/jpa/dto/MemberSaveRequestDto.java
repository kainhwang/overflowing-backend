package com.church.overflowing.jpa.dto;

import java.time.LocalDateTime;

import com.church.overflowing.jpa.entity.Flags.ChurchJob;
import com.church.overflowing.jpa.entity.Flags.Gender;
import com.church.overflowing.jpa.entity.Flags.MemberGrade;
import com.church.overflowing.jpa.entity.Flags.SchoolState;
import com.church.overflowing.jpa.entity.Flags.YesOrNo;
import com.church.overflowing.jpa.entity.Member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MemberSaveRequestDto {
	
	private String memId;
	
	private String memPwd;
	
	private String memNm;
	
	private String memEnm;
	
	private LocalDateTime memBirth;
	
	private String memPhone;
	
	private String memEmail;
	
	private Gender memGender;
	
	private YesOrNo memMarriageYn;
	
	private String memMarriagePartner;
	
	private LocalDateTime memMarriageDate;
	
	private LocalDateTime memRegDate;
	
	private String memGuideNm;
	
	private String memPreChurch;
	
	private YesOrNo memBaptismYn;
	
	private LocalDateTime memBaptismDate;
	
	private String memBaptismChurch;
	
	private String memAddr;
	
	private String memSchool;
	
	private String memMajor;
	
	private SchoolState memSchoolState;
	
	private String memCompany;
	
	private String memCompanyPosition;
	
	private String memCompanyTask;
	
	private String memCarNm;
	
	private String memCarNum;
	
	private int memCarPool;
	
	private String memDesc;
	
	private MemberGrade memGrade;
	
	private ChurchJob memChurchJob;
	
	
	
	@Builder
	public MemberSaveRequestDto(String memId,
								String memPwd,
								String memNm,
								String memEnm,
								LocalDateTime memBirth,
								String memPhone,
								String memEmail,
								Gender memGender,
								YesOrNo memMarriageYn,
								String memMarriagePartner,
								LocalDateTime memMarriageDate,
								LocalDateTime memRegDate,
								String memGuideNm,
								String memPreChurch,
								YesOrNo memBaptismYn,
								LocalDateTime memBaptismDate,
								String memBaptismChurch,
								String memAddr,
								String memSchool,
								String memMajor,
								SchoolState memSchoolState,
								String memCompany, 
								String memCompanyPosition,
								String memCompanyTask,
								String memCarNm,
								String memCarNum,
								int memCarPool,
								String memDesc,
								MemberGrade memGrade,
								ChurchJob memChurchJob) {
		
		this.memId = memId;
		this.memPwd = memPwd;
		this.memNm = memNm;
		this.memEnm = memEnm;
		this.memBirth = memBirth;
		this.memPhone = memPhone;
		this.memEmail = memEmail;
		this.memGender = memGender;
		this.memMarriageYn = memMarriageYn;
		this.memMarriagePartner = memMarriagePartner;
		this.memMarriageDate = memMarriageDate;
		this.memRegDate = memRegDate;
		this.memGuideNm = memGuideNm;
		this.memPreChurch = memPreChurch;
		this.memBaptismYn = memBaptismYn;
		this.memBaptismDate = memBaptismDate;
		this.memBaptismChurch = memBaptismChurch;
		this.memAddr = memAddr;
		this.memSchool = memSchool;
		this.memMajor = memMajor;
		this.memSchoolState = memSchoolState;
		this.memCompany = memCompany;
		this.memCompanyPosition = memCompanyPosition;
		this.memCompanyTask = memCompanyTask;
		this.memCarNm = memCarNm;
		this.memCarNum = memCarNum;
		this.memCarPool = memCarPool;
		this.memDesc = memDesc;
		this.memGrade = memGrade;
		this.memChurchJob = memChurchJob;
	}
	
	
	
	public Member toEntity() {
		
		return Member.builder()
						.memId(memId)
						.memPwd(memPwd)
						.memNm(memNm)
						.memEnm(memEnm)
						.memBirth(memBirth)
						.memPhone(memPhone)
						.memEmail(memEmail)
						.memGender(memGender)
						.memMarriageYn(memMarriageYn)
						.memMarriagePartner(memMarriagePartner)
						.memMarriageDate(memMarriageDate)
						.memRegDate(memRegDate)
						.memGuideNm(memGuideNm)
						.memPreChurch(memPreChurch)
						.memBaptismYn(memBaptismYn)
						.memBaptismDate(memBaptismDate)
						.memBaptismChurch(memBaptismChurch)
						.memAddr(memAddr)
						.memSchool(memSchool)
						.memMajor(memMajor)
						.memSchoolState(memSchoolState)
						.memCompany(memCompany)
						.memCompanyPosition(memCompanyPosition)
						.memCompanyTask(memCompanyTask)
						.memCarNm(memCarNm)
						.memCarNum(memCarNum)
						.memCarPool(memCarPool)
						.memDesc(memDesc)
						.memGrade(memGrade)
						.memChurchJob(memChurchJob)
						.build();
	}
}
