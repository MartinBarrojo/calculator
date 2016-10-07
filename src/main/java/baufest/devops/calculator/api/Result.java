package baufest.devops.calculator.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result 
{
    private long id;
	private int result;

	private String unit;
	private String operation;

    private int addend1;
	private int addend2;

    public Result() {
        // Jackson deserialization
    }

    public Result(long id, int addend1, int addend2, int result, 
    			  String unit, String operation) 
    {
        // Jackson deserialization
    	this.id = id;
    	this.addend1 = addend1;
    	this.addend2 = addend2;
    	this.result = result;
    	this.unit = unit;
    	this.operation = operation;
    }

	@JsonProperty
	public long getId() {
		return id;
	}

	@JsonProperty
	public int getResult() {
		return result;
	}

    @JsonProperty
	public String getUnit() {
		return unit;
	}

    @JsonProperty
	public String getOperation() {
		return operation;
	}

    @JsonProperty
	public int getAddend1() {
		return addend1;
	}

    @JsonProperty
	public int getAddend2() {
		return addend2;
	}
}
