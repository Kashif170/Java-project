package com.Controller;
import com.Dao.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.CouponDoa;
import com.Dao.ProductDao;
import com.createcoupon.CreateProduct;
import com.createcoupon.module.Coupon;
@WebServlet("/name")
public class ProductController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final int id = 0;
	CouponDoa dao = new CouponDoa();
	ProductDao pd = new ProductDao();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		String discription = req.getParameter("description");
		String price = req.getParameter("price");
		
		Coupon cp = dao.findByCode(name);
		CreateProduct product = new CreateProduct();
		System.out.println(cp);
		
		product.setName(name);
		product.setDescription(discription);
		product.setPrice(new BigDecimal(price));
		
		pd.save(product);
		resp.setContentType("text/html");	
		PrintWriter out = resp.getWriter();
		out.print("<b>Product Created</b>");
		out.println(pd);
		out.print("<br/><a href='/CandyAPP'>Home</a>");
		
	}
	
	
		}


