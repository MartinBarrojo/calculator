package baufest.devops.calculator.health;

import com.codahale.metrics.health.HealthCheck;

public class Addend2HealthCheck extends HealthCheck
{
	private int addend2;
	
	public Addend2HealthCheck(int addend)
	{
		this.addend2 = addend;
	}

	@Override
    protected Result check() throws Exception 
	{
		if (addend2<1000) return Result.unhealthy("Número mayor a mil.");
        return Result.healthy("Número perfecto");
    }
}
