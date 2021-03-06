/*
 * Copyright 2011 Axis Data Management Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.admc.jcreole;

import beaver.Symbol;

/**
 * A Parser token specifically marked as being HTML-safe.
 *
 * @author Blaine Simpson (blaine dot simpson at admc dot com)
 * @since 1.0
 */
class WashedSymbol extends Token {
    private String cleanString;

    public WashedSymbol(String s) {
        cleanString = s;
    }

    protected WashedSymbol() {
        // Intentionally empty
    }

    /**
     * @throws if the symbol already has a cleanString.
     */
    public void setCleanString(String s) {
        if (cleanString != null)
            throw new IllegalStateException(
                    "WashedSymbol already has content '" + cleanString
                    + "', but there was an attempt to change it to: " + s);
        cleanString = s;
    }

    public String toString() {
        return (cleanString == null) ? "" : cleanString;
    }
}
