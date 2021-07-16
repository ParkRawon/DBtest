package co.prw.prj.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.prw.prj.service.MemberService;
import co.prw.prj.serviceImpl.MemberServiceImpl;
import co.prw.prj.vo.MemberVO;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	private MemberService dao = new MemberServiceImpl();

	private void menuTitle() {
		System.out.println("===========================");
		System.out.println("======회원정보 관리 시스템=======");
		System.out.println("======1. 회원 목록 조회========");
		System.out.println("======2. 회원 정보 조회========");
		System.out.println("======3. 회원 정보 등록========");
		System.out.println("======4. 회원 정보 수정========");
		System.out.println("======5. 회원 정보 삭제========");
		System.out.println("======6. 종료 ========");
		System.out.println("==========================");
		System.out.println("====원하는 작업번호를 선택하세요.===");

	}

	private void mainMenu() {
		int jobNo;
		boolean b = false;

		do {
			menuTitle();
			switch (jobNo = sc.nextInt()) {
			case 1:
				memberSelectList();
				break;
			case 2:
				memberSelect();
				break;
			case 3:
				memberInsert();
				break;
			case 4:
				memberUpdate();
				break;
			case 5:
				memberDelete();
				break;
			case 6:
				b = true;
				System.out.println("== Bye Bye ==");
				break;
			}
		} while (!b);
	}

	private void memberDelete() {
		// TODO 회원 정보 삭제(아이디 필요)
		MemberVO vo = new MemberVO();
		System.out.println("삭제할 id입력>>");
		vo.setId(sc.next());
		int n = dao.memberDelete(vo);
		if (n != 0) {
			System.out.println("정상적으로 삭제 되었습니다.");
		} else {
			System.out.println("삭제 실패!!");
		}
		
		
		
	}

	private void memberUpdate() {
		// TODO 회원 정보 수정(아이디, 주소,전화번호,이름)
		MemberVO vo = new MemberVO();
		System.out.println("수정할 id 입력>>");
		vo.setId(sc.next());
		sc.nextLine();
		System.out.println("새로운 주소입력>>");
		vo.setAddress(sc.next());
		sc.nextLine();
		System.out.println("새로운 전화번호입력>>");
		vo.setTel(sc.next());
		sc.nextLine();
		System.out.println("새로운이름 입력>>");
		vo.setName(sc.next());
		sc.nextLine();
		int n = dao.memberUpdate(vo);
		if(n != 0) {
			System.out.println("정상적으로 수정되었습니다");
		} else {
			System.out.println("수정실패!!");
		}
		
		
	}

	private void memberInsert() {
		// TODO 데이터추가하기
		MemberVO vo = new MemberVO();
		System.out.println("id 입력>>");
		vo.setId(sc.next());
		sc.nextLine();
		System.out.println("password 입력>>");
		vo.setPassword(sc.next());
		sc.nextLine();
		System.out.println("이름 입력>>");
		vo.setName(sc.next());
		sc.nextLine();
		System.out.println("주소 입력>>");
		vo.setAddress(sc.next());
		sc.nextLine();
		System.out.println("전화번호 입력>>");
		vo.setTel(sc.next());
		sc.nextLine();
		System.out.println("나이 입력>>");
		vo.setAge(sc.nextInt());
		
		int n = dao.memberInsert(vo);
		if(n!=0) {
			System.out.println("정상적으로 입력되었습니다.");
		} else {
			System.out.println("입력실패!");
		}
		
		
	}

	private void memberSelect() {
		// TODO 회원 조회
		MemberVO vo = new MemberVO();
		System.out.println("검색할 id입력>>>");
		vo.setId(sc.next());
		sc.nextLine();
		vo = dao.memberSelect(vo);
		vo.toString();
		
	}

	private void memberSelectList() {
		// TODO 회원전체목록조회
		List<MemberVO> members = new ArrayList<MemberVO>();
		members = dao.memberSelectList();
		for(MemberVO member : members) {
			member.toString();
		}		
	}
	public void run() {
		mainMenu();
		sc.close();
	}

}
