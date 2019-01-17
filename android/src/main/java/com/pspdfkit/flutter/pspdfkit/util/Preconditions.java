/*
 *   Copyright © 2018-2019 PSPDFKit GmbH. All rights reserved.
 *
 *   THIS SOURCE CODE AND ANY ACCOMPANYING DOCUMENTATION ARE PROTECTED BY INTERNATIONAL COPYRIGHT LAW
 *   AND MAY NOT BE RESOLD OR REDISTRIBUTED. USAGE IS BOUND TO THE PSPDFKIT LICENSE AGREEMENT.
 *   UNAUTHORIZED REPRODUCTION OR DISTRIBUTION IS SUBJECT TO CIVIL AND CRIMINAL PENALTIES.
 *   This notice may not be removed from this file.
 */
package com.pspdfkit.flutter.pspdfkit.util;

import androidx.annotation.Nullable;

public class Preconditions {
    /**
     * Checks that the given <code>string</code> is not null and not empty,
     * or throws an {@link IllegalArgumentException} with the provided <code>readableName</code>.
     * @return Returns the original <code>string</code>.
     */
    public static String requireNotNullNotEmpty(@Nullable String string, @Nullable String readableName) {
        if (string == null) throw new IllegalArgumentException(String.format("%s may not be null.", readableName));
        if (string.isEmpty()) throw new IllegalArgumentException(String.format("%s may not be empty.", readableName));
        return string;
    }
}
