package org.example.configuration;

import org.example.SupportManagerImpl;
import org.example.SupportService;
import org.example.SupportServiceImpl;

@Configuration
public class SupportConfiguration {
    @Instance
    public SupportManagerImpl supportManager(){
        return new SupportManagerImpl(supportService());
    }
    @Instance
    public SupportService supportService(){
        return new SupportServiceImpl();
    }
}
