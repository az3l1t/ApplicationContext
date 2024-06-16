package org.example;

public class LoggingSupportManager implements SupportManager{
    private final SupportManager supportManager;

    public LoggingSupportManager(SupportManager supportManager) {
        this.supportManager = supportManager;
    }

    @Override
    public String provideSupport() {
        System.out.println("Начало метода");
        String supportPhrase = supportManager.provideSupport();
        System.out.println("Конец метода");
        return supportPhrase;
    }
}
