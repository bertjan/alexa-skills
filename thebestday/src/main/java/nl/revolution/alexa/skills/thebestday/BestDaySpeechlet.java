package nl.revolution.alexa.skills.thebestday;

import com.amazon.speech.speechlet.*;
import nl.revolution.alexa.skills.common.DefaultSpeechlet;

public class BestDaySpeechlet extends DefaultSpeechlet {
    private static final String INTENT_NAME = "WhatsTheBestDayIntent";

    @Override
    public SpeechletResponse onIntent(final IntentRequest request, final Session session) throws SpeechletException {
        if (hasIntent(request, INTENT_NAME)) {
            return speechletResponse(INTENT_NAME, determineResponse(request));
        } else {
            throw new SpeechletException(INTENT_NAME);
        }
    }

    private String determineResponse(final IntentRequest request) {
        return "Wednesday is the best day, of course. Friday is alright. But not as good as Wednesday.";
    }

}
