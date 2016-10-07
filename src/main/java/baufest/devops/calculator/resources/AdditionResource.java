package baufest.devops.calculator.resources;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import baufest.devops.calculator.api.Result;
import com.codahale.metrics.annotation.Timed;

@Path("/addition")
@Produces(MediaType.APPLICATION_JSON)
public class AdditionResource 
{
    private int addend1;
    private int addend2;
    private String unit;
    private String operation = "addition";
    private final AtomicLong counter;

	public AdditionResource(int addend1, int addend2, String unit)
	{
		this.addend1 = addend1;
		this.addend2 = addend2;
		this.unit = unit;
        this.counter = new AtomicLong();
	}

    @GET
    @Timed
    public Result addition( @QueryParam("addend1") int addend1, 
    						@QueryParam("addend2") int addend2, 
    						@QueryParam("unit") Optional<String> unit) 
    {
        this.addend1 = addend1;
        this.addend2 = addend2;
        this.unit = unit.orElse("");
    	int res = this.addend1 + this.addend2;
        return new Result(counter.incrementAndGet(), this.addend1, this.addend2, 
        		res, this.unit, this.operation);
    }
}
