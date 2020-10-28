package pl.keruzam.cashflow.security;

public enum Permission {

	USER_READ("user:read"), USER_WRITE("user:write");

	private final String value;

	Permission(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
