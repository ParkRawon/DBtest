package co.prw.prj.service;

import java.util.List;

import co.prw.prj.vo.MemberVO;

public interface MemberService {  //질문지
	List<MemberVO> memberSelectList();  //전제리스트 가져오기
    MemberVO memberSelect(MemberVO vo);  //한개리스트 가져오기
    int memberInsert(MemberVO vo);
    int memberDelete(MemberVO vo);
    int memberUpdate(MemberVO vo);


}
