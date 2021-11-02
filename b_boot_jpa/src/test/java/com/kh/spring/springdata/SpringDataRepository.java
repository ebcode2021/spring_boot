package com.kh.spring.springdata;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kh.spring.book.Book;

public interface SpringDataRepository extends JpaRepository<Book, Long>{
	
	//도서명 또는 작가로 도서 검색
	List<Book> findByTitleOrAuthor(String title, String author);
	
	//카테고리가 문학이고, 도서 재고가 3권 이상이면서 도서명이 디로 시작하는 도서를 조회 (int book amt랑 title만 조건으로 걸면 또 잘나와요넹..)
	List<Book> findByCategoryContainingAndBookAmtGreaterThanEqualAndTitleStartingWith(String category, int bookAmt, String title);

	List<Book> findByBookAmtGreaterThanEqualAndTitleStartingWith(int bookAmt, String title);
	List<Book> findByTitleStartingWith(String title);
	
	int countByBookAmtGreaterThanEqual(int bookAmt);
	
	boolean existsByBookAmtGreaterThanEqual(int bookAmt);
	
	void deleteByTitle(String title);
	
}
