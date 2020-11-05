package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class AgeSerializer extends JsonSerializer<Integer> {
    @Override
    public void serialize(Integer age, JsonGenerator jsonGenerator, SerializerProvider serializers) throws IOException {
        if (age==null) jsonGenerator.writeNumber(0);
    }
}
