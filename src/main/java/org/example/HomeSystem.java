package org.example;

import org.example.models.Light;
import org.example.models.Thing;

import java.util.ArrayList;
import java.util.List;

public class HomeSystem implements Light.OnLightChangedListener {

    private static HomeSystem instance;
    private final List<String> logs = new ArrayList<>();

    public static HomeSystem getInstance(){
        if (instance == null){
            instance = new HomeSystem();
        }
        return instance;
    }

    private final List<Thing> thingList;

    private HomeSystem() {
        this.thingList = new ArrayList<>();
    }

    public boolean addThing(Thing thing) {
        return thingList.add(thing);
    }

    public List<Thing> getThings() {
        return thingList;
    }

    @Override
    public void onLightChanged(Light light) {
        String message = "HomeSystem - Light " + light.getName() + " updated. light on=" + light.isLightOn();
        System.out.println(message);
        logs.add(message);
    }
}
