
/*
@author: Arun Dhwaj
@date: 25th Feb, 2019
@purpose: SPringBoot CLI POC
*/

package EmployeeController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class EmployeeMain
{
    public static void main(String[] args) 
    {
        /*
        Step-1: Default way to start Spring Application. Here very little scope to customize the application level activity.
        */

        //SpringApplication.run(EmployeeMain.class, args);
        
        /*
        Step-2: Custom way to start Spring Application. Here we can customize the application level activities. First get an instance, then customize the Application level 
        activities before calling run() method.
        
        Application events are sent in the following order, as your application runs:
            1. An ApplicationStartingEvent is sent at the start of a run but before any processing, except
            for the registration of listeners and initializers.

            2. An ApplicationEnvironmentPreparedEvent is sent when the Environment to be used in the
            context is known but before the context is created.
            
            3. An ApplicationPreparedEvent is sent just before the refresh is started but after bean definitions
            have been loaded.
            
            4. An ApplicationStartedEvent is sent after the context has been refreshed but before any
            application and command-line runners have been called.
            
            5. An ApplicationReadyEvent is sent after any application and command-line runners have been
            called. It indicates that the application is ready to service requests.
            
            6. An ApplicationFailedEvent is sent if there is an exception on startup.             
        */
     
        //Creating the SpringApplication   
        SpringApplication app = new SpringApplication( EmployeeMain.class );
        
        //app.setBannerMode(Banner.Mode.OFF);

        //SpringApplication.addListeners("Hello AppListnener");
        System.out.println("See the this Task pid: "); 
        app.addListeners(new ApplicationPidFileWriter("task.pid"));

        app.run(args);
    }
}
