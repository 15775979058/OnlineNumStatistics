package listeners;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import utils.OnlineCounter;

public class OnlineCounterListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent e) {
		// TODO Auto-generated method stub
		// 创建session时调用此方法(打开一个浏览器的时候创建了一个session对象)
		OnlineCounter.raise();
		ServletContext app = e.getSession().getServletContext(); // 网站访问量统计,app即application对象
		long count = 1;
		if (app.getAttribute("count") != null) {
			count = ((Long) app.getAttribute("count")).longValue() + 1;
			app.setAttribute("count", new Long(count));
		} else {
			app.setAttribute("count", new Long(count));
		}
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent e) {
		// TODO Auto-generated method stub
		OnlineCounter.reduce();
	}

}
