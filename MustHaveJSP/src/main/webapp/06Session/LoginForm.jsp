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
	<form>
		<div>
			아이디:<input type="text" name="userId" 
			id="userId" />
		</div>
		<div>
			비밀번호:<input type="password" name="userPw"/>
		</div>
		<div>
			<input type="submit" value="로그인" id="sumBtn"/>
		</div>
	</form>
	<script type="text/javascript">
		const sumBtn=document.querySelector("#sumBtn");
		const userId=document.querySelector("#userId");
		sumBtn.addEventListener("click",()=>{
			if(!userId.value){
				alert("아이디를 입력하세요.")
			}
		});
	</script>
</body>
</html>






