/*
 * Materialize - Materialize all those not material
 * Copyright (C) 2015  XiNGRZ <xxx@oxo.ooo>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.gedoor.mkiconapk.util;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class SoftInputManager {

    private final View view;
    private final InputMethodManager imm;

    private SoftInputManager(View view, InputMethodManager imm) {
        this.view = view;
        this.imm = imm;
    }

    public static SoftInputManager from(View view) {
        return new SoftInputManager(view,
                (InputMethodManager) view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE));
    }

    public void show() {
        imm.showSoftInput(view, 0);
    }

    public void hide() {
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

}
