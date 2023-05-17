package com.ssafy.house.board.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.house.board.model.BoardDto;
import com.ssafy.house.board.model.BoardParameterDto;



@Mapper
public interface BoardMapper {
	
	public int writeArticle(BoardDto boardDto) throws SQLException;
	public List<BoardDto> listArticle(BoardParameterDto boardParameterDto) throws SQLException;
	public int getTotalCount(BoardParameterDto boardParameterDto) throws SQLException;
	public BoardDto getArticle(int articleno) throws SQLException;
	public void updateHit(int articleno) throws SQLException;
	public int modifyArticle(BoardDto boardDto) throws SQLException;
	public int deleteArticle(int articleno) throws SQLException;
	
}