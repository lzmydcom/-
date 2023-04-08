package com.yd.creation.builderMode;

import java.util.ArrayList;
import java.util.List;

public abstract class Product {

    protected static final List<String> parts = new ArrayList<>();

    public abstract void show();

    public abstract void addParts(String part);
}
