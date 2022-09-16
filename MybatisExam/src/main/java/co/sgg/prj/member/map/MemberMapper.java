package co.sgg.prj.member.map;

import java.util.List;

import co.sgg.prj.member.service.MemberVO;

public interface MemberMapper {
	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
	
	boolean isMemberId(String id);
}
