package org.example;

@Logged
public class SupportManagerImpl implements SupportManager {
    private final SupportService supportService;
    public SupportManagerImpl(SupportService supportService){
        this.supportService=supportService;
    }
    @Override
    public String provideSupport(){
        return "Dear, %s".formatted(supportService.getPhrase());
    }
}
