package com.code.test.characters.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "matcher")
public class CharactersMatcherConfig {
    private String charactersMatchPattrn;

    public String getCharactersMatchPattrn() {
        return charactersMatchPattrn;
    }

    public void setCharactersMatchPattrn(String charactersMatchPattrn) {
        this.charactersMatchPattrn = charactersMatchPattrn;
    }
}
