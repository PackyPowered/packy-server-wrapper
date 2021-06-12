package cc.sfclub.packy.services;

import cc.sfclub.packy.models.PackageForm;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface IPackage {
    @RequestLine("POST /package/{name}")
    List addPackage(@Param("name") String name, PackageForm packageForm);
}
