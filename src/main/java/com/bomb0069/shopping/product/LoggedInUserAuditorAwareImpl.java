package com.bomb0069.shopping.product;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class LoggedInUserAuditorAwareImpl implements AuditorAware<String> {

    @Override
    @org.springframework.lang.NonNull
    public Optional<String> getCurrentAuditor() {
        return Optional.of("bomb0069");
    }
}