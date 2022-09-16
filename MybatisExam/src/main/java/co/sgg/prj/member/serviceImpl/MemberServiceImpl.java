package co.sgg.prj.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import co.sgg.prj.common.DataSource;
import co.sgg.prj.member.map.MemberMapper;
import co.sgg.prj.member.service.MemberService;
import co.sgg.prj.member.service.MemberVO;

public class MemberServiceImpl implements MemberService{
	private SqlSessionFactory sqlSessionFactory = DataSource.sqlSession();
	private MemberMapper map = sqlSessionFactory.openSession(true).getMapper(MemberMapper.class);
	
	@Override
	public List<MemberVO> memberSelectList() {
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		return map.memberInsert(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		return map.memberDelete(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		return map.memberUpdate(vo);
	}

	@Override
	public boolean isMemberId(String id) {
		return map.isMemberId(id);
	}

}
