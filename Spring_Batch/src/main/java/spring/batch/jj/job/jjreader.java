package main.java.spring.batch.jj.job;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class jjreader implements ItemReader<User>, InitializingBean {

	List<User> users = new ArrayList<User>();
	int next = 0;


	@Override
	public User read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		// TODO Auto-generated method stub
		User ret = null;
		if (next < users.size()) {
			ret = users.get(next);
			next++;
		}
		if(next%10 == 1){
			ret = null;
		}
		return ret;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			users.add(new User("Username: " + i, "Password: " + i));
		}
	}
	
	

}
