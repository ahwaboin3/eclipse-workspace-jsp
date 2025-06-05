<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 첨부형 게시판</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
<style type="text/css">
#errMsg{
	color:red;
	text-align: right;
}
</style>
</head>
<body>
<div class="container">
	<h2>글쓰기</h2>
	<form method="post" enctype="multipart/form-data">
		<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">
				작성자
			</span>
			<input type="text" class="form-control" 
				aria-describedby="basic-addon1"
				name="name"
				id="nameInput">
		</div>
		<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">
				제목
			</span>
			<input type="text" class="form-control" 
				aria-describedby="basic-addon1"
				name="title"
				id="titleInput">
		</div>
		<div class="input-group">
			<span class="input-group-text">
				내용
			</span>
			<textarea class="form-control" 
			aria-label="With textarea" rows="10"
			name="content"
			id="contentInput"></textarea>
		</div>
		<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">
				첨부 파일
			</span>
			<input type="file" class="form-control" 
				aria-describedby="basic-addon1"
				name="ofile">
		</div>
		<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">
				비밀번호
			</span>
			<input type="password" class="form-control" 
				aria-describedby="basic-addon1"
				name="pass"
				id="passInput">
		</div>
		<div>
			<span id="errMsg"></span>
		</div>
		<div class="input-group d-md-flex justify-content-md-end">
			<button type="reset" 
				class="btn btn-outline-secondary" 
				>목록</button>
			<input type="reset" 
				class="btn btn-outline-secondary" 
				value="다시 쓰기"/>
			<input type="submit"
				class="btn btn-outline-secondary" 
				value="글쓰기"
				id="submitBtn"/>
		</div>
	</form>
</div>
<script type="text/javascript">
	const submitBtn=document.querySelector("#submitBtn")
	const errMsg=document.querySelector("#errMsg")
	const nameInput=document.querySelector("#nameInput")
	const titleInput=document.querySelector("#titleInput")
	const contentInput=document.querySelector("#contentInput")
	const passInput=document.querySelector("#passInput")
	submitBtn.addEventListener("click",(e)=>{
		if(nameInput.value.trim()==""){
			errMsg.textContent="작성자를 입력하세요."
			e.preventDefault()
		}
		if(titleInput.value.trim()==""){
			errMsg.textContent="제목을 입력하세요."
			e.preventDefault()
		}
		if(contentInput.value.trim()==""){
			errMsg.textContent="내용을 입력하세요."
			e.preventDefault()
		}
		if(passInput.value.trim()==""){
			errMsg.textContent="비밀번호를 입력하세요."
			e.preventDefault()
		}
	})
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
</body>
</html>


