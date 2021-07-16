package co.prw.prj;

import java.util.ArrayList;
import java.util.List;

import co.prw.prj.app.Menu;
import co.prw.prj.service.MemberService;
import co.prw.prj.serviceImpl.MemberServiceImpl;
import co.prw.prj.vo.MemberVO;

public class MainApp {
	public static void main(String[] args) {
//		MemberService dao = new MemberServiceImpl(); // dao역활
//		List<MemberVO> list = new ArrayList<MemberVO>();
//		
//		list = dao.memberSelectList();
//		MemberVO vo = new MemberVO();
//		vo.setId("park");
//		vo.setPassword("4321");
//		vo.setName("박rr");
//		vo.setAddress("서울특별시");
//		vo.setTel("010-1112-4444");
//		vo.setAge(27);
//		
//		int n = dao.memberUpdate(vo);
//		if(n != 0 ) {
//			System.out.println("정상적으로 수정되었습니다");
//		} else {
//			System.out.println("수정에 실패했습니다");
//		}
		
		
		
		
//		vo = dao.memberSelect(vo);
		
//			System.out.print(vo.getId());
//			System.out.print(vo.getPassword());
//			System.out.print(vo.getName());
//			System.out.print(vo.getTel());
//			System.out.print(vo.getAddress());
//			System.out.println(vo.getAge());
//			MemberVO.toString(vo.toString());
		

		Menu menu = new Menu();
		menu.run();

	}
}
