grails-extjs-bootstrap
======================

Ext JS BootStrap

## Setup ##

This plugin required following dependencies.

* Apache Ant
* Grails Ant Plugin

grails-app/conf/BuildConfig.groovy

    dependencies {
        // skip

        // Apache Ant
        compile 'org.apache.ant:ant:1.7.1'    //you can also use runtime
        compile 'org.apache.ant:ant-launcher:1.7.1'
    }

    plugins {
        // Grails Ant Plugin
        compile ":grails-ant:0.1.3"
    }

grails-app/conf/Config.groovy

    // ExtJS BootStrap Plugin
    extjs {
        version = '4.2.2'
    }

## Tips for Git users ##

.gitignore

    /web-app/extjs
