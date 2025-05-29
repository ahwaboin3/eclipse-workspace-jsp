<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- LoginForm.jsp -->
</head>
<body>
	<h2>로그인 페이지</h2>
	<%
		if(session.getAttribute("UserId")==null){
	%>
	<form action="../login" method="post">
		<div>
			아이디:<input type="text" name="userId" 
			id="userId" />
		</div>
		<div>
			비밀번호:<input type="password" name="userPw"
			id="userPw" />
		</div>
		<div>
			<input type="submit" value="로그인" id="sumBtn"/>
		</div>
	</form>
	<%}else{ %>
		<p><%=session.getAttribute("UserName") %> 
		회원님 로그인하셨습니다.</p>
	<%} %>
	<script type="text/javascript">
		const sumBtn=document.querySelector("#sumBtn");
		const userId=document.querySelector("#userId");
		const userPw=document.querySelector("#userPw");
		sumBtn.addEventListener("click",(e)=>{
			if(!userId.value){
				alert("아이디를 입력하세요.")
				e.preventDefault()
			}
			if(!userPw.value){
				alert("비밀번호를 입력하세요.")
				e.preventDefault()
			}
		});
	</script>
</body>
</html>






