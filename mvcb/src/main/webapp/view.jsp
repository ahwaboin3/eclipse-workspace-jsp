<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 첨부형 게시판</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
<div class="container text-center">
	<h2> 파일 첨부형 게시판 - 상세보기</h2>
	<figure class="figure">
		<c:if test="${bDto.ofile!=null }">
			<img src="files/${bDto.sfile }" 
			class="figure-img img-fluid rounded" 
			alt="첨부 사진" />
		</c:if>
			<figcaption class="figure-caption">
				번호:${bDto.idx}
			</figcaption>
			<figcaption class="figure-caption">
				작성자:${bDto.name}
			</figcaption>
			<figcaption class="figure-caption">
				조회수:${bDto.visitcount}
			</figcaption>
			<figcaption class="figure-caption">
				제목:${bDto.title}
			</figcaption>
			<figcaption class="figure-caption">
				내용:${bDto.content}
			</figcaption>
		</figure>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
</body>
</html>