package com.freshipper.app1.databinding.data;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.freshipper.app1.BR;

public class User  extends BaseObservable {
    private String firstName;
    private String lastName;
    private String displayName;
    private boolean isAdult;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = String.format("%s %s", firstName, lastName);
        this.isAdult = true;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    @Bindable
    public String getDisplayName() {
        return displayName;
    }

    @Bindable
    public boolean getIsAdult() {
        return isAdult;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        setDisplayName();
        notifyPropertyChanged(BR.firstName);
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
        setDisplayName();
        notifyPropertyChanged(BR.lastName);
    }
    public void setDisplayName() {
        this.displayName = String.format("%s %s", firstName, lastName);
        notifyPropertyChanged(BR.displayName);
    }
    public void seIstAdult(boolean isAdult) {
        this.isAdult = isAdult;
        notifyPropertyChanged(BR.isAdult);
    }
}
