package prot.lab.oauth2.control;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/oauth2/api/me")
    public Authentication showMe() {
        Authentication ret = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("In showMe");
        return ret;
    }

    @GetMapping("/oauth2/api/view/me")
    public Authentication viewMe() {
        Authentication ret = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("In viewMe");
        return ret;
    }

    @GetMapping("/oauth2/api/modify/me")
    public Authentication modifyMe() {
        Authentication ret = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("In modifyMe");
        return ret;
    }
}
