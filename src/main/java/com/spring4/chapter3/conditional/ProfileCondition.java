package com.spring4.chapter3.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Profile;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

public class ProfileCondition implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        if (conditionContext.getEnvironment()!=null){
            final MultiValueMap<String, Object> attrs = annotatedTypeMetadata.getAllAnnotationAttributes(Profile.class.getName());
            if (attrs!=null){
                for (Object value:attrs.get("value")){
                    if (conditionContext.getEnvironment().acceptsProfiles( (String[]) value )){
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }
}
