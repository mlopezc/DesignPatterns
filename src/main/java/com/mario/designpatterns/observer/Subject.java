package com.mario.designpatterns.observer;

/**
 * Implementation of class <code>Subject</code>.
 *
 * @author <a href="mailto:mariolopezcampos@gmail.com">Mario Lopez</a>
 * @version 1.0, 11/10/2015
 */
public interface Subject {
    void register(Observer newObserver);

    void unregister(Observer deleteObserver);

    void notifyObserver();

}

