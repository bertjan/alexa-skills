package nl.revolution.alexa.skills.common;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.*;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.SimpleCard;

public class DefaultSpeechlet implements Speechlet {

    @Override
    public void onSessionStarted(SessionStartedRequest sessionStartedRequest, Session session) throws SpeechletException {
        // no default implementation
    }

    @Override
    public SpeechletResponse onLaunch(LaunchRequest launchRequest, Session session) throws SpeechletException {
        // no default implementation
        return null;
    }

    @Override
    public SpeechletResponse onIntent(IntentRequest intentRequest, Session session) throws SpeechletException {
        // no default implementation
        return null;
    }

    @Override
    public void onSessionEnded(SessionEndedRequest sessionEndedRequest, Session session) throws SpeechletException {
        // no default implementation
    }

    protected boolean hasIntent(IntentRequest request, String intentNameToMatch) {
        Intent intent = request.getIntent();
        String intentName = (intent != null) ? intent.getName() : null;
        return (intentNameToMatch.equals(intentName));
    }

    protected SpeechletResponse speechletResponse(String title, String text) {
        SimpleCard card = createCard(title, text);
        PlainTextOutputSpeech speech = createSpeech(text);
        return SpeechletResponse.newTellResponse(speech, card);
    }

    private SimpleCard createCard(String title, String text) {
        SimpleCard card = new SimpleCard();
        card.setTitle(title);
        card.setContent(text);
        return card;
    }

    private PlainTextOutputSpeech createSpeech(String text) {
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText(text);
        return speech;
    }

}
