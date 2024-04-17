package com.example.factory;

public class ProgrammingLanguageFactory {
    public static IProgrammingLanguage getProgrammingLanguage(Usecase usecase) {
        switch (usecase) {
            case SYSTEM_PROGRAMMING:
                return new C();
            case BACKEND_SOFTWARE:
                return new Java();
            case MACHINE_LEARNING:
                return new Python();
            default:
                throw new RuntimeException(String.format("No language found for usecase: %s", usecase.name()));
        }
    }
}
