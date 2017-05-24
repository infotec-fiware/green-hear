package mx.infotec.dads.greenhear.cucumber.stepdefs;

import mx.infotec.dads.greenhear.GreenhearApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = GreenhearApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
