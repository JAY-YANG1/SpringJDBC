package jaemukyang.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jaemukyang.spring.dao.MemberDAO;
import jaemukyang.spring.vo.Member;

@Service("msrv")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO mdao;

	@Override
	public void newMember() {
		Member m = new Member("xyz987", "abc123", "혜교", "abc@xyz.com");
		
		mdao.insertMember(m);
		
		System.out.println("회원가입 완료");
		
	}

	@Override
	public void readAllMember() {
		StringBuffer sb = new StringBuffer();
		
		List<Member> ms = mdao.selectAllMember();
		for( Member m: ms ) {
			sb.append(m);
		}
		System.out.println(sb);
		
	}

	@Override
	public void readOneMember(int mno) {
		Member m = mdao.selectOneMember(mno);
		
		System.out.println(m);
		
	}

	@Override
	public void modifyMember() {
		Member m = new Member("5", null, "123456", "수지","xyz@abc.com", null);
		
		mdao.updateMember(m);
	}

	@Override
	public void removeMember() {
		mdao.deleteMember(5);
	}

	
}
