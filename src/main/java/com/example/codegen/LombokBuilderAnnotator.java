package com.example.codegen;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JDefinedClass;
import org.jsonschema2pojo.AbstractAnnotator;

public class LombokBuilderAnnotator extends AbstractAnnotator {

    @Override
    public void propertyInclusion(JDefinedClass clazz, JsonNode schema) {
        clazz.annotate(clazz.owner().ref("lombok.EqualsAndHashCode"));
    }
}
