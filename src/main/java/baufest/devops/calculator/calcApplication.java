package baufest.devops.calculator;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import baufest.devops.calculator.health.Addend1HealthCheck;
import baufest.devops.calculator.health.Addend2HealthCheck;
import baufest.devops.calculator.resources.AdditionResource;

public class calcApplication extends Application<calcConfiguration> {

    public static void main(final String[] args) throws Exception {
        new calcApplication().run(args);
    }

    @Override
    public String getName() {
        return "calc";
    }

    @Override
    public void initialize(final Bootstrap<calcConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final calcConfiguration configuration,
                    Environment environment) {
        final AdditionResource resource = new AdditionResource(
                configuration.getAddend1(),
                configuration.getAddend2(),
                configuration.getUnit());
        
        /*
        final Addend1HealthCheck healthCheck1 =
                new Addend1HealthCheck(configuration.getAddend1());

        final Addend2HealthCheck healthCheck2 =
                new Addend2HealthCheck(configuration.getAddend2());

        environment.healthChecks().register("addend1", healthCheck1);
        environment.healthChecks().register("addend2", healthCheck2);
        */
        environment.jersey().register(resource);
    }

}
