alexa-skills
============

Some simple skills for Amazon Alexa.
To get started, clone https://github.com/amzn/alexa-skills-kit-java and do a mvn install into your local repo.

To create a package for AWS lambda, run `mvn assembly:assembly -DdescriptorId=jar-with-dependencies package` (either in the project root or in a specific sub module).
Follow instructions on https://github.com/amzn/alexa-skills-kit-java/tree/master/samples/src/main/java/helloworld to create a skill in the Alexa console and deploy your skill to AWS Lambda.
