<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 첨부형 게시판</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
	<h2>파일 첨부형 게시판 - 목록 보기</h2>
	<div class="d-grid d-md-flex justify-content-md-end">
		<a class="btn btn-outline-dark" 
		href="./write.do" role="button">글쓰기</a>
	</div>
	<form method="get" action="./">
		<div class="input-group flex-nowrap">
			<span class="input-group-text" id="addon-wrapping">제목 검색</span>
			<input name="searchTitle" 
				type="text" class="form-control" placeholder="검색어 입력" aria-label="searchTitle" aria-describedby="addon-wrapping">
			<input class="btn btn-outline-secondary" type="submit" id="button-addon2" value="검색"/>	
		</div>
	</form>
	<table class="table table-striped">
	  <thead>
	    <tr>
	      <th scope="col">번호</th>
	      <th scope="col">제목</th>
	      <th scope="col">작성자</th>
	      <th scope="col">조회수</th>
	      <th scope="col">작성일</th>
	      <th scope="col">첨부</th>
	    </tr>
	  </thead>
	  <tbody>
	  	<c:forEach items="${boards }" var="board">
		    <tr>
		      <th scope="row">${board.idx }</th>
		      <td>
		      	<a href="./view.do?idx=${board.idx }"
		      		class="link-offset-2 link-offset-3-hover link-underline link-underline-opacity-0 link-underline-opacity-75-hover"
		      	>
		      		${board.title }
		      	</a>
		      </td>
		      <td>${board.name }</td>
		      <td>${board.visitcount }</td>
		      <td>${board.postdate }</td>
		      <td>${board.ofile }</td>
		    </tr>
	  	</c:forEach>
	  </tbody>
	</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
</body>
</html>