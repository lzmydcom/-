package com.yd.behavioral.statePattern;

import com.yd.behavioral.statePattern.impl.Context;

public interface State {
    void handle(Context context);
}
