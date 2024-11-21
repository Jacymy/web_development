package springmvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc.entity.User;

@Controller
public class UserController {

	//跳转登陆页面
	@RequestMapping(value="/loginview.do")
	public String toLogin(Model model) {
		model.addAttribute("msg","您还没有登录");
		return "login";
	}
	//执行登陆操作
	@RequestMapping(value="/login.do")
	public String login(User user,Model model,HttpSession session) {
		// 获取用户名和密码
		String username = user.getUsername();
		String password = user.getPassword();
		if(username!=null && username.equals("admin") && password.equals("123")) {
			session.setAttribute("USER_SESSION",user);
			return "redirect:home.do";
		}
		model.addAttribute("msg","用户名或密码错误,请重新登录");
		return "login";
	}

	//进入主页
	@RequestMapping(value="/home.do")
	public String toMain(){
		return "home";
	}

	//退出登陆操作
	@RequestMapping(value="/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:loginview.do";
	}
}
