package com.netcorner.velocity;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by shijiufeng on 2019/3/20.
 */
@ConfigurationProperties(prefix = "spring.velocity")
public class VelocityProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
