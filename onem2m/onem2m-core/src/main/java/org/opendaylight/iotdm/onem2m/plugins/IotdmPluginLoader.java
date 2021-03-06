/*
 * Copyright (c) 2016 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.iotdm.onem2m.plugins;

/**
 * Interface defines general PluginLoader methods.
 */
public interface IotdmPluginLoader {

    /**
     * Returns unique PluginLoader instance name.
     * @return PluginLoader instance name
     */
    String getLoaderName();

    /**
     * Checks whether the IotdmPluginCommonInterface instance has been loaded by the PluginLoader.
     * @param plugin IotdmPluginCommonInterface instance.
     * @return True if the plugin has been loaded by this PluginLoader, False if not.
     */
    boolean hasLoadedPlugin(IotdmPluginCommonInterface plugin);
}
