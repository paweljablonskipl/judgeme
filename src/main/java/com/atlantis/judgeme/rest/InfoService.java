package com.atlantis.judgeme.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Date;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class InfoService {
    @GET
    @Path("/info")
    @Produces(APPLICATION_JSON + ";charset=utf-8")
    /*
     * Returns Info.
     */
    public String info() throws Exception {
        return "JudgeMe REST API 1.0";

/*        infoDTO.setJavaRuntimeVersion(System.getProperty("java.version"));  //http://stackoverflow.com/questions/2591083/getting-version-of-java-in-runtime
        
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();  //https://community.jboss.org/message/644725?_sscc=t
        ObjectName name = new ObjectName("jboss.as:management-root=server");
        infoDTO.setJbossVersion((String) (server.getAttribute(name, "releaseVersion")));

        RuntimeMXBean rb = ManagementFactory.getRuntimeMXBean();  //http://stackoverflow.com/questions/6431607/get-application-uptime
        infoDTO.setUptime(rb.getUptime());
        infoDTO.setStartTime(ServusUtil.formatDateYYYYMMdd_HHmmss(new Date(rb.getStartTime())));

        return infoDTO;*/
    }
}
