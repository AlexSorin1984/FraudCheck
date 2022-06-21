package com.springboottests.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
