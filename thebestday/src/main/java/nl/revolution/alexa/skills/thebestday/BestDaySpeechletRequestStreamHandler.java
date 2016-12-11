package nl.revolution.alexa.skills.thebestday;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/** AWS Lambda function handler */
public final class BestDaySpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
    private static final String APPLICATION_ID = "amzn1.ask.skill.b0552196-09fc-4eee-bffb-a55b4d77219b";

    public BestDaySpeechletRequestStreamHandler() {
        super(new BestDaySpeechlet(), Stream.of(APPLICATION_ID).collect(Collectors.toSet()));
    }
}
