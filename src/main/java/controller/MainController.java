package controller;

/**
 * Created by nick on 16/9/23.
 */
import bean.TestPO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dzkan on 2016/3/8.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return "indexs";
    }

    @RequestMapping(value = "/poList")
    @ResponseBody
    public List<TestPO> getTestPO() {
        List<TestPO> testPOs = new ArrayList<>();
        testPOs.add(new TestPO(1,"haha",1));
        testPOs.add(new TestPO(2,"haha2",2));
        testPOs.add(new TestPO(3,"haha3",3));
        return testPOs;
    }

    @RequestMapping(value = "/po")
    @ResponseBody
    public TestPO getPO() {
        return new TestPO(128,"Liu qin",36);
    }
}