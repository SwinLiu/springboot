package com.lyplay.springboot.response;

public class RichResponse<T> extends SimpleResponse {

	private static final long serialVersionUID = -8541822221246479358L;

	private T result;

	private int returnCode;

	public RichResponse() {
		super();
	}

	public RichResponse(boolean success) {
		super(success);
	}

	public RichResponse(boolean success, String message) {
		super(success, message);
	}

	public RichResponse(boolean success, T result) {
		this.setSuccess(success);
		this.result = result;
	}

	public RichResponse(boolean success, String message, int returnCode) {
		this.setSuccess(success);
		this.setMessage(message);
		this.returnCode = returnCode;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public int getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}

}
