package com.message.api;

import java.time.LocalDate;

public class Message {

	private String receiverName;

	private String senderName;

	private String message;

	private LocalDate date;

	private Status status;

	public Message() {

	}

	public Message(String receiverName, String senderName, String message, LocalDate date, Status status) {
		super();
		this.receiverName = receiverName;
		this.senderName = senderName;
		this.message = message;
		this.date = date;
		this.status = status;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
