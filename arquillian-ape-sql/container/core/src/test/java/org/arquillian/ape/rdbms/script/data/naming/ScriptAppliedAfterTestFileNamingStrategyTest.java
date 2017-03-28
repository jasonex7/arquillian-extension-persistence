/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.arquillian.ape.rdbms.script.data.naming;

import org.arquillian.ape.rdbms.testutils.DummyClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScriptAppliedAfterTestFileNamingStrategyTest {

    @Test
    public void should_create_default_file_name_for_script_applied_after_test_using_full_class_name_and_method_name() throws Exception {
        // given
        PrefixedScriptFileNamingStrategy fileNamingStrategy = new PrefixedScriptFileNamingStrategy("after-", "sql");

        // when
        String fileName = fileNamingStrategy.createFileName(DummyClass.class, DummyClass.class.getMethod("shouldPass"));

        // then
        assertThat(fileName).isEqualTo("after-org.arquillian.ape.rdbms.testutils.DummyClass#shouldPass.sql");
    }

    @Test
    public void should_produce_default_file_name_for_script_applied_after_test_using_full_class_name_and_method_name() throws Exception {
        // given
        PrefixedScriptFileNamingStrategy fileNamingStrategy = new PrefixedScriptFileNamingStrategy("after-", "sql");

        // when
        String fileName = fileNamingStrategy.createFileName(DummyClass.class, DummyClass.class.getMethod("shouldPass"));

        // then
        assertThat(fileName).isEqualTo("after-org.arquillian.ape.rdbms.testutils.DummyClass#shouldPass.sql");
    }

}
