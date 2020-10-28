package pl.keruzam.cashflow.security;

import java.util.Set;

import com.google.common.collect.Sets;

public enum Role {

	USER(Sets.newHashSet(Permission.USER_READ)), ADMIN(Sets.newHashSet(Permission.USER_READ, Permission.USER_WRITE));

	private final Set<Permission> permissions;

	Role(Set<Permission> permissions) {
		this.permissions = permissions;

	}

	public Set<Permission> getPermissions() {
		return permissions;
	}

}
