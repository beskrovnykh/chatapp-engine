package ru.chatapp.engine.delegate;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.chatapp.engine.MainApplication;

@Component
public class SayHelloDelegate implements JavaDelegate {

    private final Logger logger = LoggerFactory.getLogger(SayHelloDelegate.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        logger.info("Say hello!");
    }
}
