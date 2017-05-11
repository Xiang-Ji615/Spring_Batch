package main.java.spring.batch.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
public class Report {

	private int id;
	private String Impressions;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImpressions() {
		return Impressions;
	}

	public void setImpressions(String impressions) {
		Impressions = impressions;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", Impressions=" + Impressions + "]";
	}

}