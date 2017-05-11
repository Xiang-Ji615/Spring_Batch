package main.java.spring.batch.jj.job;

import java.util.List;

import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

@Component
public class jjwriter implements ItemWriter<User>{

	StepExecution stepExecution;
	
	@Override
	public void write(List<? extends User> items) throws Exception {
		// TODO Auto-generated method stub
//		 ExecutionContext stepContext = this.stepExecution.getExecutionContext();
//	     stepContext.put("jjvalue", "OK, new value passed");
//	     System.out.println(stepContext);
		for(User user : items){
			System.out.println(user);
		}
		System.out.println("JJ Wirter works");
	}
	
	@BeforeStep
	 public void saveStepExecution(StepExecution stepExecution) {
        this.stepExecution = stepExecution;
    }


}
