package com.manning.sbip.ch02;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import java.util.List;

@ConstructorBinding
@ConfigurationProperties("app.sbip.ct")
public class AppProperties {
    private final String name;
    private final String ip;
    private final int port;

    private final Security security;

    public String getName() {
        return name;
    }
    public String getIp() {
        return ip;
    }
    public int getPort() {
        return port;
    }
    public AppProperties (String name, Security security, String ip, int port) {
        this.name = name;
        this.security = security;
        this.ip = ip;
        this.port = port;
    }
    @Override
    public String toString() {
        return "AppProperties {" +
                "name = '" + name +'\'' +
                ", ip = '" + ip + '\'' +
                ", security = " + security + '}';
    }

    public static class Security {
        private boolean enabled;

        private final String token;

        private final List<String> roles;

        public Security(boolean enabled, String token, List<String> roles) {
            this.enabled =enabled;
            this.token = token;
            this.roles = roles;
        }

        public boolean isEnabled() {
            return enabled;
        }

        public String getToken() {
            return token;
        }

        public List<String> getRoles() {
            return roles;
        }
        @Override
        public String toString() {
            return "Security {" +
                    "enabled=" + enabled +
                    ", token='" + token + '\'' +
                    ", roles=" + roles +
                    '}';
        }
    }

}

