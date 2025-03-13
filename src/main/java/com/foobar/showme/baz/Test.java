package com.foobar.showme.baz;

import java.util.Map;

public class Test {
    public static Map<Long, Long> numericRangeFromString(String range) {
        String[] rangeStr = range.split("-");
        return Map.of(
                rangeStr[0] != null ? Long.parseLong(rangeStr[0]) : null,
                rangeStr.length > 1 && rangeStr[1] != null ? Long.parseLong(rangeStr[1]) : null
        );
    }
}
