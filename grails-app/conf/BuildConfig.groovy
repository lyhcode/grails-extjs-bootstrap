grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

    inherits 'global'
    log 'warn'

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        // Apache Ant
        compile 'org.apache.ant:ant:1.7.1'    //you can also use runtime
        compile 'org.apache.ant:ant-launcher:1.7.1'
    }

    plugins {
        build ':release:2.2.1', ':rest-client-builder:1.0.3', {
            export = false
        }

        compile ":grails-ant:0.1.3", {
            exclude 'svn'
        }
    }
}
