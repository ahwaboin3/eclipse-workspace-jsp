package test;

import dao.MemberDAO;
import dto.MemberDTO;

public class TestMain {
	public static void main(String[] args) {
		MemberDAO mdao=new MemberDAO();
		MemberDTO md=mdao.getMembers("musthave", "1234");
//		MemberDTO md=mdao.getMembers("musthave1", "1234");
		if(md.getId()!=null) {
			System.out.println("로그인 성공");
			System.out.println(md);
		}else {
			System.out.println("로그인 실패");
		}
	}

}
