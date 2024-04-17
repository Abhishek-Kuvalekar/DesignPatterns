package com.example.factory;

public class FactoryTester {
    public static void main(String[] args) {
        findProgrammingLanguageForUsecase(Usecase.SYSTEM_PROGRAMMING);
        findProgrammingLanguageForUsecase(Usecase.BACKEND_SOFTWARE);
        findProgrammingLanguageForUsecase(Usecase.MACHINE_LEARNING);
    }

    private static void findProgrammingLanguageForUsecase(Usecase usecase) {
        IProgrammingLanguage programmingLanguage = ProgrammingLanguageFactory.getProgrammingLanguage(usecase);
        System.out.println(
                String.format(
                        "Usecase: %s, Programming Language: %s",
                        usecase.name(),
                        programmingLanguage.getName()
                )
        );
    }
}
