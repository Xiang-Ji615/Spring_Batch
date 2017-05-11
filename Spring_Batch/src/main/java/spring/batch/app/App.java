package main.java.spring.batch.app;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:Spring.xml")
public class App implements CommandLineRunner {

//	@Autowired
//	JobLauncher jobLauncher;
//
//	@Autowired
//	Job helloWorldJob1;
//
//	public void setJobLauncher(JobLauncher jobLauncher) {
//		this.jobLauncher = jobLauncher;
//	}
//
//	public void setHelloWorldJob1(Job helloWorldJob1) {
//		this.helloWorldJob1 = helloWorldJob1;
//	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(App.class);
		app.run(args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("JJ Spring boot works");
	}

}
