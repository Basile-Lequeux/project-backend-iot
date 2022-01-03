package org.example.models;

public class Light extends Thing{

    public interface OnLightChangedListener {
        void onLightChanged(Light light);
    }

    private boolean isLightOn = false;
    private OnLightChangedListener onLightChangedListener;

    @Override
    public String getTypeName() {
        return "Light";
    }

    public void setOnLightChangedListener(OnLightChangedListener onLightChangedListener) {
        this.onLightChangedListener = onLightChangedListener;
    }

    public boolean isLightOn() {
        return isLightOn;
    }

    public void setLightOn(boolean lightOn) {
        isLightOn = lightOn;
        if (onLightChangedListener != null) {
            onLightChangedListener.onLightChanged(this);
        }
    }

    @Override
    public String getDescription() {
        return "Light is on=" + isLightOn;
    }
}
