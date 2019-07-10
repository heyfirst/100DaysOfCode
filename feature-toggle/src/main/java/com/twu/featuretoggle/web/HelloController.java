package com.twu.featuretoggle.web;

import com.twu.featuretoggle.FeatureToggle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    FeatureToggle featureToggle;

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        if (featureToggle.feature1()) {
            return "world";
        }
        return "hello";
    }

    @RequestMapping(value = "/map", method = RequestMethod.GET)
    public String mapGet() {
        if (featureToggle.getFeatureMap("foo")) {
            return "foo";
        }
        return "bar";
    }

}
