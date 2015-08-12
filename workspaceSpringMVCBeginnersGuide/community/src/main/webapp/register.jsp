<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>Community Main Page</title>
</head>
<body>
<div id="outer">
	<div id="upbg"></div>
	<div id="inner">
		<div id="header">
			<h1><span>Simple Community</span></h1>
			<h2>By Community group</h2>
		</div>
		<div id="splash"></div>
		<div id="menu"></div>
		<div id="primarycontent">
			<div class="post">
				<div class="header">
					<h3>Personal Information</h3>
					<div class="date"></div>
				</div>
				<div class="content">
					<form action="process_register.jsp" method="post">
						<table id="userInfo_table">
						
							<tr>
								<td><label>User Name</label></td>
								<td><input type="text" name="userName" class="textInput"/></td>
							</tr>
							<tr>
								<td><label>Gender</label></td>
								<td><select name="gender">
									<option value="m" selected="selected">male</option>
									<option value="f">female</option>
								</select></td>
							</tr>
							<tr>
								<td><label>Real Name</label></td>
								<td><input type="text" name="realName" class="textInput"/></td>
							</tr>
							<tr>
								<td><label>Password</label></td>
								<td><input type="password" name="password" class="textInput"/></td>
							</tr>
							<tr>
								<td><label>Age</label></td>
								<td><input type="text" name="age" class="textInput"></td>
							</tr>
							<tr>
								<td><label>Your Signature</label></td>
								<td><textarea rows="3" cols="18" name="personalSignature"></textarea></td>
							</tr>
							<tr>
								<td align="left"><input type="submit" value="Register" /></td>
							</tr>
						</table>
					</form>
				</div>
				<div class="footer">
					<ul>
						<li class="readmore"><a href="login.jsp">Back</a></li>
					</ul>
				
				</div>
			</div>
			<!-- primary content end -->
		</div>
		<div id="footer">
			&copy; Community Group. All rights reserved. Design by Community Group
		</div>
	</div>
</div>

</body>
</html>