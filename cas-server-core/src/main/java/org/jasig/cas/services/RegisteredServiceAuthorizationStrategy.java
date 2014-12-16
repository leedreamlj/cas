/*
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.cas.services;

import org.jasig.cas.authentication.principal.Service;

import java.util.Map;

/**
 * This is {@link org.jasig.cas.services.RegisteredServiceAuthorizationStrategy}
 * that can decide if a service is recognized and authorized to participate
 * in the CAS protocol flow during authentication/validation events.
 *
 * @author Misagh Moayyed mmoayyed@unicon.net
 * @since 4.1
 */
public interface RegisteredServiceAuthorizationStrategy {

    /**
     * Verify authorization policy by checking the pre-configured rules
     * that may depend on what the principal might be carrying.
     *
     * @param principalAttributes the principal attributes
     * @param service the service that requests authentication or has asked for tickets.
     * @throws UnauthorizedServiceException if the service is not allowed to proceed.
     */
    void verifyAuthorizationPolicy(Map<String, Object> principalAttributes, Service service) throws UnauthorizedServiceException;
}
