window.onload = function() {
	var reset = document.getElementById('reset');
	var fm = document.getElementsByTagName('form')[0];
	var stuAddMess = document.getElementById('stuAddMess');
	reset.onclick = function() {
		username.value = '';
		password.value = '';
		confirmpass.value = '';
		code.value = '';
		username.focus();
	};
	fm.onsubmit = function() {
		if (!/^\w{6,20}$/.test(username.value)) {// 用户名验证
			stuAddMess.innerHTML = "* 用户名不合法！";
			username.value = '';
			username.focus();
			return false;
		}
		if (!/^\w{6,20}$/.test(password.value)) {// 密码验证
			stuAddMess.innerHTML = "* 密码不合法！";
			password.value = '';
			password.focus();
			return false;
		}
		if (password.value != confirmpass.value) {// 密码确认验证
			stuAddMess.innerHTML = "* 两次输入的密码不一致，请重新输入！";
			password.value = '';
			confirmpass.value = '';
			password.focus();
			return false;
		}

		if (!/^\d{4}$/.test(code.value)) {// 验证码验证
			stuAddMess.innerHTML = "* 验证码错误！";
			code.value = '';
			code.focus();
			return false;
		}
		return true;
	};
};


