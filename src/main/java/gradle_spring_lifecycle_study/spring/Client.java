package gradle_spring_lifecycle_study.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client implements InitializingBean, DisposableBean {
	private String host;

	@Override
	public void destroy() throws Exception {
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	}

}
