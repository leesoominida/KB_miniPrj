package com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jdbc.domain.Evaluation;
import com.jdbc.domain.Store;
import com.jdbc.domain.User;
import com.jdbc.exception.DuplicateTargetException;
import com.jdbc.exception.RecordNotFoundException;

public interface UserDAO {
	Connection getConnect() throws SQLException;
	void closeAll(Connection conn, PreparedStatement ps) throws SQLException;
	void closeAll(Connection conn, PreparedStatement ps, ResultSet rs)throws SQLException;
	//나는 이원근
	//이용자 공통 기능
	//회원가입
	void insertUser(User vo) throws SQLException, DuplicateTargetException;
	//회원삭제
	void deleteMember(int userNum) throws SQLException, RecordNotFoundException; 
	//비밀번호 변경
	void updatePassword(User vo) throws SQLException;
	//개인 회원정보 조회
	User getUser(int userNum) throws SQLException;
	
	
	//사장님 기능
	//음식점 등록
	void insertStore(Store vo) throws SQLException, DuplicateTargetException;
	//음식점 정보 수정
	void updateStore(Store vo) throws SQLException;
	//음식점 오픈 상태 변경
	void updateStore(int open) throws SQLException;
	//음식점 메뉴 가격 정보 수정
	void updateStore(int minprice, int maxprice) throws SQLException;
	//음식점 삭제
	void deleteStore(int storeNum) throws SQLException, RecordNotFoundException;
	
	//손님 기능
	//음식점 평가 남기기
	void insertEval(Evaluation vo) throws SQLException;
	//음식점 평점 수정
	void updateEval(float score) throws SQLException;
	//음식점 후기 수정
	void updateEval(String review) throws SQLException;
	//음식점 평가 삭제
	void deleteEval(Evaluation vo) throws SQLException;
	
	//음식점의 평점을 보여줌
	//정렬되지 않은 음식점 리스트
	ArrayList<Store> getStore() throws SQLException;
	//음식점 이름을 통한 검색
	ArrayList<Store> getStore(String name) throws SQLException;
	//지정 평점 이상 음식점 조회
	ArrayList<Store> getStore(float score) throws SQLException;
	//음식점 카테고리별 조회
	ArrayList<Store> getStore(int categoryNum) throws SQLException;
	
	//음식점 평점 순 조회
	ArrayList<Store> getStoreByScore() throws SQLException;

	//음식점 리뷰 많은 순 조회
	ArrayList<Store> getStoreByReview() throws SQLException;
	
	//음식점 지역 별 조회
	ArrayList<Store> getStoreByLoc(String location) throws SQLException;

}
