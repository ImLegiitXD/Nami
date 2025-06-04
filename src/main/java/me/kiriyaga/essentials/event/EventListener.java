package me.kiriyaga.essentials.event;

@FunctionalInterface
public interface EventListener<T extends Event> {
    void onEvent(T event);
}
