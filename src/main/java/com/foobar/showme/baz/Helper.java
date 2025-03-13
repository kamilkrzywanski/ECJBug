package com.foobar.showme.baz;

import java.util.Optional;

public class Helper {
    public static Object findFaultsChannel(Interface anInterface) {

        Optional<java.lang.String> xxx =  anInterface.getEntry(1L,
                        GenericParams.getParam())
                .map(UniversalInterfaceDto::getKey);
        return null;
    }
}
