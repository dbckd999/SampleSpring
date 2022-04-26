package org.sample.project.sevice;

import java.util.List;

import org.sample.project.model.BoardDTO;

public interface BoardService {
	void boardInsert(BoardDTO dto);
	List<BoardDTO> showMainBoard();
}
