package com.jeffgomez.bookclub.controllers;



import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.jeffgomez.bookclub.services.BookService;
import com.jeffgomez.bookclub.services.UserService;

@Controller
public class MainController {
	
	public final UserService userServ;
	public final BookService bookServ;
	public MainController(UserService userServ,BookService bookServ) {
		this.userServ = userServ;
		this.bookServ = bookServ;
	
	}
	@GetMapping("/")
	public String redirectLogin() {
		return "redirect:/user/";
	}
	
@GetMapping("/dashboard")
public String dashboard(HttpSession session, Model model) {
	if(session.getAttribute("user_id") == null) {
		return "redirect:/";
	}
	
	model.addAttribute("allBooks", bookServ.allBooks());
	model.addAttribute("user", userServ.getUser((Long)session.getAttribute("user_id")));
	return "/main/dashboard.jsp";
}
@GetMapping("/logout")
public String logout(HttpSession session) {
	session.invalidate();
	return "redirect:/";
	}
}
	
//	// ==== Display =================
//	@GetMapping("/")
//	public String index(Model model, HttpSession session) {
//		if (session.getAttribute("user_id") != null) {
//			return "redirect:/home";
//		}
//		model.addAttribute("newUser", new User());
//		model.addAttribute("newLogin", new LoginUser());
//		return "index.jsp";
//	}
//	
//	@GetMapping("/home")
//	public String home(Model model, HttpSession session) {
//		Long id = (Long) session.getAttribute("user_id");
//		if (session.getAttribute("user_id") == null) {
//			return "redirect:/";
//		}
//		User user = userServ.getUser(id);
//		model.addAttribute("loggedInUser", user);
//		
//		List<Book> allBooks = bookServ.allBooks();
//		model.addAttribute("allBooks", allBooks);
//		
//		return "dashboard.jsp";
//	}
//
//	// ==== Action ============
//	
//	@PostMapping("/register")
//	public String register(@Valid @ModelAttribute("newUser") User newUser, 
//			BindingResult result, Model model, HttpSession session) {
//		userServ.register(newUser, result);
//		if(result.hasErrors()) {
//			model.addAttribute("newLogin", new LoginUser());
//			return "index.jsp";
//		}
//		session.setAttribute("user_id", newUser.getId());
//		return "redirect:/home";
//	}
//
//    @PostMapping("/login")
//    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
//            BindingResult result, Model model, HttpSession session) {
//        User user = userServ.login(newLogin, result);
//        if(result.hasErrors()) {
//            model.addAttribute("newUser", new User());
//            return "index.jsp";
//        }
//        session.setAttribute("user_id", user.getId());
//        return "redirect:/home";
//    }
//    
//
//
//}
