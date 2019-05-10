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
		// ����sessionʱ���ô˷���(��һ���������ʱ�򴴽���һ��session����)
		OnlineCounter.raise();
		ServletContext app = e.getSession().getServletContext(); // ��վ������ͳ��,app��application����
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
