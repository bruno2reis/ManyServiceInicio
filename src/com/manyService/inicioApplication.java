package com.manyService;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class inicioApplication extends Application<inicio> {

	public static void main(String[] args)throws Exception{
		new inicioApplication().run(args);
	}
	
	@Override
	public String getName(){
		return "Ola Mundo!";
	}
	 @Override
	    public void initialize(Bootstrap<inicio> bootstrap) {
	        // nothing to do yet
	    }
	
	@Override
	public void run(inicio arg0, Environment arg1) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
