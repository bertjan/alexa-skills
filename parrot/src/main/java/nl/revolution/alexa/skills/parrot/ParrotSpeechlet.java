package nl.revolution.alexa.skills.parrot;

import com.amazon.speech.speechlet.*;
import nl.revolution.alexa.skills.common.DefaultSpeechlet;
import org.apache.commons.lang3.StringUtils;

import java.util.stream.Stream;

public class ParrotSpeechlet extends DefaultSpeechlet {
    private static final String INTENT_NAME = "ParrotIntent";

    private static final String[] SLOTS = { "word_a", "word_b", "word_c", "word_d" };

    @Override
    public SpeechletResponse onIntent(final IntentRequest request, final Session session) throws SpeechletException {
        if (hasIntent(request, INTENT_NAME)) {
            return speechletResponse(INTENT_NAME, determineResponse(request));
        } else {
            throw new SpeechletException(INTENT_NAME);
        }
    }

    private String determineResponse(final IntentRequest request) {
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
