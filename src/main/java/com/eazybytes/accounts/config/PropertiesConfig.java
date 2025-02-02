package com.eazybytes.accounts.config;

import com.eazybytes.accounts.dto.AccountsContactInfoDto;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
public class PropertiesConfig {
}
