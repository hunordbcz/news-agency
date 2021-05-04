package net.debreczeni.newsagency.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ADMIN, WRITER;

    public String getAuthority() {
        return name();
    }

}