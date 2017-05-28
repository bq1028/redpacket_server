package com.redpacket.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@ConfigurationProperties(prefix="scan")
@PropertySource("application-message.properties")
public class ApplicationMessageConfiguration {

    @Value("${scan_url_invalidate}")
    public String scanUrlInvalidate;
    
    @Value("${scan_item_not_found}")
    public String scanItemNotFound;
    
    @Value("${scan_item_not_enable}")
    public String scanItemNotEnable;
    
    @Value("${scan_item_redpacket_got}")
    public String scanItemRedpacketGot;

    @Value("${scan_item_has_used}")
	public String scanItemHasUsed;

    @Value("${scan_item_redpacket_exceed_total}")
	public String scanItemRedpacketExceedTotal;

    @Value("${scan_item_redpacket_exceed_daily}")
	public String scanItemRedpacketExceedDaily;

    @Value("${scan_item_city_not_match}")
	public String scanItemCityNotMatch;

    @Value("${scan_item_user_not_found}")
	public String scanItemUserNotFound;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}