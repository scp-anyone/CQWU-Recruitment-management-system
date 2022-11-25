window.onload = function() {
	var title = document.title;
	var menu = document.getElementById('menu');
	var items = menu.getElementsByTagName('a');
	for (var i = 0; i < items.length; i++) {
		if (title == items[i].innerHTML) {
			items[i].className = "checked";
		}
	}
	var fm = document.getElementsByTagName('form')[0];
	var addMess = document.getElementById('addMess');
	var reset = document.getElementById('reset');
	reset.onclick = function() {
		adminname.value = '';
		adminpass.value = '';
		adminname.focus();
	};

	fm.onsubmit = function() {
		if (!/^\w{6,20}$/.test(adminname.value)) {
			addMess.innerHTML = "* 用户名不合法！";
			adminname.value = "";
			adminname.focus();
			return false;
		}
		if (!/^\w{6,20}$/.test(adminpass.value)) {
			addMess.innerHTML = "* 密码不合法！";
			adminpass.value = '';
			adminpass.focus();
			return false;
		}
		return true;
	};
};
