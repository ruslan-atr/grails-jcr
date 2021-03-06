/*
 * Copyright 2006-2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.codehaus.groovy.grails.plugins.jcr.exceptions;

import org.codehaus.groovy.grails.exceptions.GrailsException;

/**
 * An exception that wraps the checked JCR RepositoryException in a runtime one.
 *
 * @author Graeme Rocher
 * @since 0.4
 *        <p/>
 *        Created: Feb 12, 2007
 *        Time: 10:51:33 AM
 */
public class GrailsRepositoryException extends GrailsException {

    public GrailsRepositoryException(String arg0) {
        super(arg0);
    }

    public GrailsRepositoryException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public GrailsRepositoryException(Throwable arg0) {
        super(arg0);    
    }
}
