/**
 * This file is part of ObjectFabric (http://objectfabric.org).
 *
 * ObjectFabric is licensed under the Apache License, Version 2.0, the terms
 * of which may be found at http://www.apache.org/licenses/LICENSE-2.0.html.
 * 
 * Copyright ObjectFabric Inc.
 * 
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 * WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 */

package org.objectfabric.generated;

import org.objectfabric.Closure;
import org.objectfabric.IndexListener;
import org.objectfabric.Internal;
import org.objectfabric.JSResource;
import org.objectfabric.Resource;
import org.objectfabric.TArrayShort;
import org.timepedia.exporter.client.Export;
import org.timepedia.exporter.client.ExportPackage;
import org.timepedia.exporter.client.Exportable;
import org.timepedia.exporter.client.NoExport;

//==============================================================================
//
//THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                        
//
//==============================================================================

@SuppressWarnings("unchecked")
@Export("TArrayShort")
@ExportPackage("of")
public class JSArrayShort implements Exportable {

    // TODO back with JS typed arrays?
    public static final class ArrayInternal extends TArrayShort implements Internal {

        JSArrayShort _js;

        public ArrayInternal(Resource resource, int length) {
            super(resource, length);
        }

        @Override
        public Exportable getOrCreateJS() {
            if (_js == null) {
                _js = new JSArrayShort();
                _js._internal = this;
            }

            return _js;
        }
    }

    private ArrayInternal _internal;

    public JSArrayShort(JSResource resource, int length) {
        _internal = new ArrayInternal(resource.internal(), length);
    }

    @NoExport
    public JSArrayShort() {
    }

    public short get(int index) {
        return _internal.get(index);
    }

    public int length() {
        return _internal.length();
    }

    public void set(int index, short value) {
        _internal.set(index, value);
    }

    public void onset(final Closure closure) {
        _internal.addListener(new IndexListener() {

            @Override
            public void onSet(int index) {
                closure.runImmutable(index);
            }
        });
    }
}
