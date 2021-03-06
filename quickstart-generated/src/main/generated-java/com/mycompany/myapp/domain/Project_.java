/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Source code: https://github.com/jaxio/celerio/
 * Follow us on twitter: @jaxiosoft
 * This header can be customized in Celerio conf...
 * Template pack-angular:src/main/java/domain/EntityMeta_.java.e.vm
 */
package com.mycompany.myapp.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Project.class)
public abstract class Project_ {

    // Raw attributes
    public static volatile SingularAttribute<Project, Integer> id;
    public static volatile SingularAttribute<Project, String> name;
    public static volatile SingularAttribute<Project, String> url;
    public static volatile SingularAttribute<Project, Boolean> openSource;

    // Many to one
    public static volatile SingularAttribute<Project, Author> author;
}