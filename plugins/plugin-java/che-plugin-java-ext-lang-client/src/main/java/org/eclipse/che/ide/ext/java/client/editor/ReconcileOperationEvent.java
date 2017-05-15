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
package org.eclipse.che.ide.ext.java.client.editor;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

import org.eclipse.che.ide.ext.java.shared.dto.ReconcileResult;

/**
 *
 * @author Roman Nikitenko
 */
public class ReconcileOperationEvent extends GwtEvent<ReconcileOperationEvent.ReconcileOperationHandler> {

    public static Type<ReconcileOperationHandler> TYPE = new Type<>();
    private ReconcileResult reconcileResult;

    /**
     *
     * @param reconcileResult
     *
     */
    public ReconcileOperationEvent(ReconcileResult reconcileResult) {
        this.reconcileResult = reconcileResult;
    }

    @Override
    public Type<ReconcileOperationHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ReconcileOperationHandler handler) {
        handler.onReconcileOperation(reconcileResult);
    }

    /** Apples result of reconcile operation */
    public interface ReconcileOperationHandler extends EventHandler {
        void onReconcileOperation(ReconcileResult reconcileResult);
    }
}
