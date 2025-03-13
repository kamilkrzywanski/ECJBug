package com.foobar.showme.baz;


import java.util.Optional;
public interface Interface {
    <T extends InterfaceDto> Optional<T> getEntry(Long id, GenericParams<T> params);
}
