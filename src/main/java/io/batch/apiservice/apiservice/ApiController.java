package io.batch.apiservice.apiservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ApiController {

    @PostMapping("/api/product/1")
    public String product1(@RequestBody ApiInfo apiInfo) {

        List<ProductV0> productV0List = apiInfo.getApiRequestList().stream()
                .map(item -> item.getProductV0())
                .collect(Collectors.toList());
        System.out.println("productV0List = " + productV0List);

        return "product1 was successfully processed";
    }

    @PostMapping("/api/product/2")
    public String product2(@RequestBody ApiInfo apiInfo) {

        List<ProductV0> productV0List = apiInfo.getApiRequestList().stream()
                .map(item -> item.getProductV0())
                .collect(Collectors.toList());
        System.out.println("productV0List = " + productV0List);

        return "product2 was successfully processed";
    }

    @PostMapping("/api/product/3")
    public String product3(@RequestBody ApiInfo apiInfo) {

        List<ProductV0> productV0List = apiInfo.getApiRequestList().stream()
                .map(item -> item.getProductV0())
                .collect(Collectors.toList());
        System.out.println("productV0List = " + productV0List);

        return "product3 was successfully processed";
    }
}
