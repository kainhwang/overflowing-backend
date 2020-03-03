package com.church.overflowing.jpa.entity;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.church.overflowing.jpa.entity.Flags.YesOrNo;
import com.church.overflowing.jpa.repository.CommunityRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommunityRepositoryTest {
	
	@Autowired
	CommunityRepository commRepository;
	
	
	
//	@After
//	public void cleanup() {
//		
//		commRepository.deleteAll();
//	}
	
	
	@Test
	public void 공동체리스트_등록() {
		
		//given
		LocalDateTime now = LocalDateTime.now();
		
		Community in = Community.builder()
				//.commSq(2)
				.commNm("test1")
				.commPaster("Brian")
				.commUseYn(YesOrNo.Y)
				//.commStdate(now)
				.commDesc("desc test")
				.build();
		
		commRepository.save(in);
		
		//when
		List<Community> list = commRepository.findAll();
		
		//then
		Community com = list.get(0);
		
		//assertThat(com.getCommNm(), is("test1"));
		
		assertTrue(com.getCreateDate().isAfter(now));
		assertTrue(com.getModifiedDate().isAfter(now));
	}

}
