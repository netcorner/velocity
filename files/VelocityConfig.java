package com.netcorner.hotelanalysis.config;

import com.netcorner.hotelanalysis.utils.velocity.VelocityConfigurer;
import com.netcorner.hotelanalysis.utils.velocity.VelocityViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Properties;

/**
 * Created by shijiufeng on 2019/3/6.
 */
@Configuration
public class VelocityConfig {
    @Bean
    public VelocityConfigurer getVelocityConfigurer()
    {
        VelocityConfigurer velocityConfigurer=new VelocityConfigurer();
        velocityConfigurer.setResourceLoaderPath("/templates/");
        Properties properties=new Properties();
        properties.put("velocimacro.permissions.allow.inline.local.scope",true);
        properties.put("input.encoding","UTF-8");
        properties.put("output.encoding","UTF-8");
        velocityConfigurer.setVelocityProperties(properties);
        return velocityConfigurer;
    }

    @Bean
    public VelocityViewResolver getVelocityViewResolver()
    {
        VelocityViewResolver velocityViewResolver=new VelocityViewResolver();
        velocityViewResolver.setCache(false);

        velocityViewResolver.setCache(false);
        velocityViewResolver.setPrefix("/templates/");
        velocityViewResolver.setSuffix(".html");
        velocityViewResolver.setDateToolAttribute("date");
        velocityViewResolver.setNumberToolAttribute("number");
        velocityViewResolver.setContentType("text/html;charset=UTF-8");
        velocityViewResolver.setExposeSpringMacroHelpers(true);
        velocityViewResolver.setExposeRequestAttributes(true);
        velocityViewResolver.setRequestContextAttribute("request");
//        Properties properties=new Properties();
//        velocityViewResolver.setVelocityProperties(properties);
        return velocityViewResolver;
    }
}
