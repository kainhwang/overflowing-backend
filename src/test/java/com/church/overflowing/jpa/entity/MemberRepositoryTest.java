package com.church.overflowing.jpa.entity;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.church.overflowing.jpa.entity.Flags.ChurchJob;
import com.church.overflowing.jpa.entity.Flags.Gender;
import com.church.overflowing.jpa.entity.Flags.MemberGrade;
import com.church.overflowing.jpa.entity.Flags.SchoolState;
import com.church.overflowing.jpa.entity.Flags.YesOrNo;
import com.church.overflowing.jpa.repository.MemberRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {

	@Autowired
	MemberRepository memberRepo;
	
//	@After
//	public void cleanup() {
//		memberRepo.deleteAll();
//		
//	}
	
	@Test
	public void 멤버리스트_불러오기() {
		
		//given
		memberRepo.save(Member.builder()
				.memId("christine")
				.memNm("황가인")
				.memEmail("kain@naver.com")
				.memGender(Gender.F)
				.memMarriageYn(YesOrNo.Y)
				.memBaptismYn(YesOrNo.Y)
				.memSchoolState(SchoolState.E)
				.memGrade(MemberGrade.R)
				.memChurchJob(ChurchJob.A)
				.build());
		
		//when
		List<Member> members = memberRepo.findAll();
		
		//then
		Member member = members.get(0);
		
		
		assertThat(member.getMemId(), is("christine"));
		//assertThat(member.getMemNm(), is("멤버 이름"));
		
	}
	
}
