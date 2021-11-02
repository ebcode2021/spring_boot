package com.kh.spring.querydsl;

import java.util.List;

import com.kh.spring.book.Book;
import com.kh.spring.member.Member;
import com.kh.spring.rent.Rent;
import com.kh.spring.rent.RentBook;
import com.querydsl.core.Tuple;

//우리가 작성하고자 하는건 여기에
public interface QueryDSLRepositoryCustom {
	List<Rent> whereAnd(String title, String userId);
	
	List<Rent> whereOr(String title, String userId);
	
	List<RentBook> fetchJoin();
	
	List<Rent> innerJoinProjections(String userId);
	
	List<Tuple> tuple(String userId);
	
	List<RentBook> thetaJoin();
	
	List<Book> orderBy();
	
	List<Tuple> groupBy();
	
	List<Member> subQuery();
	
	List<Book> dynamicBook(Book book);
	
	List<Member> dynamicQueryWithMember(String keyword, String tell);
	
}
