package main.java.spring.batch.parallel.job.app;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(basePackages={"main.java"})
@ImportResource(locations={"classpath:SpringBatch.xml"})
public class App implements CommandLineRunner {

	@Autowired
	JobLauncher jobLauncher;
	
	@Autowired
	Job job;
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("Hello world");
//		jobLauncher.run(job, new JobParameters());
	}

	public static void main(String[] args) throws Exception {

		// disabled banner, don't want to see the spring logo
		SpringApplication app = new SpringApplication(App.class);
//		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);

	}

}
