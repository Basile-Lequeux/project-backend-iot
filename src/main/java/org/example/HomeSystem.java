package org.example.models;

import java.util.List;

public class HomeSystem {
    private List<Thing> thingList;

    private void addThing(Thing t) {
        thingList.add(t);
    }

    private List<Thing> getThings() {
        return thingList;
    }

}
