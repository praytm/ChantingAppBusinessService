/**
 * 
 */
package org.iskcon.nvcc.chantingApp.dto;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * @author MA041SH
 *
 */
public class JsonDateDeserializer extends JsonDeserializer<Date> {

    /*
     * (non-Javadoc)
     *
     * @see
     * org.codehaus.jackson.map.JsonDeserializer#deserialize(org.codehaus.jackson
     * .JsonParser, org.codehaus.jackson.map.DeserializationContext)
     */
    @Override
    public Date deserialize(JsonParser jp, DeserializationContext ctx) throws IOException, JsonProcessingException {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        String dt = jp.getText();
        if (dt == null || dt.trim().length() == 0) {
            return null;
        }
        Date date = null;
        try {
            date = fmt.parse(dt);
        } catch (ParseException e) {
            throw new IOException(e);
        }

        return date;
    }
}
