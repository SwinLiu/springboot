package com.lyplay.springboot.response;

public class SimpleResponse implements Response {

	private static final long serialVersionUID = -8541822221246479358L;

	/**
	 * Success Flag
	 */
	private boolean success;

	/**
	 * Message
	 */
	private String message;

	public SimpleResponse() {

	}

	public SimpleResponse(boolean success) {
		this.success = success;
		if (!success) {
			this.message = "System error";
		}
	}

	public SimpleResponse(boolean success, String message) {
		this.success = success;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SimpleResponse [success=" + success + ", message=" + message + "]";
	}

}
