package org.sample.project.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sample.project.mapper.MemberMapper;
import org.sample.project.model.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberMapperTest {
	
	@Autowired
	MemberMapper mapper;
	
//	@Test
	public void memberInsertTest() {
		//테스트 코드...
		//테스트 코드의 반환은 반드시 void이어야 할 것.
		log.info("memberInsert() start");
		MemberDTO dto = new MemberDTO(); 
		dto.setM_id("_test_id");
		dto.setM_pw("_test_pw");
		dto.setM_address("_test_address");
		mapper.memberInsert(dto);
		log.info("memberInsert() end");
	}
	
	//@Test
	public void memberListTest() {
		List<MemberDTO> list = mapper.memberList();
		for(MemberDTO dto : list) {
			System.out.println(dto);
		}
	}
	
	//@Test
	public void memberDelete() {
		mapper.memberDelete("2");
	}
	
//	@Test
	public void memberReatTest() {
		MemberDTO dto = mapper.memberRead("1");
		System.out.println(dto);
	}
	
	//@Test
	public void memberInsertDumyTest() {
		//테스트 코드...
		//테스트 코드의 반환은 반드시 void이어야 할 것.
		log.info("memberInsert() start");
		MemberDTO dto = new MemberDTO();
		for(int i = 0; i < 100; i++) {
			dto.setM_id("_test_id" + i);
			dto.setM_pw("_test_pw" + i);
			dto.setM_address("_test_address" + i);
			mapper.memberInsert(dto);
		}
		log.info("memberInsert() end");
	}
	
	public void memberReadTest() {
		MemberDTO dto = mapper.memberRead("4");
		log.info(dto);
	}
	
	//@Test
	public void memberUdateTest() {
		MemberDTO dto = new MemberDTO();
		dto.setM_no(10);
		dto.setM_address("testAddress");
		mapper.memberUpdate(dto);
		
		MemberDTO ddto1 = mapper.memberRead("10");
		log.info(ddto1);
	}
	
	@Test
	public void dummyMemberInsert() {
		for(int i = 1; i <= 100; i++) {
			MemberDTO dto = new MemberDTO(); 
			dto.setM_id("user" + i);
			dto.setM_pw("" + i);
			dto.setM_address("대구");
			mapper.memberInsert(dto);
		}
	}

}