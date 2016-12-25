package nl.revolution.alexa.skills.parrot;

import com.amazon.speech.speechlet.*;
import nl.revolution.alexa.skills.common.DefaultSpeechlet;
import org.apache.commons.lang3.StringUtils;

import java.util.stream.Stream;

public class ParrotSpeechlet extends DefaultSpeechlet {

    private static final String[] SLOTS = { "word_a", "word_b", "word_c", "word_d", "word_e", "word_f", "word_g", "word_h" };

    @Override
    protected String getIntentName() {
        return "ParrotIntent";
    }

    @Override
    protected String determineResponse(final IntentRequest request) {
        StringBuilder reply = new StringBuilder();
        Stream.of(SLOTS).forEach(slot -> {
            String slotStr = request.getIntent().getSlot(slot).getValue();
            if (StringUtils.isNotBlank(slotStr)) {
                reply.append(slotStr + " ");
            }
        });

        return reply.toString();
    }

}
