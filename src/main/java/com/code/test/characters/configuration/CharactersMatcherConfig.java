package com.code.test.characters.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "matcher")
public class CharactersMatcherConfig {
    private String charactersMatchPattern;

    public String getCharactersMatchPattern() {
        return charactersMatchPattern;
    }

    public void setCharactersMatchPattern(String charactersMatchPattern) {
        this.charactersMatchPattern = charactersMatchPattern;
    }
}
