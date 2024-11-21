package springmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
	/**
	 * 模拟请求被多次拦截
	 */
	@RequestMapping("/hello.do")
	public String Hello(Model model) {
		System.out.println("Hello,请求被多次拦截");
		model.addAttribute("msg","Hello,请求被多次拦截(全局拦截器UserInterceptor和指定拦截器MyInterceptor)!");
		return "index.jsp";
	}
	/**
	 * 模拟拦截器对请求放行
	 */
	@RequestMapping("/hello1.do")
	public String Hello1(Model model) {
		System.out.println("Hello,请求被多次拦截");
		model.addAttribute("msg","Hello,请求仅被全局拦截UserInterceptor拦截,指定拦截器MyInterceptor放行!");
		return "index.jsp";
	}
}

