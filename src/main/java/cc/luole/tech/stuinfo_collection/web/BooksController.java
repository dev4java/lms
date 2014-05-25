package cc.luole.tech.stuinfo_collection.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cc.luole.tech.stuinfo_collection.core.download.DownLoadService;
import cc.luole.tech.stuinfo_collection.core.service.DownloadStuService;

@Controller
@RequestMapping("/lms/books")
public class BooksController extends BaseController{
	
	@Autowired
	public DownLoadService  downLoadService ;
	
	@Autowired
	public DownloadStuService downloadStuService;
	
	/** serialVersionUID*/
	private static final long serialVersionUID = 1L;
	
	//TODO login 代码冗余 考虑配置过滤器
	
	@RequestMapping("/list")
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		if(!isLogin()){
			
			return this.getLogin();
		}
		ModelAndView model = new ModelAndView();
		model.setViewName("/admin/books/list");
		return model;
	}
	
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		if(!isLogin()){
			
			return this.getLogin();
		}
		ModelAndView model = new ModelAndView();
		model.setViewName("/admin/books/add");
		return model;
	}
	
	@RequestMapping("/add")
	public ModelAndView addPost(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		if(!isLogin()){
			
			return this.getLogin();
		}
		ModelAndView model = new ModelAndView();
		String name= request.getParameter("name");
		String price= request.getParameter("price");
		String detil= request.getParameter("detil");
		String typeNo= request.getParameter("typeNo");
		String author= request.getParameter("author");
		String press= request.getParameter("press");
		String duplicate= request.getParameter("duplicate");
		
		
		
		return model;
	}
	
	
	
	@RequestMapping("/mod")
	public ModelAndView mod(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		if(!isLogin()){
			
			return this.getLogin();
		}
		ModelAndView model = new ModelAndView();
		model.setViewName("/admin/books/index");
		return model;
	}
	@RequestMapping("/detail")
	public ModelAndView detail(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		if(!isLogin()){
			
			return this.getLogin();
		}
		ModelAndView model = new ModelAndView();
		model.setViewName("/admin/books/detail");
		return model;
	}
	@RequestMapping("/del")
	public ModelAndView del(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		if(!isLogin()){
			
			return this.getLogin();
		}
		ModelAndView model = new ModelAndView();
		model.setViewName("/admin/books/del");
		return model;
	}


	
	
	
}
