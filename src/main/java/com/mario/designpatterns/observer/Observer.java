package com.mario.designpatterns.observer;

import java.util.List;

/**
 * Implementation of class <code>Observer</code>.
 *
 * @author <a href="mailto:mariolopezcampos@gmail.com">Mario Lopez</a>
 * @version 1.0, 11/10/2015
 */
public interface Observer {
    void update(List<SoccerMatch> soccerMatchList);
}
