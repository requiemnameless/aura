/*
 * Copyright (C) 2013 salesforce.com, inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.auraframework.instance;

import org.auraframework.def.BaseComponentDef;
import org.auraframework.throwable.quickfix.QuickFixException;

/**
 */
public interface BaseComponent<D extends BaseComponentDef, I extends BaseComponent<?, ?>> extends Instance<D>,
        ValueProvider {

    /**
     * @return The generated globally unique id of this component
     */
    String getGlobalId();

    /**
     * @return The user provided locally unique id of this component
     */
    String getLocalId();

    AttributeSet getAttributes();

    void index(Component component);

    I getSuper();

    boolean hasLocalDependencies();

    /**
     * @return instance of the model if any, tied to the component
     */
    Model getModel();

    void reinitializeModel() throws QuickFixException;
}
