/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.Calendar;
import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Gold
 */
@Path("test")
public class MyResource {
    
    @GET
    @Produces(value={MediaType.TEXT_PLAIN,"text/shortDate"})
    public Date testMethod(){
        return Calendar.getInstance().getTime();
    }
    
}
