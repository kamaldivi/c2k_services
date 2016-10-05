package org.gokulbhajan.c2k.domain;

//import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemController {

    //private static final String template = "Hello, %s!";
    //private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/system")
    public System system(@RequestParam(value="name", defaultValue="World") String name) {
    	System sys = new System();
    	sys.setSystemId(1001);
    	sys.setSystemName("C2K System");
    	sys.setAcronym("C2K");
        return sys;
    }
}