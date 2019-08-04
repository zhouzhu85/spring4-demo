package com.spring4.chapter3.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsCondition implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        Environment environment = conditionContext.getEnvironment();
        String magicBean = environment.getProperty("magicBean");
        final String[] defaultProfiles = environment.getDefaultProfiles();
        return environment.containsProperty("magic");
    }
}
