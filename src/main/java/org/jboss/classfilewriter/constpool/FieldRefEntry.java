/*
 * JBoss, Home of Professional Open Source.
 *
 * Copyright 2012 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.classfilewriter.constpool;

import java.io.DataOutputStream;
import java.io.IOException;

public class FieldRefEntry extends ConstPoolEntry {

    private final int classIndex;
    private final int nameAndTypeIndex;

    public FieldRefEntry(int classIndex, int nameAndTypeIndex) {
        this.classIndex = classIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    @Override
    public ConstPoolEntryType getType() {
        return ConstPoolEntryType.FIELDREF;
    }

    @Override
    public void writeData(DataOutputStream stream) throws IOException {
        stream.writeShort(classIndex);
        stream.writeShort(nameAndTypeIndex);
    }

}
