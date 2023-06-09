open module filearchiver.rest {
    requires spring.boot;
    requires spring.boot.autoconfigure;

    requires spring.core;
    requires spring.web;
    requires spring.beans;
    requires spring.context;
    requires spring.data.commons;
    requires spring.tx;

    requires jakarta.persistence;

    requires lombok;

    requires filearchiver.data;
    requires filearchiver.data.filesystem;
}