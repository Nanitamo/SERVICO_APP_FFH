package ao.gov.minfin.servicos.ffh.configuration.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration
public class ConfiguracaoSeguranca
{
    @Bean
    public CorsConfigurationSource habilitarCors()
    {
        CorsConfiguration cors = new CorsConfiguration();
        cors.setAllowedOrigins(Arrays.asList("*"));
        cors.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "PATCH", "*"));
        cors.setAllowedHeaders(Arrays.asList("*"));

        UrlBasedCorsConfigurationSource baseCors = new UrlBasedCorsConfigurationSource();
        baseCors.registerCorsConfiguration("/**", cors);
        return baseCors;
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
    {
        http
            .csrf()
            .disable()
            .authorizeRequests()
            .antMatchers("/**")
            .permitAll()
            .and()
            .cors()
            .configurationSource( this.habilitarCors() );

        return http.build();
    }
}
