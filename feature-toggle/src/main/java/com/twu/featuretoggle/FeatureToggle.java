package com.twu.featuretoggle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Configuration
public class FeatureToggle {

    @Value("${features.feature1}")
    public boolean feature1;

    public boolean feature1() {
        return feature1;
    }

    @Value("#{${features.map}}")
    private Map<String, Boolean> featureMap;

    public Boolean getFeatureMap(String name) {
        return featureMap.get(name);
    }
}
