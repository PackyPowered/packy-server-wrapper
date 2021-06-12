package cc.sfclub.packy;

import cc.sfclub.packy.services.IHome;
import cc.sfclub.packy.services.IPackage;
import cc.sfclub.packy.services.IUser;
import feign.Feign;
import feign.gson.GsonDecoder;

public class Main {
    public static void main(String[] args) {
        IUser user = Feign.builder()
                .decoder(new GsonDecoder())
                .target(IUser.class, "https://pkgs.sfclub.cc");

        IPackage pkgs = Feign.builder()
                .decoder(new GsonDecoder())
                .target(IPackage.class, "https://pkgs.sfclub.cc");

        IHome home = Feign.builder()
                .decoder(new GsonDecoder())
                .target(IHome.class, "https://pkgs.sfclub.cc");
    }
}
