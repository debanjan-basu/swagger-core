package io.swagger.oas.models;

import io.swagger.oas.annotations.media.Schema;

public class ModelWithRanges {

    // TODO
    @Schema(description = "values with include range"//, allowableValues = "range[1, 5]"
             )
    public int getInclusiveRange() {
        return 2;
    }

    @Schema(description = "values with include range"//, allowableValues = "range(1, 5)"
             )
    public int getExclusiveRange() {
        return 2;
    }

    @Schema(description = "values with include range"//, allowableValues = "range[1, infinity]"
             )
    public int getPositiveInfinityRange() {
        return 2;
    }

    @Schema(description = "values with include range"//, allowableValues = "range[-infinity, 5]"
             )
    public int getNegativeInfinityRange() {
        return 2;
    }

    @Schema(description = "some string values"//, allowableValues = "str1, str2"
             )
    public String getStringValues() {
        return "test";
    }

    @Schema(description = "some string values"//, allowableValues = "range[1.0, 8.0)"
             )
    public Double getDoubleValues() {
        return 1.0;
    }
}