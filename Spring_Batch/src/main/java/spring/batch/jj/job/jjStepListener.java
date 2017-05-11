package main.java.spring.batch.jj.job;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.stereotype.Component;

@Component
public class jjStepListener implements StepExecutionListener {

	StepExecution arg0;

	@Override
	public ExitStatus afterStep(StepExecution arg0) {
		// TODO Auto-generated method stub
		System.out.println("After Step: " + arg0);
		if (arg0.getExitStatus().getExitCode().equals(ExitStatus.FAILED.getExitCode())) {
			return new ExitStatus("JJ Exit");
		}
		System.out.println("Execution Context after execution: "+arg0.getExecutionContext());
		return ExitStatus.COMPLETED;
	}

	@Override
	public void beforeStep(StepExecution arg0) {
		// TODO Auto-generated method stub
		System.out.println("Before Step: " + arg0);
//		this.arg0 = arg0;
//		ExecutionContext stepContext = this.arg0.getExecutionContext();
//		stepContext.put("jjvalue", "This is jjvalue passing to the normal step");

	}

}
