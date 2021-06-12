package cc.sfclub.packy.services;

import feign.RequestLine;

import java.util.List;

public interface IHome {
    @RequestLine("GET /")
    String welcome();

    @RequestLine("GET /status")
    List status();
}
