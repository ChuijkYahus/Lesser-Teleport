package com.luxof.lessertp;

import com.luxof.lessertp.MishapThrower;

import at.petrak.hexcasting.api.casting.mishaps.Mishap;

// VSCode has heinous Kotlin support for Minecraft modding,
// and I REFUSE to use IntelliJ.
// So I made this just to stop it from being mad at me EVERYWHERE.
public class MishapThrowerJava {
    public static void throwMishap(Mishap mishap) {
        MishapThrower.throwMishap(mishap);
    }
}
