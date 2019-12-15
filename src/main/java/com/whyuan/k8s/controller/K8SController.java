package com.whyuan.k8s.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈http://localhost:8080/k8s〉
 *
 * @author whyuan
 * @create 2019/12/8
 * @since 1.0.0
 */
@RestController
public class K8SController {
    @RequestMapping("/k8s")
    public String k8s() {
        return "hello K8s,i am whyuan version222!";
    }
}