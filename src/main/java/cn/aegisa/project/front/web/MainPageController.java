package cn.aegisa.project.front.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xianyingda@guazi.com
 * @serial
 * @since 2019-01-27 12:08
 */
@Controller
@Slf4j
public class MainPageController {

    @RequestMapping("/")
    public String mainPage() {
        return "index";
    }
}
