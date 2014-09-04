package br.com.instead.smartpush.model;

public class SmartpushResponse {

	private int code;
	private String message;
	private String pushid;
	private PushResponse response;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPushid() {
		return pushid;
	}

	public void setPushid(String pushid) {
		this.pushid = pushid;
	}

	public PushResponse getResponse() {
		return response;
	}

	public void setResponse(PushResponse response) {
		this.response = response;
	}

	public boolean isOk() {
		return this.code % 100 == 2;
	}

	@Override
	public String toString() {
		return "SmartpushResponse [code=" + code + ", message=" + message
				+ ", pushid=" + pushid + ", response=" + response + "]";
	}

}
