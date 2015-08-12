package com.Sophia.web.hibernate.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Sophia.web.hibernate.bean.Cat;
import com.Sophia.web.hibernate.dao.BaseDAO;

public class CatServlet extends HttpServlet {
	
	
	private BaseDAO<Cat> baseDAO= new BaseDAO();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		String action=req.getParameter("action");
		if("initAdd".equals(action)){
			initAdd(req, resp);
		}else if("add".equals(action)){
			add(req, resp);
		}else if("edit".equals(action)){
			edit(req, resp);
		}else if("save".equals(action)){
			save(req, resp);
		}else if("view".equals(action)){
			view(req, resp);
		}else if("list".equals(action)){
			list(req, resp);
		}else if("delete".equals(action)){
			delete(req, resp);
		}else {
			list(req, resp);
		}
	}

	private void delete(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}

	protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setAttribute("catList", baseDAO.list(" from cat"));
		req.getRequestDispatcher("/listCat.jsp").forward(req, resp);
		
	}

	private void view(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}

	private void save(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}

	private void edit(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}

	protected void add(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}

	protected void initAdd(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}
	
}
