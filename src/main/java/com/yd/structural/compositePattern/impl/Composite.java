package com.yd.structural.compositePattern.impl;

import com.yd.structural.compositePattern.Component;

import java.util.List;

public class Composite implements Component {
    private String name;
    private final List<Component> components;

    public Composite(List<Component> components){
        this.components = components;
    }
    public Composite(String name,List<Component> components){
        this.name = name;
        this.components = components;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void add(Component component){
        components.add(component);
    }

    public Component remove(Component component){
        return components.remove(component) ? component : null;
    }

    public List<Component> getComponents(){
        return components;
    }

    //展示一层包含关系
    public void showComposite(){
        System.out.println(name + "中包含:");
        for (Component component:components) {
            if (component.getClass() == Composite.class){
                System.out.println(((Composite)component).name + "(Composite)");
            } else component.execute();
        }
    }

    //递归展示所有层包含关系
    @Override
    public void execute() {
        System.out.println(name + "中包含:");
        for (Component component:components){
            component.execute();
        }
    }
}
