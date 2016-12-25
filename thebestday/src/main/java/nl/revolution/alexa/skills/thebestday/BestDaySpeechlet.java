package nl.revolution.alexa.skills.thebestday;

import com.amazon.speech.speechlet.*;
import nl.revolution.alexa.skills.common.DefaultSpeechlet;

public class BestDaySpeechlet extends DefaultSpeechlet {

    @Override
    protected String getIntentName() {
        return "WhatsTheBestDayIntent";
    }

    @Override
    protected String determineResponse(final IntentRequest request) {
        return "Wednesday is the best day, of course. Friday is alright. But not as good as Wednesday.";
    }

}