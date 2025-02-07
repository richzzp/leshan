/*******************************************************************************
 * Copyright (c) 2013-2015 Sierra Wireless and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 * 
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *    http://www.eclipse.org/org/documents/edl-v10.html.
 * 
 * Contributors:
 *     Sierra Wireless - initial API and implementation
 *******************************************************************************/
package org.eclipse.leshan.core.request;

/**
 * A visitor to visit an Uplink Lightweight M2M request.
 */
public interface UplinkRequestVisitor {
    void visit(AlarmRequest request);

    void visit(RegisterRequest request);

    void visit(UpdateRequest request);

    void visit(DeregisterRequest request);

    void visit(BootstrapRequest request);
}
