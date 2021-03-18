package com.craftofprogramming;

import java.util.Objects;

public final class TestContext {
    public static final TestContext INSTANCE = new TestContext();

    private LibraryService libraryService;

    public LibraryService initializeLibraryService(boolean preLoad) {
        return (libraryService = LibraryService.getService(preLoad));
    }

    public LibraryService getLibraryService() {
        Objects.requireNonNull(libraryService);
        return libraryService;
    }
}
