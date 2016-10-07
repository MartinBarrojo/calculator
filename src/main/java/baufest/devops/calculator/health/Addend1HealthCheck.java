package baufest.devops.calculator.health;

import com.codahale.metrics.health.HealthCheck;

public class Addend1HealthCheck extends HealthCheck
{
	private int addend1;
	
	public Addend1HealthCheck(int addend)
	{
		this.addend1 = addend;
	}

	@Override
    protected Result check() throws Exception 
	{
		if (addend1<1000) return Result.unhealthy("Número mayor a mil.");
        return Result.healthy("Número perfecto");
    }
}
