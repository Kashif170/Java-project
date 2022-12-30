package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.Dao.CouponDoa;
import com.createcoupon.module.Coupon;

@WebServlet("/coupons")
public class CouponController extends HttpServlet {

	private CouponDoa dao = new CouponDoa();

	public CouponController() {
		super();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String pr = req.getParameter("action");
		if (pr.equals("create")) {
			createCoupon(req, resp);

		} else if (pr.equals("find")) {
			String code = req.getParameter("couponcode");
			Coupon code1 = dao.findByCode(code);
			if (code1 != null) {
				resp.setContentType("text/html");
				PrintWriter out = resp.getWriter();
				out.print("<br>find coupon Success </br>" + code1);
			}
		}
	}

	private void createCoupon(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// req.getParameter(id);
		String cp1 = req.getParameter("coupon_code");
		String ds = req.getParameter("Discount");
		String exd = req.getParameter("ExpDate");
		Coupon cp = new Coupon();
		cp.setCoupon_code(cp1);
		cp.setDiscount(new BigDecimal(ds));
		cp.setExpDate(exd);
		dao.save(cp);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<b>Coupon Created!!</b>");
		out.print("<br/><a href='/CandyAPP'>Home</a>");
	}

}
