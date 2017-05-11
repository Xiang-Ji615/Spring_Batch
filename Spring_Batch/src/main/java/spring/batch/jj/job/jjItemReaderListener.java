package main.java.spring.batch.jj.job;

import org.springframework.batch.core.ItemReadListener;

public class jjItemReaderListener implements ItemReadListener<User>{

	@Override
	public void beforeRead() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterRead(User item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onReadError(Exception ex) {
		// TODO Auto-generated method stub
		
	}

}
