package com.kingbom.completablefuture;

import com.kingbom.completablefuture.service.UserService;
import org.junit.Test;

import java.util.concurrent.CompletableFuture;

public class UserServiceTest {

    private UserService userService;

    @Test
    public void whenSetFirstNameAndLastNameCompletableFutureRunAsync_ShouldBeNotReturn() {
        CompletableFuture.runAsync(() -> userService.setFirstNameAndLastName("jaruwit", "suriyo"));
    }
}
