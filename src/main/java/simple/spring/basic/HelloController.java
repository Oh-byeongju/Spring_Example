package simple.spring.basic;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger( HelloController.class);
    
    @RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
    public String getHomePage( ModelMap model ) {
        return "index";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello( Map<String, Object> model ) {
        
        model.put("name", "테스트");
        model.put("msg", "페이지입니다.");

        return "hello";
    }
}
