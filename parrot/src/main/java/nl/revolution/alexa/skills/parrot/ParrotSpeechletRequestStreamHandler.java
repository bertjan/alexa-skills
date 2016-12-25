package nl.revolution.alexa.skills.parrot;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/** AWS Lambda function handler */
public final class ParrotSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
    private static final String APPLICATION_ID = "amzn1.ask.skill.4ca04147-c17e-4ad4-b0c5-9c405ba4f61a";

    public ParrotSpeechletRequestStreamHandler() {
        super(new ParrotSpeechlet(), Stream.of(APPLICATION_ID).collect(Collectors.toSet()));
    }
}
