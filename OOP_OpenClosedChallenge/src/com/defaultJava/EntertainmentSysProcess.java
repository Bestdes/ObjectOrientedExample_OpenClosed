package com.defaultJava;

/*
Learned: Open and Closed Principle
The Open and Closed Principle states that a software module should be open to extension
but the same software module should be closed to modification. This means that the software
entity should be able to extend (or share) its behaviours and implementations without
changing its source code.


The following code is a program that describes and represents the Open-Closed Principle.
In this program there is an Interface created that extends its behaviours and creates a
structure for which all devices should behave. The code that is written allows almost all
if not all of the classes to extend their implementations without modification to their
source code. The programs is a model of the process a person would take to perform actions
that operate and use home entertainment system.
 */

import devices.IDevice;
import devices.SurroundSoundSys;
import devices.TV;
import users.Person;

public class EntertainmentSysProcess {

    public static void main(String[] args) {

        IDevice tv = new TV();
        IDevice sound = new SurroundSoundSys();
        Person sam = new Person();

        sam.thinkOfDevice(tv);
        sam.pushOnButton(tv, "powerON");

        sam.useRemote().targetDevice(tv);
        sam.useRemote().changeChannelUp(tv);
        sam.useRemote().turnOnDevice(tv);
        sam.useRemote().turnDownVolume(tv);
        sam.useRemote().turnUpVolume(sound);

    }
}
