package main.java.spring.batch.jj.job;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="step")
public class jjprocessor implements ItemProcessor<User, User> {

	@Value("#{stepExecutionContext[name]}")
	private String threadName;

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public String getThreadName() {
		return threadName;
	}

	@Override
	public User process(User item) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Thread: " + threadName);
		System.out.println(item);
//		if(item.username.contains("15")){
//			throw new Exception("JJ Exception");
//		}
		return item;
	}

}
