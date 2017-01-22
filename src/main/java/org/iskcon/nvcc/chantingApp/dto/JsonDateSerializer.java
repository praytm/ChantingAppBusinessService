package org.iskcon.nvcc.chantingApp.dto;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class JsonDateSerializer extends JsonSerializer<Date> {

    /*
     * (non-Javadoc)
     *
     * @see org.codehaus.jackson.map.JsonSerializer#serialize(java.lang.Object,
     * org.codehaus.jackson.JsonGenerator,
     * org.codehaus.jackson.map.SerializerProvider)
     */
    @Override
    public void serialize(Date date, JsonGenerator gen, SerializerProvider prov) throws IOException, JsonProcessingException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        String fDate = dateFormat.format(date);
        gen.writeString(fDate);

    }

}