package de.privalino.telegram.model;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class PrivalinoPopUp {
	
	private long id;
	private String question;
	private String[] answerOptions;
	
	public PrivalinoPopUp(){
		this.id = new Date().getTime();
	}
	
	public long getId() {
		return id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String[] getAnswerOptions() {
		return answerOptions;
	}
	public void setAnswerOptions(String... answerOptions) {
		this.answerOptions = answerOptions;
	}
	
	@Override
	public String toString()
	{
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		buffer.append(this.getClass().getSimpleName());
		buffer.append("]");

		buffer.append("\tId: " + getId());

		if(getQuestion() != null){
			buffer.append("\tQuestion: " + getQuestion());
		}

		if(getAnswerOptions() != null){
			buffer.append("\tAnswerOptions: " + StringUtils.join(getAnswerOptions(), ", "));
		}

		return buffer.toString();
	}


}
