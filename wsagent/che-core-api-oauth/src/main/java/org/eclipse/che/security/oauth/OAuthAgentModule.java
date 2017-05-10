/*******************************************************************************
 * Copyright (c) 2012-2017 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.security.oauth;

import com.google.inject.AbstractModule;

import org.eclipse.che.security.oauth.shared.OAuthAuthorizationHeaderProvider;
import org.eclipse.che.security.oauth.shared.OAuthTokenProvider;
import org.eclipse.che.security.oauth.oauth1.RemoteOAuthAuthorizationHeaderProvider;

/**
 * Represent single guice module
 * that bind classes to get out tokens from workspace agent.
 *
 * @author Sergii Kabashniuk
 */
public class OAuthAgentModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(OAuthTokenProvider.class).to(RemoteOAuthTokenProvider.class);
        bind(OAuthAuthorizationHeaderProvider.class).to(RemoteOAuthAuthorizationHeaderProvider.class);
    }
}