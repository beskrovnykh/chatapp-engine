package ru.chatapp.engine;

import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;
import org.springframework.util.Assert;

@SpringBootApplication
@EnableProcessApplication
public class MainApplication {

  private final Logger logger = LoggerFactory.getLogger(MainApplication.class);

  @Autowired
  private RepositoryService repositoryService;

  @EventListener
  public void notify(final PostDeployEvent unused) {
    final ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().processDefinitionKey("Sample").singleResult();

    logger.info("Found deployed process: {}", processDefinition);
    Assert.notNull(processDefinition, "process 'Sample' should be deployed!");
  }

  public static void main(String[] args) {
    SpringApplication.run(MainApplication.class);
  }

}