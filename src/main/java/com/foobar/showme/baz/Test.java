package com.foobar.showme.baz;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class Test {
    public static Pair<Long, Long> numericRangeFromString(String range) {
        if (StringUtils.isNotEmpty(range)) {
            String[] rangeStr = range.split("-");
            try {
                return new ImmutablePair<>(
                        rangeStr[0] != null ? Long.parseLong(rangeStr[0]) : null,
                        rangeStr.length > 1 && rangeStr[1] != null ? Long.parseLong(rangeStr[1]) : null);
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
}
