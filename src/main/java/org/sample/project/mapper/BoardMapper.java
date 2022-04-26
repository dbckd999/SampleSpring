package org.sample.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.sample.project.model.BoardDTO;

@Mapper
public interface BoardMapper {
	public void boardInsert(BoardDTO dto);
	public List<BoardDTO> showAllBoard();
	public BoardDTO aContent(String b_no);
	public void aContentUpdate(BoardDTO dto);
	public void aContentDelete(String b_no);
}
