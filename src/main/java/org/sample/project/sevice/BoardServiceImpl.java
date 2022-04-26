package org.sample.project.sevice;

import java.util.List;

import org.sample.project.mapper.BoardMapper;
import org.sample.project.model.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void boardInsert(BoardDTO dto) {
		// TODO Auto-generated method stub
		mapper.boardInsert(dto);
	}

	@Override
	public List<BoardDTO> showMainBoard() {
		// TODO Auto-generated method stub
		return mapper.showAllBoard();
	}

}
