package com.newrelic.platform.metrics.publish.binding;

import java.util.HashMap;

public class MetricData {
	protected String name;
	protected Number value;  //must be int or float
	protected ComponentData componentData;
	
	protected MetricData(ComponentData componentData, String name, Number value) {
		super();
		init(componentData, name, value);
	}
	
	protected void init(ComponentData componentData, String name, Number value) {
		this.name = name;
		this.value = value;
		this.componentData = componentData;
	}
	
	protected void serialize(HashMap<String, Object> data) {
		Context.getLogger().finest("Metric: " + name + " value: " + value);
		data.put(name, value);	
	}
	
	public String toString() {
		return "Metric(" + name + " : " + value + ")";
	}
}
