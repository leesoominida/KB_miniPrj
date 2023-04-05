package com.jdbc.domain;

import java.util.Date;

public class Evaluation {
	private int evalNum;
	private float score;
	private String review;
	private Date date;
	
	public Evaluation() {
		super();
		}

	public Evaluation(int evalNum, int score, String review, Date date) {
		super();
		this.evalNum = evalNum;
		this.score = score;
		this.review = review;
		this.date = date;
	}

	public int getEvalNum() {
		return evalNum;
	}

	public void setEvalNum(int evalNum) {
		this.evalNum = evalNum;
	}

	

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "evaluation [evalNum=" + evalNum + ", score=" + score + ", review=" + review + ", date=" + date + "]";
	}

	
	
}
