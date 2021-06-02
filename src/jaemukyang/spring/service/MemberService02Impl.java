package jaemukyang.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jaemukyang.spring.dao.MemberDAO;
import jaemukyang.spring.vo.Member;

@Service("msrv02")
public class MemberService02Impl implements MemberService {
	
	@Autowired
	private MemberDAO mdao02;

	@Override
	public void newMember() {
		Member m = new Member("xyz987", "abc123", "혜교", "abc@xyz.com");
		
		mdao02.insertMember(m);
		
		System.out.println("회원가입 완료");
		
	}

	@Override
	public void readAllMember() {
		StringBuffer sb = new StringBuffer();
		
		List<Member> ms = mdao02.selectAllMember();
		for( Member m: ms ) {
			sb.append(m);
		}
		System.out.println(sb);
		
	}

	@Override
	public void readOneMember(int mno) {
		Member m = mdao02.selectOneMember(mno);
		
		System.out.println(m);
		
	}

	@Override
	public void modifyMember() {
		Member m = new Member("4", null, "123456", "수지","xyz@abc.com", null);
		
		mdao02.updateMember(m);
	}

	@Override
	public void removeMember() {
		mdao02.deleteMember(4);
	}

	
}
