package org.example;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        try {
            // Создаем ApplicationContext
            ApplicationContext context = new ApplicationContext();

            // Получаем экземпляры SupportManager и SupportService из контекста
            SupportManagerImpl supportManagerImpl = context.getInstance(SupportManagerImpl.class);
            SupportService supportService = context.getInstance(SupportService.class);

            // Вызываем метод provideSupport() у SupportManager
            String message = supportManagerImpl.provideSupport();

            // Выводим сообщение и фразу от SupportService
            System.out.println(message);
            System.out.println("SupportService phrase: " + supportService.getPhrase());

        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}