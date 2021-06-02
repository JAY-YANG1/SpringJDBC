package jaemukyang.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jaemukyang.spring.service.MemberService;

public class MemberJdbcApp02 {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("springjdbc02.xml");
		
		MemberService msrv = (MemberService) ctx.getBean("msrv02");

		
		// 회원등록
		//msrv.newMember();
		
		// 회원 전체 조회
		//msrv.readAllMember();
		
		// 회원 상세 조회
		//msrv.readOneMember(4);
		
		// 회원 정보 수정
		//msrv.modifyMember();
		
		// 회원 정보 삭제
		msrv.removeMember();
	}

}
