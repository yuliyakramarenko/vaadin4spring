/*
 * Copyright 2015 The original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.spring.samples.mvp.ui.component.grid;

import java.util.List;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Table;

/**
 * An empty grid
 * @author Chris Phillipson (fastnsilver@gmail.com)
 *
 */
class EmptyGrid extends DataGrid<Void, Table> {

    private static final long serialVersionUID = -1048597713538645459L;

    @Override
    protected void defineColumns(List<Void> data) {

    }

    @Override
    protected void defineFieldPresentation() {

    }

    @Override
    protected void defineTableProperties() {

    }

    @Override
    protected void insertData(List<Void> data) {

    }

    @Override
    protected void addControls() {

    }

    @Override
    public void enter(ViewChangeEvent event) {

    }

}
