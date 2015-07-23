package controllers;

import play.mvc.Controller;
import play.mvc.Result;


public class Application extends Controller {

    public Result index() {
        return ok();
    }

    public Result getEntityRawContext(String id, String dataType, String standard) {
    	System.out.println("id="+ id+", type="+dataType+", standard="+standard);
    	if(id.equals("temperature_id")){
    		return ok("200.4");
    	}else if(id.equals("humidity_id")){
    		return ok("66.5");
    	}
		return ok("id:"+id+"\tdoesn't match");
    }
    
    public Result getEntityContext(String id, String attr){
    	System.out.println("id="+ id+", attr="+attr);
    	if(id.equals("person1") && attr.equals("position")){
    		return ok("lying");
    	}else if(id.equals("room1") && attr.equals("time")){
    		return ok("afterhour");
    	}
    	return ok("id:"+id+"\tdoesn't match");
    }
}
