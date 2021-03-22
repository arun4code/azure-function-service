package com.price.function;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.BlobTrigger;
import com.microsoft.azure.functions.annotation.FunctionName;

public class PriceUpdateFunction {
	
	// 1- UAE
	@FunctionName("mafuaepriceblobprocessor")
	public void stockUpdateForUAE(
			@BlobTrigger(name = "file", dataType = "binary", 
			path = "rr-feed-dev/images3/{OSM}.png", 
			connection = "BlobStorageAccountConnString") byte[] content,
			final ExecutionContext context) {
		
		System.out.println("---------hello-------");
		
		//this.processStock(content, context, "mafuae", this.getRedisConnection());
	}

}
