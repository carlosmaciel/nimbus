/*
 * Copyright 1999-2008 University of Chicago
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.globus.workspace.common.print;

public class ProxyErrPrintStream extends ProxyPrintStream {

    public ProxyErrPrintStream(Print print) {
        super(print);
    }

    public void println() {
        this.pr.errln("");
    }

    public void print(Object obj) {
        this.pr.err(String.valueOf(obj));
    }

    public void println(Object x) {
        this.pr.errln(String.valueOf(x));
    }

    public void print(String s) {
        this.pr.err(s);
    }

    public void println(String x) {
        this.pr.errln(x);
    }
}
