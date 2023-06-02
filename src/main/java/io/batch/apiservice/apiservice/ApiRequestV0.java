package io.batch.apiservice.apiservice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiRequestV0 {

    private Long id;
    private ProductV0 productV0;
}